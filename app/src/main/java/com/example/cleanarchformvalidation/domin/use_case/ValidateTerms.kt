package com.example.cleanarchformvalidation.domin.use_case

import android.util.Patterns

class ValidateTerms {

    fun execute(acceptedTerms: Boolean): ValidationResult {
        if(!acceptedTerms) {
          return ValidationResult(
              successful = false,
              errorMessage = "Please accept the terms"
          )
        }

        return ValidationResult(
            successful = true
        )
    }
}