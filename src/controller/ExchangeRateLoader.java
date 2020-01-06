/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author juanf
 */
import model.Currency;
import model.ExchangeRate;

public interface ExchangeRateLoader {
    ExchangeRate load(Currency currency);
}