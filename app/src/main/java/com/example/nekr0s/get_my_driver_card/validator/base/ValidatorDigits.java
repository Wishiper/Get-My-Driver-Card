package com.example.nekr0s.get_my_driver_card.validator.base;

import com.example.nekr0s.get_my_driver_card.utils.enums.ErrorCode;

public interface ValidatorDigits {

    ErrorCode isPersonalNumberValid(String input);

    ErrorCode isPhoneNumberValid(String input);

    ErrorCode isTachNumberValid(String input);

    ErrorCode isLicenseNumberValid(String input);

}
