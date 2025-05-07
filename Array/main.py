import requests

API_KEY = "1305a3d5074e398d143807afff9362e6"  # Replace with your actual key
numbers = [
    "12523733215", "12523733845", "12523734875",
    "12622639954", "12692639923", "12692853922",
    "12785934129"
]

for number in numbers:
    response = requests.get(
        f"http://apilayer.net/api/validate",
        params={
            "access_key": API_KEY,
            "number": number,
            "country_code": "US",
            "format": 1
        }
    )
    data = response.json()
    print(f"Number: {number}")
    print(f"  Valid: {data.get('valid')}")
    print(f"  Line Type: {data.get('line_type')}")
    print(f"  Carrier: {data.get('carrier')}")
    print("-" * 40)
