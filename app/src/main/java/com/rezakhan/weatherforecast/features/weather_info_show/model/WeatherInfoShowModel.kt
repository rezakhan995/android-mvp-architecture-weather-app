package com.rezakhan.weatherforecast.features.weather_info_show.model

import com.rezakhan.weatherforecast.common.RequestCompleteListener
import com.rezakhan.weatherforecast.features.weather_info_show.model.data_class.City
import com.rezakhan.weatherforecast.features.weather_info_show.model.data_class.WeatherInfoResponse

interface WeatherInfoShowModel {
    fun getCityList(callback: RequestCompleteListener<MutableList<City>>)
    fun getWeatherInformation(cityId: Int, callback: RequestCompleteListener<WeatherInfoResponse>)
}