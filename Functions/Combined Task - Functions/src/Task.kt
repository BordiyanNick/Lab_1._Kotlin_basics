// 1. Single-expression function with default parameters
fun formatUser(
    login: String,
    domain: String = "example.com",
    isActive: Boolean = true
) = "[$login@$domain] - Active: $isActive"

fun testUser(): String {
    // 2. Calling with named arguments, skipping 'domain'
    return formatUser("admin", isActive = false)
}