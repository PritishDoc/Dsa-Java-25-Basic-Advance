from flask import Flask, request, jsonify, render_template
import random

app = Flask(__name__)

# Example area codes by state (extend this as needed)
STATE_AREA_CODES = {
    "California": ["209", "213", "310", "415"],
    "New York": ["212", "315", "516"],
    "Texas": ["210", "214", "512", "713"],
    "Florida": ["305", "321", "407", "561"]
}

# Toll-free prefixes in the US
TOLL_FREE_PREFIXES = ["800", "888", "877", "866", "855", "844", "833", "822"]

def generate_phone_number(prefix):
    # Generate a 7-digit random number string
    suffix = ''.join([str(random.randint(0, 9)) for _ in range(7)])
    return f"{prefix}-{suffix[:3]}-{suffix[3:]}"

@app.route('/')
def home():
    return render_template('index.html', states=STATE_AREA_CODES.keys())

@app.route('/generate', methods=['POST'])
def generate():
    data = request.json
    num_type = data.get('type')
    state = data.get('state')

    if num_type == 'toll-free':
        prefix = random.choice(TOLL_FREE_PREFIXES)
    elif num_type == 'private' and state in STATE_AREA_CODES:
        prefix = random.choice(STATE_AREA_CODES[state])
    else:
        return jsonify({'error': 'Invalid request'}), 400

    phone_number = generate_phone_number(prefix)
    return jsonify({
        'generated_number': phone_number,
        'type': num_type,
        'state': state
    })

if __name__ == '__main__':
    app.run(debug=True)