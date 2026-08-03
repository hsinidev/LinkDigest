# LinkDigest — Skills & Architecture Guide

## Core Skills

### URL Content Extraction
```kotlin
// Jsoup article scraper
val doc = Jsoup.connect(url)
    .userAgent("Mozilla/5.0")
    .timeout(10_000)
    .get()
val articleText = doc.select("article, .post-content, .entry-content, main p")
    .joinToString("\n") { it.text() }
    .take(6000) // GPT token limit safety
```

### Android Share Target (receive links from Chrome)
```xml
<!-- AndroidManifest.xml -->
<activity android:name=".ShareReceiverActivity">
    <intent-filter>
        <action android:name="android.intent.action.SEND"/>
        <category android:name="android.intent.category.DEFAULT"/>
        <data android:mimeType="text/plain"/>
    </intent-filter>
</activity>
```

### Profession-Aware Summary Card
```kotlin
// Generate share card as Bitmap using Canvas
fun generateShareCard(summary: Summary): Bitmap {
    val bitmap = Bitmap.createBitmap(1080, 720, Bitmap.Config.ARGB_8888)
    val canvas = Canvas(bitmap)
    // Draw title, 3 points, app branding
    return bitmap
}
```

## Play Store Listing
- Category: News / Productivity
- Short Description: "Summarize any article or video in 3 bullet points"
- Content Rating: Everyone
- Keywords: article summary, AI reader, TLDR, URL summarizer, read later
