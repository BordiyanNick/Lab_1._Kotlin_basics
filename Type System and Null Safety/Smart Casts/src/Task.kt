fun toUpperCaseSafe(text: String?): String {
    if (text != null) {
        // Kotlin smart-casts 'text' to String here
        return text.uppercase()
    } else {
        return "EMPTY"
    }
}