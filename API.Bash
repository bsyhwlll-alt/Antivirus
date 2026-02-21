curl -X PATCH \
  "https://management.azure.com/subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.CognitiveServices/quotaTiers/default?api-version=2025-10-01-preview" \
  -H "Authorization: Bearer <YOUR_ACCESS_TOKEN>" \
  -H "Content-Type: application/json" \
  -d '{
    "properties": {
      "tierUpgradePolicy": "NoAutoUpgrade"
    }
  }'
