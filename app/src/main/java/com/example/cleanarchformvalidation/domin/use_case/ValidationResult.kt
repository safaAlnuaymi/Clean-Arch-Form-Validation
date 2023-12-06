package com.example.cleanarchformvalidation.domin.use_case

data class ValidationResult(
    val successful: Boolean,
    val errorMessage: String? = null,
)
