package com.accenture.covidassessment.mock

import com.accenture.covidassessment.api.Covid19api
import com.accenture.covidassessment.dto.RegionCasesInfo
import com.accenture.covidassessment.dto.RegionVaccinesInfo
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import mu.KotlinLogging
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

private val logger = KotlinLogging.logger {}

@Service
@Profile("mock")
class Covid19ClientMock(
    val objectMapper: ObjectMapper,
): Covid19api {
    override fun cases(
        country: String?,
        ab: String?,
        continent: String?
    ): Map<String, Map<String, RegionCasesInfo>> {
        logger.debug { "Mock data for \"cases\" method used" }
        return objectMapper.readValue(casesResponseMock)
    }

    override fun vaccines(
        country: String?,
        ab: String?,
        continent: String?
    ): Map<String, Map<String, RegionVaccinesInfo>> {
        logger.debug { "Mock data for \"vaccines\" method used" }
        return objectMapper.readValue(vaccinesResponseMock)
    }
}

private val casesResponseMock = """
{
  "Afghanistan": {
    "All": {
      "confirmed": 179017,
      "recovered": 0,
      "deaths": 7685,
      "country": "Afghanistan",
      "population": 35530081,
      "sq_km_area": 652090,
      "life_expectancy": "45.9",
      "elevation_in_meters": null,
      "continent": "Asia",
      "abbreviation": "AF",
      "location": "Southern and Central Asia",
      "iso": 4,
      "capital_city": "Kabul",
      "lat": "33.93911",
      "long": "67.709953",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Albania": {
    "All": {
      "confirmed": 275416,
      "recovered": 0,
      "deaths": 3497,
      "country": "Albania",
      "population": 2930187,
      "sq_km_area": 28748,
      "life_expectancy": "71.6",
      "elevation_in_meters": null,
      "continent": "Europe",
      "abbreviation": "AL",
      "location": "Southern Europe",
      "iso": 8,
      "capital_city": "Tirana",
      "lat": "41.1533",
      "long": "20.1683",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Algeria": {
    "All": {
      "confirmed": 265804,
      "recovered": 0,
      "deaths": 6875,
      "country": "Algeria",
      "population": 41318142,
      "sq_km_area": 2381741,
      "life_expectancy": "69.7",
      "elevation_in_meters": 800,
      "continent": "Africa",
      "abbreviation": "DZ",
      "location": "Northern Africa",
      "iso": 12,
      "capital_city": "Alger",
      "lat": "28.0339",
      "long": "1.6596",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Andorra": {
    "All": {
      "confirmed": 41717,
      "recovered": 0,
      "deaths": 153,
      "country": "Andorra",
      "population": 76965,
      "sq_km_area": 468,
      "life_expectancy": "83.5",
      "elevation_in_meters": "1,996",
      "continent": "Europe",
      "abbreviation": "AD",
      "location": "Southern Europe",
      "iso": 20,
      "capital_city": "Andorra la Vella",
      "lat": "42.5063",
      "long": "1.5218",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Angola": {
    "All": {
      "confirmed": 99287,
      "recovered": 0,
      "deaths": 1900,
      "country": "Angola",
      "population": 29784193,
      "sq_km_area": 1246700,
      "life_expectancy": "38.3",
      "elevation_in_meters": "1,112",
      "continent": "Africa",
      "abbreviation": "AO",
      "location": "Central Africa",
      "iso": 24,
      "capital_city": "Luanda",
      "lat": "-11.2027",
      "long": "17.8739",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Antarctica": {
    "All": {
      "confirmed": 11,
      "recovered": 0,
      "deaths": 0,
      "country": "Antarctica",
      "population": null,
      "sq_km_area": 13120000,
      "life_expectancy": null,
      "elevation_in_meters": "2,300",
      "continent": "Antarctica",
      "abbreviation": "AQ",
      "location": "Antarctica",
      "iso": 10,
      "capital_city": null,
      "lat": "-71.9499",
      "long": "23.347",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Antigua and Barbuda": {
    "All": {
      "confirmed": 7663,
      "recovered": 0,
      "deaths": 137,
      "country": "Antigua and Barbuda",
      "population": 102012,
      "sq_km_area": 442,
      "life_expectancy": "70.5",
      "elevation_in_meters": null,
      "continent": "North America",
      "abbreviation": "AG",
      "location": "Caribbean",
      "iso": 28,
      "capital_city": "Saint John's",
      "lat": "17.0608",
      "long": "-61.7964",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Argentina": {
    "All": {
      "confirmed": 9101319,
      "recovered": 0,
      "deaths": 128729,
      "country": "Argentina",
      "population": 44271041,
      "sq_km_area": 2780400,
      "life_expectancy": "75.1",
      "elevation_in_meters": 595,
      "continent": "South America",
      "abbreviation": "AR",
      "location": "South America",
      "iso": 32,
      "capital_city": "Buenos Aires",
      "lat": "-38.4161",
      "long": "-63.6167",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Armenia": {
    "All": {
      "confirmed": 422896,
      "recovered": 0,
      "deaths": 8623,
      "country": "Armenia",
      "population": 2930450,
      "sq_km_area": 29800,
      "life_expectancy": "66.4",
      "elevation_in_meters": "1,792",
      "continent": "Asia",
      "abbreviation": "AM",
      "location": "Middle East",
      "iso": 51,
      "capital_city": "Yerevan",
      "lat": "40.0691",
      "long": "45.0382",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Australia": {
    "All": {
      "confirmed": 6392018,
      "recovered": 0,
      "deaths": 7616,
      "country": "Australia",
      "population": 24450561,
      "sq_km_area": 7741220,
      "life_expectancy": "79.8",
      "elevation_in_meters": 330,
      "continent": "Oceania",
      "abbreviation": "AU",
      "location": "Australia and New Zealand",
      "iso": 36,
      "capital_city": "Canberra"
    },
    "Australian Capital Territory": {
      "lat": "-35.4735",
      "long": "149.0124",
      "confirmed": 114564,
      "recovered": 0,
      "deaths": 58,
      "updated": "2022-05-11 04:20:48"
    },
    "New South Wales": {
      "lat": "-33.8688",
      "long": "151.2093",
      "confirmed": 2395359,
      "recovered": 0,
      "deaths": 2907,
      "updated": "2022-05-11 04:20:48"
    },
    "Northern Territory": {
      "lat": "-12.4634",
      "long": "130.8456",
      "confirmed": 66760,
      "recovered": 0,
      "deaths": 45,
      "updated": "2022-05-11 04:20:48"
    },
    "Queensland": {
      "lat": "-27.4698",
      "long": "153.0251",
      "confirmed": 1060169,
      "recovered": 0,
      "deaths": 918,
      "updated": "2022-05-11 04:20:48"
    },
    "South Australia": {
      "lat": "-34.9285",
      "long": "138.6007",
      "confirmed": 444522,
      "recovered": 0,
      "deaths": 386,
      "updated": "2022-05-11 04:20:48"
    },
    "Tasmania": {
      "lat": "-42.8821",
      "long": "147.3272",
      "confirmed": 146212,
      "recovered": 0,
      "deaths": 60,
      "updated": "2022-05-11 04:20:48"
    },
    "Victoria": {
      "lat": "-37.8136",
      "long": "144.9631",
      "confirmed": 1673533,
      "recovered": 0,
      "deaths": 3069,
      "updated": "2022-05-11 04:20:48"
    },
    "Western Australia": {
      "lat": "-31.9505",
      "long": "115.8605",
      "confirmed": 490899,
      "recovered": 0,
      "deaths": 173,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Austria": {
    "All": {
      "confirmed": 4189700,
      "recovered": 0,
      "deaths": 18271,
      "country": "Austria",
      "population": 8735453,
      "sq_km_area": 83859,
      "life_expectancy": "77.7",
      "elevation_in_meters": 910,
      "continent": "Europe",
      "abbreviation": "AT",
      "location": "Western Europe",
      "iso": 40,
      "capital_city": "Wien",
      "lat": "47.5162",
      "long": "14.5501",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Azerbaijan": {
    "All": {
      "confirmed": 792638,
      "recovered": 0,
      "deaths": 9709,
      "country": "Azerbaijan",
      "population": 9827589,
      "sq_km_area": 86600,
      "life_expectancy": "62.9",
      "elevation_in_meters": 384,
      "continent": "Asia",
      "abbreviation": "AZ",
      "location": "Middle East",
      "iso": 31,
      "capital_city": "Baku",
      "lat": "40.1431",
      "long": "47.5769",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Bahamas": {
    "All": {
      "confirmed": 33779,
      "recovered": 0,
      "deaths": 798,
      "country": "Bahamas",
      "population": 395361,
      "sq_km_area": 13878,
      "life_expectancy": "71.1",
      "elevation_in_meters": null,
      "continent": "North America",
      "abbreviation": "BS",
      "location": "Caribbean",
      "iso": 44,
      "capital_city": "Nassau",
      "lat": "25.025885",
      "long": "-78.035889",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Bahrain": {
    "All": {
      "confirmed": 574401,
      "recovered": 0,
      "deaths": 1477,
      "country": "Bahrain",
      "population": 1492584,
      "sq_km_area": 694,
      "life_expectancy": 73,
      "elevation_in_meters": null,
      "continent": "Asia",
      "abbreviation": "BH",
      "location": "Middle East",
      "iso": 48,
      "capital_city": "al-Manama",
      "lat": "26.0275",
      "long": "50.55",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Bangladesh": {
    "All": {
      "confirmed": 1952855,
      "recovered": 0,
      "deaths": 29127,
      "country": "Bangladesh",
      "population": 164669751,
      "sq_km_area": 143998,
      "life_expectancy": "60.2",
      "elevation_in_meters": 85,
      "continent": "Asia",
      "abbreviation": "BD",
      "location": "Southern and Central Asia",
      "iso": 50,
      "capital_city": "Dhaka",
      "lat": "23.685",
      "long": "90.3563",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Barbados": {
    "All": {
      "confirmed": 74454,
      "recovered": 0,
      "deaths": 430,
      "country": "Barbados",
      "population": 285719,
      "sq_km_area": 430,
      "life_expectancy": 73,
      "elevation_in_meters": null,
      "continent": "North America",
      "abbreviation": "BB",
      "location": "Caribbean",
      "iso": 52,
      "capital_city": "Bridgetown",
      "lat": "13.1939",
      "long": "-59.5432",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Belarus": {
    "All": {
      "confirmed": 982867,
      "recovered": 0,
      "deaths": 6978,
      "country": "Belarus",
      "population": 9468338,
      "sq_km_area": 207600,
      "life_expectancy": 68,
      "elevation_in_meters": 160,
      "continent": "Europe",
      "abbreviation": "BY",
      "location": "Eastern Europe",
      "iso": 112,
      "capital_city": "Minsk",
      "lat": "53.7098",
      "long": "27.9534",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Belgium": {
    "All": {
      "confirmed": 4102082,
      "recovered": 0,
      "deaths": 31580,
      "country": "Belgium",
      "population": 11429336,
      "sq_km_area": 30518,
      "life_expectancy": "77.8",
      "elevation_in_meters": 181,
      "continent": "Europe",
      "abbreviation": "BE",
      "location": "Western Europe",
      "iso": 56,
      "capital_city": "Bruxelles [Brussel]"
    },
    "Antwerp": {
      "lat": "51.2195",
      "long": "4.4024",
      "confirmed": 655778,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Brussels": {
      "lat": "50.8503",
      "long": "4.3517",
      "confirmed": 447302,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "East Flanders": {
      "lat": "51.0362",
      "long": "3.7373",
      "confirmed": 547431,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Flemish Brabant": {
      "lat": "50.9167",
      "long": "4.5833",
      "confirmed": 395646,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Hainaut": {
      "lat": "50.5257",
      "long": "4.0621",
      "confirmed": 454062,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Liege": {
      "lat": "50.4496",
      "long": "5.8492",
      "confirmed": 373777,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Limburg": {
      "lat": "50.9739",
      "long": "5.342",
      "confirmed": 304848,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Luxembourg": {
      "lat": "50.0547",
      "long": "5.4677",
      "confirmed": 106558,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Namur": {
      "lat": "50.331",
      "long": "4.8221",
      "confirmed": 176668,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Unknown": {
      "lat": "",
      "long": "",
      "confirmed": 56332,
      "recovered": 0,
      "deaths": 31580,
      "updated": "2022-05-11 04:20:48"
    },
    "Walloon Brabant": {
      "lat": "50.4",
      "long": "4.35",
      "confirmed": 149955,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "West Flanders": {
      "lat": "51.0536",
      "long": "3.1458",
      "confirmed": 433725,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Belize": {
    "All": {
      "confirmed": 57729,
      "recovered": 0,
      "deaths": 676,
      "country": "Belize",
      "population": 374681,
      "sq_km_area": 22696,
      "life_expectancy": "70.9",
      "elevation_in_meters": 173,
      "continent": "North America",
      "abbreviation": "BZ",
      "location": "Central America",
      "iso": 84,
      "capital_city": "Belmopan",
      "lat": "17.1899",
      "long": "-88.4976",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Benin": {
    "All": {
      "confirmed": 26952,
      "recovered": 0,
      "deaths": 163,
      "country": "Benin",
      "population": 11175692,
      "sq_km_area": 112622,
      "life_expectancy": "50.2",
      "elevation_in_meters": 273,
      "continent": "Africa",
      "abbreviation": "BJ",
      "location": "Western Africa",
      "iso": 204,
      "capital_city": "Porto-Novo",
      "lat": "9.3077",
      "long": "2.3158",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Bhutan": {
    "All": {
      "confirmed": 59530,
      "recovered": 0,
      "deaths": 21,
      "country": "Bhutan",
      "population": 807610,
      "sq_km_area": 47000,
      "life_expectancy": "52.4",
      "elevation_in_meters": "3,280",
      "continent": "Asia",
      "abbreviation": "BT",
      "location": "Southern and Central Asia",
      "iso": 64,
      "capital_city": "Thimphu",
      "lat": "27.5142",
      "long": "90.4336",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Bolivia": {
    "All": {
      "confirmed": 905530,
      "recovered": 0,
      "deaths": 21925,
      "country": "Bolivia",
      "population": 11051600,
      "sq_km_area": 1098581,
      "life_expectancy": "63.7",
      "elevation_in_meters": "1,192",
      "continent": "South America",
      "abbreviation": "BO",
      "location": "South America",
      "iso": 68,
      "capital_city": "La Paz",
      "lat": "-16.2902",
      "long": "-63.5887",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Bosnia and Herzegovina": {
    "All": {
      "confirmed": 377385,
      "recovered": 0,
      "deaths": 15773,
      "country": "Bosnia and Herzegovina",
      "population": 3507017,
      "sq_km_area": 51197,
      "life_expectancy": "71.5",
      "elevation_in_meters": 500,
      "continent": "Europe",
      "abbreviation": "BA",
      "location": "Southern Europe",
      "iso": 70,
      "capital_city": "Sarajevo",
      "lat": "43.9159",
      "long": "17.6791",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Botswana": {
    "All": {
      "confirmed": 306324,
      "recovered": 0,
      "deaths": 2690,
      "country": "Botswana",
      "population": 2291661,
      "sq_km_area": 581730,
      "life_expectancy": "39.3",
      "elevation_in_meters": "1,013",
      "continent": "Africa",
      "abbreviation": "BW",
      "location": "Southern Africa",
      "iso": 72,
      "capital_city": "Gaborone",
      "lat": "-22.3285",
      "long": "24.6849",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Brazil": {
    "All": {
      "confirmed": 30594388,
      "recovered": 0,
      "deaths": 664624,
      "country": "Brazil",
      "population": 209288278,
      "sq_km_area": 8547403,
      "life_expectancy": "62.9",
      "elevation_in_meters": 320,
      "continent": "South America",
      "abbreviation": "BR",
      "location": "South America",
      "iso": 76,
      "capital_city": "Brasília"
    },
    "Acre": {
      "lat": "-9.0238",
      "long": "-70.812",
      "confirmed": 124969,
      "recovered": 0,
      "deaths": 2002,
      "updated": "2022-05-11 04:20:48"
    },
    "Alagoas": {
      "lat": "-9.5713",
      "long": "-36.782",
      "confirmed": 298475,
      "recovered": 0,
      "deaths": 6933,
      "updated": "2022-05-11 04:20:48"
    },
    "Amapa": {
      "lat": "0.902",
      "long": "-52.003",
      "confirmed": 160401,
      "recovered": 0,
      "deaths": 2132,
      "updated": "2022-05-11 04:20:48"
    },
    "Amazonas": {
      "lat": "-3.4168",
      "long": "-65.8561",
      "confirmed": 582418,
      "recovered": 0,
      "deaths": 14172,
      "updated": "2022-05-11 04:20:48"
    },
    "Bahia": {
      "lat": "-12.5797",
      "long": "-41.7007",
      "confirmed": 1544882,
      "recovered": 0,
      "deaths": 29885,
      "updated": "2022-05-11 04:20:48"
    },
    "Ceara": {
      "lat": "-5.4984",
      "long": "-39.3206",
      "confirmed": 1244956,
      "recovered": 0,
      "deaths": 26960,
      "updated": "2022-05-11 04:20:48"
    },
    "Distrito Federal": {
      "lat": "-15.7998",
      "long": "-47.8645",
      "confirmed": 698009,
      "recovered": 0,
      "deaths": 11664,
      "updated": "2022-05-11 04:20:48"
    },
    "Espirito Santo": {
      "lat": "-19.1834",
      "long": "-40.3089",
      "confirmed": 1047786,
      "recovered": 0,
      "deaths": 14396,
      "updated": "2022-05-11 04:20:48"
    },
    "Goias": {
      "lat": "-15.827",
      "long": "-49.8362",
      "confirmed": 1338960,
      "recovered": 0,
      "deaths": 26544,
      "updated": "2022-05-11 04:20:48"
    },
    "Maranhao": {
      "lat": "-4.9609",
      "long": "-45.2744",
      "confirmed": 434732,
      "recovered": 0,
      "deaths": 10887,
      "updated": "2022-05-11 04:20:48"
    },
    "Mato Grosso": {
      "lat": "-12.6819",
      "long": "-56.9211",
      "confirmed": 729579,
      "recovered": 0,
      "deaths": 14854,
      "updated": "2022-05-11 04:20:48"
    },
    "Mato Grosso do Sul": {
      "lat": "-20.7722",
      "long": "-54.7852",
      "confirmed": 530325,
      "recovered": 0,
      "deaths": 10543,
      "updated": "2022-05-11 04:20:48"
    },
    "Minas Gerais": {
      "lat": "-18.5122",
      "long": "-44.555",
      "confirmed": 3364576,
      "recovered": 0,
      "deaths": 61391,
      "updated": "2022-05-11 04:20:48"
    },
    "Para": {
      "lat": "-1.9981",
      "long": "-54.9306",
      "confirmed": 769504,
      "recovered": 0,
      "deaths": 18307,
      "updated": "2022-05-11 04:20:48"
    },
    "Paraiba": {
      "lat": "-7.24",
      "long": "-36.782",
      "confirmed": 602966,
      "recovered": 0,
      "deaths": 10215,
      "updated": "2022-05-11 04:20:48"
    },
    "Parana": {
      "lat": "-25.2521",
      "long": "-52.0215",
      "confirmed": 2475309,
      "recovered": 0,
      "deaths": 43151,
      "updated": "2022-05-11 04:20:48"
    },
    "Pernambuco": {
      "lat": "-8.8137",
      "long": "-36.9541",
      "confirmed": 928421,
      "recovered": 0,
      "deaths": 21645,
      "updated": "2022-05-11 04:20:48"
    },
    "Piaui": {
      "lat": "-7.7183",
      "long": "-42.7289",
      "confirmed": 368046,
      "recovered": 0,
      "deaths": 7738,
      "updated": "2022-05-11 04:20:48"
    },
    "Rio Grande do Norte": {
      "lat": "-5.4026",
      "long": "-36.9541",
      "confirmed": 503862,
      "recovered": 0,
      "deaths": 8196,
      "updated": "2022-05-11 04:20:48"
    },
    "Rio Grande do Sul": {
      "lat": "-30.0346",
      "long": "-51.2177",
      "confirmed": 2358757,
      "recovered": 0,
      "deaths": 39340,
      "updated": "2022-05-11 04:20:48"
    },
    "Rio de Janeiro": {
      "lat": "-22.9068",
      "long": "-43.1729",
      "confirmed": 2155817,
      "recovered": 0,
      "deaths": 73603,
      "updated": "2022-05-11 04:20:48"
    },
    "Rondonia": {
      "lat": "-11.5057",
      "long": "-63.5806",
      "confirmed": 402620,
      "recovered": 0,
      "deaths": 7208,
      "updated": "2022-05-11 04:20:48"
    },
    "Roraima": {
      "lat": "-2.7376",
      "long": "-62.0751",
      "confirmed": 155533,
      "recovered": 0,
      "deaths": 2151,
      "updated": "2022-05-11 04:20:48"
    },
    "Santa Catarina": {
      "lat": "-27.2423",
      "long": "-50.2189",
      "confirmed": 1711721,
      "recovered": 0,
      "deaths": 21792,
      "updated": "2022-05-11 04:20:48"
    },
    "Sao Paulo": {
      "lat": "-23.5505",
      "long": "-46.6333",
      "confirmed": 5429696,
      "recovered": 0,
      "deaths": 168416,
      "updated": "2022-05-11 04:20:48"
    },
    "Sergipe": {
      "lat": "-10.5741",
      "long": "-37.3857",
      "confirmed": 327179,
      "recovered": 0,
      "deaths": 6345,
      "updated": "2022-05-11 04:20:48"
    },
    "Tocantins": {
      "lat": "-10.1753",
      "long": "-48.2982",
      "confirmed": 304889,
      "recovered": 0,
      "deaths": 4154,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Brunei": {
    "All": {
      "confirmed": 143372,
      "recovered": 0,
      "deaths": 219,
      "country": "Brunei",
      "population": 428697,
      "sq_km_area": 5765,
      "life_expectancy": "73.6",
      "elevation_in_meters": 478,
      "continent": "Asia",
      "abbreviation": "BN",
      "location": "Southeast Asia",
      "iso": 96,
      "capital_city": "Bandar Seri Begawan",
      "lat": "4.5353",
      "long": "114.7277",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Bulgaria": {
    "All": {
      "confirmed": 1160347,
      "recovered": 0,
      "deaths": 37007,
      "country": "Bulgaria",
      "population": 7084571,
      "sq_km_area": 110994,
      "life_expectancy": "70.9",
      "elevation_in_meters": 472,
      "continent": "Europe",
      "abbreviation": "BG",
      "location": "Eastern Europe",
      "iso": 100,
      "capital_city": "Sofia",
      "lat": "42.7339",
      "long": "25.4858",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Burkina Faso": {
    "All": {
      "confirmed": 20899,
      "recovered": 0,
      "deaths": 384,
      "country": "Burkina Faso",
      "population": 19193382,
      "sq_km_area": 274000,
      "life_expectancy": "46.7",
      "elevation_in_meters": 297,
      "continent": "Africa",
      "abbreviation": "BF",
      "location": "Western Africa",
      "iso": 854,
      "capital_city": "Ouagadougou",
      "lat": "12.2383",
      "long": "-1.5616",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Burma": {
    "All": {
      "confirmed": 613066,
      "recovered": 0,
      "deaths": 19434,
      "lat": "21.9162",
      "long": "95.956",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Burundi": {
    "All": {
      "confirmed": 41216,
      "recovered": 0,
      "deaths": 38,
      "country": "Burundi",
      "population": 10864245,
      "sq_km_area": 27834,
      "life_expectancy": "46.2",
      "elevation_in_meters": "1,504",
      "continent": "Africa",
      "abbreviation": "BI",
      "location": "Eastern Africa",
      "iso": 108,
      "capital_city": "Bujumbura",
      "lat": "-3.3731",
      "long": "29.9189",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Cabo Verde": {
    "All": {
      "confirmed": 56080,
      "recovered": 0,
      "deaths": 401,
      "lat": "16.5388",
      "long": "-23.0418",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Cambodia": {
    "All": {
      "confirmed": 136262,
      "recovered": 0,
      "deaths": 3056,
      "country": "Cambodia",
      "population": 16005373,
      "sq_km_area": 181035,
      "life_expectancy": "56.5",
      "elevation_in_meters": 126,
      "continent": "Asia",
      "abbreviation": "KH",
      "location": "Southeast Asia",
      "iso": 116,
      "capital_city": "Phnom Penh",
      "lat": "11.55",
      "long": "104.9167",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Cameroon": {
    "All": {
      "confirmed": 119780,
      "recovered": 0,
      "deaths": 1927,
      "country": "Cameroon",
      "population": 24053727,
      "sq_km_area": 475442,
      "life_expectancy": "54.8",
      "elevation_in_meters": 667,
      "continent": "Africa",
      "abbreviation": "CM",
      "location": "Central Africa",
      "iso": 120,
      "capital_city": "Yaound",
      "lat": "3.848",
      "long": "11.5021",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Canada": {
    "All": {
      "confirmed": 3814635,
      "recovered": 0,
      "deaths": 39891,
      "country": "Canada",
      "population": 36624199,
      "sq_km_area": 9970610,
      "life_expectancy": "79.4",
      "elevation_in_meters": 487,
      "continent": "North America",
      "abbreviation": "CA",
      "location": "North America",
      "iso": 124,
      "capital_city": "Ottawa"
    },
    "Alberta": {
      "lat": "53.9333",
      "long": "-116.5765",
      "confirmed": 570806,
      "recovered": 0,
      "deaths": 4321,
      "updated": "2022-05-11 04:20:48"
    },
    "British Columbia": {
      "lat": "53.7267",
      "long": "-127.6476",
      "confirmed": 365577,
      "recovered": 0,
      "deaths": 3226,
      "updated": "2022-05-11 04:20:48"
    },
    "Diamond Princess": {
      "lat": "",
      "long": "",
      "confirmed": 0,
      "recovered": 0,
      "deaths": 1,
      "updated": "2020-12-21 13:27:30"
    },
    "Grand Princess": {
      "lat": "",
      "long": "",
      "confirmed": 13,
      "recovered": 0,
      "deaths": 0,
      "updated": "2020-12-21 13:27:30"
    },
    "Manitoba": {
      "lat": "53.7609",
      "long": "-98.8139",
      "confirmed": 141973,
      "recovered": 0,
      "deaths": 1819,
      "updated": "2022-05-11 04:20:48"
    },
    "New Brunswick": {
      "lat": "46.5653",
      "long": "-66.4619",
      "confirmed": 62148,
      "recovered": 0,
      "deaths": 399,
      "updated": "2022-05-11 04:20:48"
    },
    "Newfoundland and Labrador": {
      "lat": "53.1355",
      "long": "-57.6604",
      "confirmed": 44892,
      "recovered": 0,
      "deaths": 169,
      "updated": "2022-05-11 04:20:48"
    },
    "Northwest Territories": {
      "lat": "64.8255",
      "long": "-124.8457",
      "confirmed": 11988,
      "recovered": 0,
      "deaths": 22,
      "updated": "2022-05-11 04:20:48"
    },
    "Nova Scotia": {
      "lat": "44.682",
      "long": "-63.7443",
      "confirmed": 89262,
      "recovered": 0,
      "deaths": 336,
      "updated": "2022-05-11 04:20:48"
    },
    "Nunavut": {
      "lat": "70.2998",
      "long": "-83.1076",
      "confirmed": 3531,
      "recovered": 0,
      "deaths": 7,
      "updated": "2022-05-11 04:20:48"
    },
    "Ontario": {
      "lat": "51.2538",
      "long": "-85.3232",
      "confirmed": 1293608,
      "recovered": 0,
      "deaths": 13039,
      "updated": "2022-05-11 04:20:48"
    },
    "Prince Edward Island": {
      "lat": "46.5107",
      "long": "-63.4168",
      "confirmed": 36332,
      "recovered": 0,
      "deaths": 26,
      "updated": "2022-05-11 04:20:48"
    },
    "Quebec": {
      "lat": "52.9399",
      "long": "-73.5491",
      "confirmed": 1053406,
      "recovered": 0,
      "deaths": 15178,
      "updated": "2022-05-11 04:20:48"
    },
    "Repatriated Travellers": {
      "lat": "",
      "long": "",
      "confirmed": 13,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Saskatchewan": {
      "lat": "52.9399",
      "long": "-106.4509",
      "confirmed": 136792,
      "recovered": 0,
      "deaths": 1323,
      "updated": "2022-05-11 04:20:48"
    },
    "Yukon": {
      "lat": "64.2823",
      "long": "-135.0",
      "confirmed": 4294,
      "recovered": 0,
      "deaths": 25,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Central African Republic": {
    "All": {
      "confirmed": 14649,
      "recovered": 0,
      "deaths": 113,
      "country": "Central African Republic",
      "population": 4659080,
      "sq_km_area": 622984,
      "life_expectancy": 44,
      "elevation_in_meters": 635,
      "continent": "Africa",
      "abbreviation": "CF",
      "location": "Central Africa",
      "iso": 140,
      "capital_city": "Bangui",
      "lat": "6.6111",
      "long": "20.9394",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Chad": {
    "All": {
      "confirmed": 7414,
      "recovered": 0,
      "deaths": 193,
      "country": "Chad",
      "population": 14899994,
      "sq_km_area": 1284000,
      "life_expectancy": "50.5",
      "elevation_in_meters": 543,
      "continent": "Africa",
      "abbreviation": "TD",
      "location": "Central Africa",
      "iso": 148,
      "capital_city": "N'Djam",
      "lat": "15.4542",
      "long": "18.7322",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Chile": {
    "All": {
      "confirmed": 3583227,
      "recovered": 0,
      "deaths": 57642,
      "country": "Chile",
      "population": 18054726,
      "sq_km_area": 756626,
      "life_expectancy": "75.7",
      "elevation_in_meters": "1,871",
      "continent": "South America",
      "abbreviation": "CL",
      "location": "South America",
      "iso": 152,
      "capital_city": "Santiago de Chile"
    },
    "Antofagasta": {
      "lat": "-23.6509",
      "long": "-70.3975",
      "confirmed": 123567,
      "recovered": 0,
      "deaths": 1762,
      "updated": "2022-05-11 04:20:48"
    },
    "Araucania": {
      "lat": "-38.9489",
      "long": "-72.3311",
      "confirmed": 216828,
      "recovered": 0,
      "deaths": 2574,
      "updated": "2022-05-11 04:20:48"
    },
    "Arica y Parinacota": {
      "lat": "-18.594",
      "long": "-69.4785",
      "confirmed": 55645,
      "recovered": 0,
      "deaths": 811,
      "updated": "2022-05-11 04:20:48"
    },
    "Atacama": {
      "lat": "-27.5661",
      "long": "-70.0503",
      "confirmed": 66395,
      "recovered": 0,
      "deaths": 585,
      "updated": "2022-05-11 04:20:48"
    },
    "Aysen": {
      "lat": "-45.9864",
      "long": "-73.7669",
      "confirmed": 25145,
      "recovered": 0,
      "deaths": 184,
      "updated": "2022-05-11 04:20:48"
    },
    "Biobio": {
      "lat": "-37.4464",
      "long": "-72.1416",
      "confirmed": 354861,
      "recovered": 0,
      "deaths": 4279,
      "updated": "2022-05-11 04:20:48"
    },
    "Coquimbo": {
      "lat": "-29.959",
      "long": "-71.3389",
      "confirmed": 127655,
      "recovered": 0,
      "deaths": 1672,
      "updated": "2022-05-11 04:20:48"
    },
    "Los Lagos": {
      "lat": "-41.9198",
      "long": "-72.1416",
      "confirmed": 195608,
      "recovered": 0,
      "deaths": 2316,
      "updated": "2022-05-11 04:20:48"
    },
    "Los Rios": {
      "lat": "-40.231",
      "long": "-72.3311",
      "confirmed": 106337,
      "recovered": 0,
      "deaths": 1222,
      "updated": "2022-05-11 04:20:48"
    },
    "Magallanes": {
      "lat": "-52.368",
      "long": "-70.9863",
      "confirmed": 52061,
      "recovered": 0,
      "deaths": 703,
      "updated": "2022-05-11 04:20:48"
    },
    "Maule": {
      "lat": "-35.5183",
      "long": "-71.6885",
      "confirmed": 240787,
      "recovered": 0,
      "deaths": 2918,
      "updated": "2022-05-11 04:20:48"
    },
    "Metropolitana": {
      "lat": "-33.4376",
      "long": "-70.6505",
      "confirmed": 1376534,
      "recovered": 0,
      "deaths": 28295,
      "updated": "2022-05-11 04:20:48"
    },
    "Nuble": {
      "lat": "-36.7226",
      "long": "-71.7622",
      "confirmed": 100978,
      "recovered": 0,
      "deaths": 1108,
      "updated": "2022-05-11 04:20:48"
    },
    "OHiggins": {
      "lat": "-34.5755",
      "long": "-71.0022",
      "confirmed": 150926,
      "recovered": 0,
      "deaths": 2520,
      "updated": "2022-05-11 04:20:48"
    },
    "Tarapaca": {
      "lat": "-19.9232",
      "long": "-69.5132",
      "confirmed": 79842,
      "recovered": 0,
      "deaths": 1086,
      "updated": "2022-05-11 04:20:48"
    },
    "Unknown": {
      "lat": "",
      "long": "",
      "confirmed": 43,
      "recovered": 0,
      "deaths": 2,
      "updated": "2022-05-11 04:20:48"
    },
    "Valparaiso": {
      "lat": "-33.0472",
      "long": "-71.6127",
      "confirmed": 310015,
      "recovered": 0,
      "deaths": 5605,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "China": {
    "All": {
      "confirmed": 2322540,
      "recovered": 0,
      "deaths": 14550,
      "country": "China",
      "population": 1409517397,
      "sq_km_area": 9572900,
      "life_expectancy": "71.4",
      "elevation_in_meters": "1,840",
      "continent": "Asia",
      "abbreviation": "CN",
      "location": "Eastern Asia",
      "iso": 156,
      "capital_city": "Peking"
    },
    "Anhui": {
      "lat": "31.8257",
      "long": "117.2264",
      "confirmed": 1065,
      "recovered": 0,
      "deaths": 6,
      "updated": "2022-05-11 04:20:48"
    },
    "Beijing": {
      "lat": "40.1824",
      "long": "116.4142",
      "confirmed": 2597,
      "recovered": 0,
      "deaths": 9,
      "updated": "2022-05-11 04:20:48"
    },
    "Chongqing": {
      "lat": "30.0572",
      "long": "107.874",
      "confirmed": 703,
      "recovered": 0,
      "deaths": 6,
      "updated": "2022-05-11 04:20:48"
    },
    "Fujian": {
      "lat": "26.0789",
      "long": "117.9874",
      "confirmed": 3077,
      "recovered": 0,
      "deaths": 1,
      "updated": "2022-05-11 04:20:48"
    },
    "Gansu": {
      "lat": "35.7518",
      "long": "104.2861",
      "confirmed": 681,
      "recovered": 0,
      "deaths": 2,
      "updated": "2022-05-11 04:20:48"
    },
    "Guangdong": {
      "lat": "23.3417",
      "long": "113.4244",
      "confirmed": 7230,
      "recovered": 0,
      "deaths": 8,
      "updated": "2022-05-11 04:20:48"
    },
    "Guangxi": {
      "lat": "23.8298",
      "long": "108.7881",
      "confirmed": 1600,
      "recovered": 0,
      "deaths": 2,
      "updated": "2022-05-11 04:20:48"
    },
    "Guizhou": {
      "lat": "26.8154",
      "long": "106.8748",
      "confirmed": 181,
      "recovered": 0,
      "deaths": 2,
      "updated": "2022-05-11 04:20:48"
    },
    "Hainan": {
      "lat": "19.1959",
      "long": "109.7453",
      "confirmed": 288,
      "recovered": 0,
      "deaths": 6,
      "updated": "2022-05-11 04:20:48"
    },
    "Hebei": {
      "lat": "37.8957",
      "long": "114.9042",
      "confirmed": 2003,
      "recovered": 0,
      "deaths": 7,
      "updated": "2022-05-11 04:20:48"
    },
    "Heilongjiang": {
      "lat": "47.862",
      "long": "127.7615",
      "confirmed": 2983,
      "recovered": 0,
      "deaths": 13,
      "updated": "2022-05-11 04:20:48"
    },
    "Henan": {
      "lat": "33.882",
      "long": "113.614",
      "confirmed": 3074,
      "recovered": 0,
      "deaths": 22,
      "updated": "2022-05-11 04:20:48"
    },
    "Hong Kong": {
      "lat": "22.3",
      "long": "114.2",
      "confirmed": 1207091,
      "recovered": 0,
      "deaths": 9352,
      "updated": "2022-05-11 04:20:48"
    },
    "Hubei": {
      "lat": "30.9756",
      "long": "112.2707",
      "confirmed": 68398,
      "recovered": 0,
      "deaths": 4512,
      "updated": "2022-05-11 04:20:48"
    },
    "Hunan": {
      "lat": "27.6104",
      "long": "111.7088",
      "confirmed": 1392,
      "recovered": 0,
      "deaths": 4,
      "updated": "2022-05-11 04:20:48"
    },
    "Inner Mongolia": {
      "lat": "44.0935",
      "long": "113.9448",
      "confirmed": 1753,
      "recovered": 0,
      "deaths": 1,
      "updated": "2022-05-11 04:20:48"
    },
    "Jiangsu": {
      "lat": "32.9711",
      "long": "119.455",
      "confirmed": 2215,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Jiangxi": {
      "lat": "27.614",
      "long": "115.7221",
      "confirmed": 1383,
      "recovered": 0,
      "deaths": 1,
      "updated": "2022-05-11 04:20:48"
    },
    "Jilin": {
      "lat": "43.6661",
      "long": "126.1923",
      "confirmed": 40257,
      "recovered": 0,
      "deaths": 5,
      "updated": "2022-05-11 04:20:48"
    },
    "Liaoning": {
      "lat": "41.2956",
      "long": "122.6085",
      "confirmed": 1663,
      "recovered": 0,
      "deaths": 2,
      "updated": "2022-05-11 04:20:48"
    },
    "Macau": {
      "lat": "22.1667",
      "long": "113.55",
      "confirmed": 82,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Ningxia": {
      "lat": "37.2692",
      "long": "106.1655",
      "confirmed": 122,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Qinghai": {
      "lat": "35.7452",
      "long": "95.9956",
      "confirmed": 121,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Shaanxi": {
      "lat": "35.1917",
      "long": "108.8701",
      "confirmed": 3277,
      "recovered": 0,
      "deaths": 3,
      "updated": "2022-05-11 04:20:48"
    },
    "Shandong": {
      "lat": "36.3427",
      "long": "118.1498",
      "confirmed": 2733,
      "recovered": 0,
      "deaths": 7,
      "updated": "2022-05-11 04:20:48"
    },
    "Shanghai": {
      "lat": "31.202",
      "long": "121.4491",
      "confirmed": 61372,
      "recovered": 0,
      "deaths": 567,
      "updated": "2022-05-11 04:20:48"
    },
    "Shanxi": {
      "lat": "37.5777",
      "long": "112.2922",
      "confirmed": 420,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Sichuan": {
      "lat": "30.6171",
      "long": "102.7103",
      "confirmed": 2069,
      "recovered": 0,
      "deaths": 3,
      "updated": "2022-05-11 04:20:48"
    },
    "Tianjin": {
      "lat": "39.3054",
      "long": "117.323",
      "confirmed": 1804,
      "recovered": 0,
      "deaths": 3,
      "updated": "2022-05-11 04:20:48"
    },
    "Tibet": {
      "lat": "31.6927",
      "long": "88.0924",
      "confirmed": 1,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Unknown": {
      "lat": "",
      "long": "",
      "confirmed": 894646,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Xinjiang": {
      "lat": "41.1129",
      "long": "85.2401",
      "confirmed": 1008,
      "recovered": 0,
      "deaths": 3,
      "updated": "2022-05-11 04:20:48"
    },
    "Yunnan": {
      "lat": "24.974",
      "long": "101.487",
      "confirmed": 2121,
      "recovered": 0,
      "deaths": 2,
      "updated": "2022-05-11 04:20:48"
    },
    "Zhejiang": {
      "lat": "29.1832",
      "long": "120.0934",
      "confirmed": 3130,
      "recovered": 0,
      "deaths": 1,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Colombia": {
    "All": {
      "confirmed": 6093645,
      "recovered": 0,
      "deaths": 139809,
      "country": "Colombia",
      "population": 49065615,
      "sq_km_area": 1138914,
      "life_expectancy": "70.3",
      "elevation_in_meters": 593,
      "continent": "South America",
      "abbreviation": "CO",
      "location": "South America",
      "iso": 170,
      "capital_city": "Santaf"
    },
    "Amazonas": {
      "lat": "-1.4429",
      "long": "-71.5724",
      "confirmed": 7574,
      "recovered": 0,
      "deaths": 265,
      "updated": "2022-05-11 04:20:48"
    },
    "Antioquia": {
      "lat": "7.1986",
      "long": "-75.3412",
      "confirmed": 918781,
      "recovered": 0,
      "deaths": 18265,
      "updated": "2022-05-11 04:20:48"
    },
    "Arauca": {
      "lat": "7.0762",
      "long": "-70.7105",
      "confirmed": 16323,
      "recovered": 0,
      "deaths": 534,
      "updated": "2022-05-11 04:20:48"
    },
    "Atlantico": {
      "lat": "10.6966",
      "long": "-74.8741",
      "confirmed": 402471,
      "recovered": 0,
      "deaths": 10129,
      "updated": "2022-05-11 04:20:48"
    },
    "Bolivar": {
      "lat": "8.6704",
      "long": "-74.03",
      "confirmed": 197425,
      "recovered": 0,
      "deaths": 3241,
      "updated": "2022-05-11 04:20:48"
    },
    "Boyaca": {
      "lat": "5.4545",
      "long": "-73.362",
      "confirmed": 125264,
      "recovered": 0,
      "deaths": 2785,
      "updated": "2022-05-11 04:20:48"
    },
    "Caldas": {
      "lat": "5.2983",
      "long": "-75.2479",
      "confirmed": 116958,
      "recovered": 0,
      "deaths": 2525,
      "updated": "2022-05-11 04:20:48"
    },
    "Capital District": {
      "lat": "4.711",
      "long": "-74.0721",
      "confirmed": 1769503,
      "recovered": 0,
      "deaths": 29368,
      "updated": "2022-05-11 04:20:48"
    },
    "Caqueta": {
      "lat": "0.8699",
      "long": "-73.8419",
      "confirmed": 24988,
      "recovered": 0,
      "deaths": 1026,
      "updated": "2022-05-11 04:20:48"
    },
    "Casanare": {
      "lat": "5.7589",
      "long": "-71.5724",
      "confirmed": 41721,
      "recovered": 0,
      "deaths": 1002,
      "updated": "2022-05-11 04:20:48"
    },
    "Cauca": {
      "lat": "2.705",
      "long": "-76.826",
      "confirmed": 72308,
      "recovered": 0,
      "deaths": 1792,
      "updated": "2022-05-11 04:20:48"
    },
    "Cesar": {
      "lat": "9.3373",
      "long": "-73.6536",
      "confirmed": 106546,
      "recovered": 0,
      "deaths": 2672,
      "updated": "2022-05-11 04:20:48"
    },
    "Choco": {
      "lat": "5.2528",
      "long": "-76.826",
      "confirmed": 18592,
      "recovered": 0,
      "deaths": 429,
      "updated": "2022-05-11 04:20:48"
    },
    "Cordoba": {
      "lat": "8.0493",
      "long": "-75.574",
      "confirmed": 119126,
      "recovered": 0,
      "deaths": 3931,
      "updated": "2022-05-11 04:20:48"
    },
    "Cundinamarca": {
      "lat": "5.026",
      "long": "-74.03",
      "confirmed": 318429,
      "recovered": 0,
      "deaths": 7288,
      "updated": "2022-05-11 04:20:48"
    },
    "Guainia": {
      "lat": "2.5854",
      "long": "-68.5247",
      "confirmed": 2765,
      "recovered": 0,
      "deaths": 37,
      "updated": "2022-05-11 04:20:48"
    },
    "Guaviare": {
      "lat": "1.0654",
      "long": "-73.2603",
      "confirmed": 5589,
      "recovered": 0,
      "deaths": 105,
      "updated": "2022-05-11 04:20:48"
    },
    "Huila": {
      "lat": "2.5359",
      "long": "-75.5277",
      "confirmed": 100362,
      "recovered": 0,
      "deaths": 3514,
      "updated": "2022-05-11 04:20:48"
    },
    "La Guajira": {
      "lat": "11.3548",
      "long": "-72.5205",
      "confirmed": 56357,
      "recovered": 0,
      "deaths": 1529,
      "updated": "2022-05-11 04:20:48"
    },
    "Magdalena": {
      "lat": "10.4113",
      "long": "-74.4057",
      "confirmed": 114982,
      "recovered": 0,
      "deaths": 3624,
      "updated": "2022-05-11 04:20:48"
    },
    "Meta": {
      "lat": "3.272",
      "long": "-73.0877",
      "confirmed": 105055,
      "recovered": 0,
      "deaths": 2543,
      "updated": "2022-05-11 04:20:48"
    },
    "Narino": {
      "lat": "1.2892",
      "long": "-77.3579",
      "confirmed": 104415,
      "recovered": 0,
      "deaths": 3316,
      "updated": "2022-05-11 04:20:48"
    },
    "Norte de Santander": {
      "lat": "7.9463",
      "long": "-72.8988",
      "confirmed": 119832,
      "recovered": 0,
      "deaths": 5103,
      "updated": "2022-05-11 04:20:48"
    },
    "Putumayo": {
      "lat": "0.436",
      "long": "-75.5277",
      "confirmed": 20509,
      "recovered": 0,
      "deaths": 776,
      "updated": "2022-05-11 04:20:48"
    },
    "Quindio": {
      "lat": "4.461",
      "long": "-75.6674",
      "confirmed": 70833,
      "recovered": 0,
      "deaths": 2055,
      "updated": "2022-05-11 04:20:48"
    },
    "Risaralda": {
      "lat": "5.3158",
      "long": "-75.9928",
      "confirmed": 106440,
      "recovered": 0,
      "deaths": 2469,
      "updated": "2022-05-11 04:20:48"
    },
    "San Andres y Providencia": {
      "lat": "12.5567",
      "long": "-81.7185",
      "confirmed": 10198,
      "recovered": 0,
      "deaths": 155,
      "updated": "2022-05-11 04:20:48"
    },
    "Santander": {
      "lat": "6.6437",
      "long": "-73.6536",
      "confirmed": 283789,
      "recovered": 0,
      "deaths": 8175,
      "updated": "2022-05-11 04:20:48"
    },
    "Sucre": {
      "lat": "8.814",
      "long": "-74.7233",
      "confirmed": 65710,
      "recovered": 0,
      "deaths": 1715,
      "updated": "2022-05-11 04:20:48"
    },
    "Tolima": {
      "lat": "4.0925",
      "long": "-75.1545",
      "confirmed": 124532,
      "recovered": 0,
      "deaths": 4008,
      "updated": "2022-05-11 04:20:48"
    },
    "Unknown": {
      "lat": "",
      "long": "",
      "confirmed": 0,
      "recovered": 0,
      "deaths": 300,
      "updated": "2022-05-11 04:20:48"
    },
    "Valle del Cauca": {
      "lat": "3.8009",
      "long": "-76.6413",
      "confirmed": 540979,
      "recovered": 0,
      "deaths": 15049,
      "updated": "2022-05-11 04:20:48"
    },
    "Vaupes": {
      "lat": "0.8554",
      "long": "-70.812",
      "confirmed": 1889,
      "recovered": 0,
      "deaths": 22,
      "updated": "2022-05-11 04:20:48"
    },
    "Vichada": {
      "lat": "4.4234",
      "long": "-69.2878",
      "confirmed": 3400,
      "recovered": 0,
      "deaths": 62,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Comoros": {
    "All": {
      "confirmed": 8108,
      "recovered": 0,
      "deaths": 160,
      "country": "Comoros",
      "population": 813912,
      "sq_km_area": 1862,
      "life_expectancy": 60,
      "elevation_in_meters": null,
      "continent": "Africa",
      "abbreviation": "KM",
      "location": "Eastern Africa",
      "iso": 174,
      "capital_city": "Moroni",
      "lat": "-11.6455",
      "long": "43.3333",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Congo (Brazzaville)": {
    "All": {
      "confirmed": 24079,
      "recovered": 0,
      "deaths": 385,
      "lat": "-0.228",
      "long": "15.8277",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Congo (Kinshasa)": {
    "All": {
      "confirmed": 87023,
      "recovered": 0,
      "deaths": 1337,
      "lat": "-4.0383",
      "long": "21.7587",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Costa Rica": {
    "All": {
      "confirmed": 866164,
      "recovered": 0,
      "deaths": 8444,
      "country": "Costa Rica",
      "population": 4905769,
      "sq_km_area": 51100,
      "life_expectancy": "75.8",
      "elevation_in_meters": 746,
      "continent": "North America",
      "abbreviation": "CR",
      "location": "Central America",
      "iso": 188,
      "capital_city": "San Jos",
      "lat": "9.7489",
      "long": "-83.7534",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Cote d'Ivoire": {
    "All": {
      "confirmed": 81977,
      "recovered": 0,
      "deaths": 799,
      "country": "Cote d'Ivoire",
      "population": 24294750,
      "sq_km_area": 322463,
      "life_expectancy": "45.2",
      "elevation_in_meters": 250,
      "continent": "Africa",
      "abbreviation": "CI",
      "location": "Western Africa",
      "iso": 384,
      "capital_city": "Yamoussoukro",
      "lat": "7.54",
      "long": "-5.5471",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Croatia": {
    "All": {
      "confirmed": 1128239,
      "recovered": 0,
      "deaths": 15899,
      "country": "Croatia",
      "population": 4189353,
      "sq_km_area": 56538,
      "life_expectancy": "73.7",
      "elevation_in_meters": 331,
      "continent": "Europe",
      "abbreviation": "HR",
      "location": "Southern Europe",
      "iso": 191,
      "capital_city": "Zagreb",
      "lat": "45.1",
      "long": "15.2",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Cuba": {
    "All": {
      "confirmed": 1104110,
      "recovered": 0,
      "deaths": 8528,
      "country": "Cuba",
      "population": 11484636,
      "sq_km_area": 110861,
      "life_expectancy": "76.2",
      "elevation_in_meters": 108,
      "continent": "North America",
      "abbreviation": "CU",
      "location": "Caribbean",
      "iso": 192,
      "capital_city": "La Habana",
      "lat": "21.521757",
      "long": "-77.781167",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Cyprus": {
    "All": {
      "confirmed": 483664,
      "recovered": 0,
      "deaths": 1032,
      "country": "Cyprus",
      "population": 1179551,
      "sq_km_area": 9251,
      "life_expectancy": "76.7",
      "elevation_in_meters": 91,
      "continent": "Asia",
      "abbreviation": "CY",
      "location": "Middle East",
      "iso": 196,
      "capital_city": "Nicosia",
      "lat": "35.1264",
      "long": "33.4299",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Czechia": {
    "All": {
      "confirmed": 3914113,
      "recovered": 0,
      "deaths": 40233,
      "country": "Czechia",
      "population": 10618303,
      "sq_km_area": 78866,
      "life_expectancy": "74.5",
      "elevation_in_meters": 433,
      "continent": "Europe",
      "abbreviation": "CZ",
      "location": "Eastern Europe",
      "iso": 203,
      "capital_city": "Praha",
      "lat": "49.8175",
      "long": "15.473",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Denmark": {
    "All": {
      "confirmed": 3124899,
      "recovered": 0,
      "deaths": 6252,
      "country": "Denmark",
      "population": 5733551,
      "sq_km_area": 43094,
      "life_expectancy": "76.5",
      "elevation_in_meters": 34,
      "continent": "Europe",
      "abbreviation": "DK",
      "location": "Nordic Countries",
      "iso": 208,
      "capital_city": "Copenhagen",
      "lat": "56.2639",
      "long": "9.5018",
      "updated": "2022-05-11 04:20:48"
    },
    "Faroe Islands": {
      "lat": "61.8926",
      "long": "-6.9118",
      "confirmed": 34658,
      "recovered": 0,
      "deaths": 28,
      "updated": "2022-05-11 04:20:48"
    },
    "Greenland": {
      "lat": "71.7069",
      "long": "-42.6043",
      "confirmed": 11971,
      "recovered": 0,
      "deaths": 21,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Diamond Princess": {
    "All": {
      "confirmed": 712,
      "recovered": 0,
      "deaths": 13,
      "lat": "",
      "long": "",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Djibouti": {
    "All": {
      "confirmed": 15631,
      "recovered": 0,
      "deaths": 189,
      "country": "Djibouti",
      "population": 956985,
      "sq_km_area": 23200,
      "life_expectancy": "50.8",
      "elevation_in_meters": 430,
      "continent": "Africa",
      "abbreviation": "DJ",
      "location": "Eastern Africa",
      "iso": 262,
      "capital_city": "Djibouti",
      "lat": "11.8251",
      "long": "42.5903",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Dominica": {
    "All": {
      "confirmed": 12493,
      "recovered": 0,
      "deaths": 63,
      "country": "Dominica",
      "population": 73925,
      "sq_km_area": 751,
      "life_expectancy": "73.4",
      "elevation_in_meters": null,
      "continent": "North America",
      "abbreviation": "DM",
      "location": "Caribbean",
      "iso": 212,
      "capital_city": "Roseau",
      "lat": "15.415",
      "long": "-61.371",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Dominican Republic": {
    "All": {
      "confirmed": 580020,
      "recovered": 0,
      "deaths": 4376,
      "country": "Dominican Republic",
      "population": 10766998,
      "sq_km_area": 48511,
      "life_expectancy": "73.2",
      "elevation_in_meters": 424,
      "continent": "North America",
      "abbreviation": "DO",
      "location": "Caribbean",
      "iso": 214,
      "capital_city": "Santo Domingo de Guzm",
      "lat": "18.7357",
      "long": "-70.1627",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Ecuador": {
    "All": {
      "confirmed": 871046,
      "recovered": 0,
      "deaths": 35602,
      "country": "Ecuador",
      "population": 16624858,
      "sq_km_area": 283561,
      "life_expectancy": "71.1",
      "elevation_in_meters": "1,117",
      "continent": "South America",
      "abbreviation": "EC",
      "location": "South America",
      "iso": 218,
      "capital_city": "Quito",
      "lat": "-1.8312",
      "long": "-78.1834",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Egypt": {
    "All": {
      "confirmed": 515645,
      "recovered": 0,
      "deaths": 24669,
      "country": "Egypt",
      "population": 97553151,
      "sq_km_area": 1001449,
      "life_expectancy": "63.3",
      "elevation_in_meters": 321,
      "continent": "Africa",
      "abbreviation": "EG",
      "location": "Northern Africa",
      "iso": 818,
      "capital_city": "Cairo",
      "lat": "26.820553",
      "long": "30.802498",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "El Salvador": {
    "All": {
      "confirmed": 162089,
      "recovered": 0,
      "deaths": 4129,
      "country": "El Salvador",
      "population": 6377853,
      "sq_km_area": 21041,
      "life_expectancy": "69.7",
      "elevation_in_meters": 442,
      "continent": "North America",
      "abbreviation": "SV",
      "location": "Central America",
      "iso": 222,
      "capital_city": "San Salvador",
      "lat": "13.7942",
      "long": "-88.8965",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Equatorial Guinea": {
    "All": {
      "confirmed": 15910,
      "recovered": 0,
      "deaths": 183,
      "country": "Equatorial Guinea",
      "population": 1267689,
      "sq_km_area": 28051,
      "life_expectancy": "53.6",
      "elevation_in_meters": 577,
      "continent": "Africa",
      "abbreviation": "GQ",
      "location": "Central Africa",
      "iso": 226,
      "capital_city": "Malabo",
      "lat": "1.6508",
      "long": "10.2679",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Eritrea": {
    "All": {
      "confirmed": 9738,
      "recovered": 0,
      "deaths": 103,
      "country": "Eritrea",
      "population": 5068831,
      "sq_km_area": 117600,
      "life_expectancy": "55.8",
      "elevation_in_meters": 853,
      "continent": "Africa",
      "abbreviation": "ER",
      "location": "Eastern Africa",
      "iso": 232,
      "capital_city": "Asmara",
      "lat": "15.1794",
      "long": "39.7823",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Estonia": {
    "All": {
      "confirmed": 573922,
      "recovered": 0,
      "deaths": 2556,
      "country": "Estonia",
      "population": 1309632,
      "sq_km_area": 45227,
      "life_expectancy": "69.5",
      "elevation_in_meters": 61,
      "continent": "Europe",
      "abbreviation": "EE",
      "location": "Baltic Countries",
      "iso": 233,
      "capital_city": "Tallinn",
      "lat": "58.5953",
      "long": "25.0136",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Eswatini": {
    "All": {
      "confirmed": 71341,
      "recovered": 0,
      "deaths": 1402,
      "lat": "-26.5225",
      "long": "31.4659",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Ethiopia": {
    "All": {
      "confirmed": 470798,
      "recovered": 0,
      "deaths": 7510,
      "country": "Ethiopia",
      "population": 104957438,
      "sq_km_area": 1104300,
      "life_expectancy": "45.2",
      "elevation_in_meters": "1,330",
      "continent": "Africa",
      "abbreviation": "ET",
      "location": "Eastern Africa",
      "iso": 231,
      "capital_city": "Addis Abeba",
      "lat": "9.145",
      "long": "40.4897",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Fiji": {
    "All": {
      "confirmed": 64725,
      "recovered": 0,
      "deaths": 862,
      "country": "Fiji",
      "population": 905502,
      "sq_km_area": 18274,
      "life_expectancy": "67.9",
      "elevation_in_meters": null,
      "continent": "Oceania",
      "abbreviation": "FJ",
      "location": "Melanesia",
      "iso": null,
      "capital_city": "Suva",
      "lat": "-17.7134",
      "long": "178.065",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Finland": {
    "All": {
      "confirmed": 1052767,
      "recovered": 0,
      "deaths": 4150,
      "country": "Finland",
      "population": 5523231,
      "sq_km_area": 338145,
      "life_expectancy": "77.4",
      "elevation_in_meters": 164,
      "continent": "Europe",
      "abbreviation": "FI",
      "location": "Nordic Countries",
      "iso": 246,
      "capital_city": "Helsinki [Helsingfors]",
      "lat": "61.92411",
      "long": "25.748151",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "France": {
    "All": {
      "confirmed": 28229588,
      "recovered": 0,
      "deaths": 143772,
      "country": "France",
      "population": 64979548,
      "sq_km_area": 551500,
      "life_expectancy": "78.8",
      "elevation_in_meters": 375,
      "continent": "Europe",
      "abbreviation": "FR",
      "location": "Western Europe",
      "iso": 250,
      "capital_city": "Paris",
      "lat": "46.2276",
      "long": "2.2137",
      "updated": "2022-05-11 04:20:48"
    },
    "French Guiana": {
      "lat": "4.0",
      "long": "-53.0",
      "confirmed": 80859,
      "recovered": 0,
      "deaths": 395,
      "updated": "2022-05-11 04:20:48"
    },
    "French Polynesia": {
      "lat": "-17.6797",
      "long": "-149.4068",
      "confirmed": 72786,
      "recovered": 0,
      "deaths": 648,
      "updated": "2022-05-11 04:20:48"
    },
    "Guadeloupe": {
      "lat": "16.265",
      "long": "-61.551",
      "confirmed": 152516,
      "recovered": 0,
      "deaths": 945,
      "updated": "2022-05-11 04:20:48"
    },
    "Martinique": {
      "lat": "14.6415",
      "long": "-61.0242",
      "confirmed": 153994,
      "recovered": 0,
      "deaths": 918,
      "updated": "2022-05-11 04:20:48"
    },
    "Mayotte": {
      "lat": "-12.8275",
      "long": "45.166244",
      "confirmed": 37363,
      "recovered": 0,
      "deaths": 187,
      "updated": "2022-05-11 04:20:48"
    },
    "New Caledonia": {
      "lat": "-20.904305",
      "long": "165.618042",
      "confirmed": 60885,
      "recovered": 0,
      "deaths": 312,
      "updated": "2022-05-11 04:20:48"
    },
    "Reunion": {
      "lat": "-21.1151",
      "long": "55.5364",
      "confirmed": 405980,
      "recovered": 0,
      "deaths": 762,
      "updated": "2022-05-11 04:20:48"
    },
    "Saint Barthelemy": {
      "lat": "17.9",
      "long": "-62.8333",
      "confirmed": 4575,
      "recovered": 0,
      "deaths": 6,
      "updated": "2022-05-11 04:20:48"
    },
    "Saint Pierre and Miquelon": {
      "lat": "46.8852",
      "long": "-56.3159",
      "confirmed": 2739,
      "recovered": 0,
      "deaths": 1,
      "updated": "2022-05-11 04:20:48"
    },
    "St Martin": {
      "lat": "18.0708",
      "long": "-63.0501",
      "confirmed": 10537,
      "recovered": 0,
      "deaths": 63,
      "updated": "2022-05-11 04:20:48"
    },
    "Wallis and Futuna": {
      "lat": "-14.2938",
      "long": "-178.1165",
      "confirmed": 454,
      "recovered": 0,
      "deaths": 7,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Gabon": {
    "All": {
      "confirmed": 47608,
      "recovered": 0,
      "deaths": 304,
      "country": "Gabon",
      "population": 2025137,
      "sq_km_area": 267668,
      "life_expectancy": "50.1",
      "elevation_in_meters": 377,
      "continent": "Africa",
      "abbreviation": "GA",
      "location": "Central Africa",
      "iso": 266,
      "capital_city": "Libreville",
      "lat": "-0.8037",
      "long": "11.6094",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Gambia": {
    "All": {
      "confirmed": 11996,
      "recovered": 0,
      "deaths": 365,
      "country": "Gambia",
      "population": 2100568,
      "sq_km_area": 11295,
      "life_expectancy": "53.2",
      "elevation_in_meters": 34,
      "continent": "Africa",
      "abbreviation": "GM",
      "location": "Western Africa",
      "iso": 270,
      "capital_city": "Banjul",
      "lat": "13.4432",
      "long": "-15.3101",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Georgia": {
    "All": {
      "confirmed": 1655221,
      "recovered": 0,
      "deaths": 16811,
      "country": "Georgia",
      "population": 3912061,
      "sq_km_area": 69700,
      "life_expectancy": "64.5",
      "elevation_in_meters": "1,432",
      "continent": "Asia",
      "abbreviation": "GE",
      "location": "Middle East",
      "iso": 268,
      "capital_city": "Tbilisi",
      "lat": "42.3154",
      "long": "43.3569",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Germany": {
    "All": {
      "confirmed": 25503878,
      "recovered": 0,
      "deaths": 136987,
      "country": "Germany",
      "population": 82114224,
      "sq_km_area": 357022,
      "life_expectancy": "77.4",
      "elevation_in_meters": 263,
      "continent": "Europe",
      "abbreviation": "DE",
      "location": "Western Europe",
      "iso": 276,
      "capital_city": "Berlin"
    },
    "Baden-Wurttemberg": {
      "lat": "48.6616",
      "long": "9.3501",
      "confirmed": 3573692,
      "recovered": 0,
      "deaths": 15921,
      "updated": "2022-05-11 04:20:48"
    },
    "Bayern": {
      "lat": "48.7904",
      "long": "11.4979",
      "confirmed": 4760261,
      "recovered": 0,
      "deaths": 23772,
      "updated": "2022-05-11 04:20:48"
    },
    "Berlin": {
      "lat": "52.52",
      "long": "13.405",
      "confirmed": 1020636,
      "recovered": 0,
      "deaths": 4528,
      "updated": "2022-05-11 04:20:48"
    },
    "Brandenburg": {
      "lat": "52.4125",
      "long": "12.5316",
      "confirmed": 776804,
      "recovered": 0,
      "deaths": 5604,
      "updated": "2022-05-11 04:20:48"
    },
    "Bremen": {
      "lat": "53.0793",
      "long": "8.8017",
      "confirmed": 192763,
      "recovered": 0,
      "deaths": 766,
      "updated": "2022-05-11 04:20:48"
    },
    "Hamburg": {
      "lat": "53.5511",
      "long": "9.9937",
      "confirmed": 561448,
      "recovered": 0,
      "deaths": 2598,
      "updated": "2022-05-11 04:20:48"
    },
    "Hessen": {
      "lat": "50.6521",
      "long": "9.1624",
      "confirmed": 1786181,
      "recovered": 0,
      "deaths": 10016,
      "updated": "2022-05-11 04:20:48"
    },
    "Mecklenburg-Vorpommern": {
      "lat": "53.6127",
      "long": "12.4296",
      "confirmed": 476571,
      "recovered": 0,
      "deaths": 2192,
      "updated": "2022-05-11 04:20:48"
    },
    "Niedersachsen": {
      "lat": "52.6367",
      "long": "9.8451",
      "confirmed": 2256689,
      "recovered": 0,
      "deaths": 8981,
      "updated": "2022-05-11 04:20:48"
    },
    "Nordrhein-Westfalen": {
      "lat": "51.4332",
      "long": "7.6616",
      "confirmed": 5094097,
      "recovered": 0,
      "deaths": 25019,
      "updated": "2022-05-11 04:20:48"
    },
    "Rheinland-Pfalz": {
      "lat": "50.1183",
      "long": "7.309",
      "confirmed": 1111107,
      "recovered": 0,
      "deaths": 5573,
      "updated": "2022-05-11 04:20:48"
    },
    "Saarland": {
      "lat": "49.3964",
      "long": "7.023",
      "confirmed": 308047,
      "recovered": 0,
      "deaths": 1660,
      "updated": "2022-05-11 04:20:48"
    },
    "Sachsen": {
      "lat": "51.1045",
      "long": "13.2017",
      "confirmed": 1488160,
      "recovered": 0,
      "deaths": 15417,
      "updated": "2022-05-11 04:20:48"
    },
    "Sachsen-Anhalt": {
      "lat": "51.9503",
      "long": "11.6923",
      "confirmed": 704492,
      "recovered": 0,
      "deaths": 5287,
      "updated": "2022-05-11 04:20:48"
    },
    "Schleswig-Holstein": {
      "lat": "54.2194",
      "long": "9.6961",
      "confirmed": 692458,
      "recovered": 0,
      "deaths": 2475,
      "updated": "2022-05-11 04:20:48"
    },
    "Thuringen": {
      "lat": "51.011",
      "long": "10.8453",
      "confirmed": 700472,
      "recovered": 0,
      "deaths": 7178,
      "updated": "2022-05-11 04:20:48"
    },
    "Unknown": {
      "lat": "",
      "long": "",
      "confirmed": 0,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Ghana": {
    "All": {
      "confirmed": 161271,
      "recovered": 0,
      "deaths": 1445,
      "country": "Ghana",
      "population": 28833629,
      "sq_km_area": 238533,
      "life_expectancy": "57.4",
      "elevation_in_meters": 190,
      "continent": "Africa",
      "abbreviation": "GH",
      "location": "Western Africa",
      "iso": 288,
      "capital_city": "Accra",
      "lat": "7.9465",
      "long": "-1.0232",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Greece": {
    "All": {
      "confirmed": 3371051,
      "recovered": 0,
      "deaths": 29444,
      "country": "Greece",
      "population": 11159773,
      "sq_km_area": 131626,
      "life_expectancy": "78.4",
      "elevation_in_meters": 498,
      "continent": "Europe",
      "abbreviation": "GR",
      "location": "Southern Europe",
      "iso": 300,
      "capital_city": "Athenai",
      "lat": "39.0742",
      "long": "21.8243",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Grenada": {
    "All": {
      "confirmed": 15818,
      "recovered": 0,
      "deaths": 220,
      "country": "Grenada",
      "population": 107825,
      "sq_km_area": 344,
      "life_expectancy": "64.5",
      "elevation_in_meters": null,
      "continent": "North America",
      "abbreviation": "GD",
      "location": "Caribbean",
      "iso": 308,
      "capital_city": "Saint George's",
      "lat": "12.1165",
      "long": "-61.679",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Guatemala": {
    "All": {
      "confirmed": 850255,
      "recovered": 0,
      "deaths": 17719,
      "country": "Guatemala",
      "population": 16913503,
      "sq_km_area": 108889,
      "life_expectancy": "66.2",
      "elevation_in_meters": 759,
      "continent": "North America",
      "abbreviation": "GT",
      "location": "Central America",
      "iso": 320,
      "capital_city": "Ciudad de Guatemala",
      "lat": "15.7835",
      "long": "-90.2308",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Guinea": {
    "All": {
      "confirmed": 36549,
      "recovered": 0,
      "deaths": 442,
      "country": "Guinea",
      "population": 12717176,
      "sq_km_area": 245857,
      "life_expectancy": "45.6",
      "elevation_in_meters": 472,
      "continent": "Africa",
      "abbreviation": "GN",
      "location": "Western Africa",
      "iso": 324,
      "capital_city": "Conakry",
      "lat": "9.9456",
      "long": "-9.6966",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Guinea-Bissau": {
    "All": {
      "confirmed": 8215,
      "recovered": 0,
      "deaths": 171,
      "country": "Guinea-Bissau",
      "population": 1861283,
      "sq_km_area": 36125,
      "life_expectancy": 49,
      "elevation_in_meters": 70,
      "continent": "Africa",
      "abbreviation": "GW",
      "location": "Western Africa",
      "iso": 624,
      "capital_city": "Bissau",
      "lat": "11.8037",
      "long": "-15.1804",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Guyana": {
    "All": {
      "confirmed": 63586,
      "recovered": 0,
      "deaths": 1228,
      "country": "Guyana",
      "population": 777859,
      "sq_km_area": 214969,
      "life_expectancy": 64,
      "elevation_in_meters": 207,
      "continent": "South America",
      "abbreviation": "GY",
      "location": "South America",
      "iso": 328,
      "capital_city": "Georgetown",
      "lat": "4.860416",
      "long": "-58.93018",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Haiti": {
    "All": {
      "confirmed": 30707,
      "recovered": 0,
      "deaths": 835,
      "country": "Haiti",
      "population": 10981229,
      "sq_km_area": 27750,
      "life_expectancy": "49.2",
      "elevation_in_meters": 470,
      "continent": "North America",
      "abbreviation": "HT",
      "location": "Caribbean",
      "iso": 332,
      "capital_city": "Port-au-Prince",
      "lat": "18.9712",
      "long": "-72.2852",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Holy See": {
    "All": {
      "confirmed": 29,
      "recovered": 0,
      "deaths": 0,
      "country": "Holy See",
      "population": 1000,
      "sq_km_area": 0.4,
      "life_expectancy": null,
      "elevation_in_meters": null,
      "continent": "Europe",
      "abbreviation": "VA",
      "location": "Southern Europe",
      "iso": null,
      "capital_city": "Citt",
      "lat": "41.9029",
      "long": "12.4534",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Honduras": {
    "All": {
      "confirmed": 423775,
      "recovered": 0,
      "deaths": 10895,
      "country": "Honduras",
      "population": 9265067,
      "sq_km_area": 112088,
      "life_expectancy": "69.9",
      "elevation_in_meters": 684,
      "continent": "North America",
      "abbreviation": "HN",
      "location": "Central America",
      "iso": 340,
      "capital_city": "Tegucigalpa",
      "lat": "15.2",
      "long": "-86.2419",
      "updated": "2022-05-04 23:20:52"
    }
  },
  "Hungary": {
    "All": {
      "confirmed": 1903200,
      "recovered": 0,
      "deaths": 46266,
      "country": "Hungary",
      "population": 9721559,
      "sq_km_area": 93030,
      "life_expectancy": "71.4",
      "elevation_in_meters": 143,
      "continent": "Europe",
      "abbreviation": "HU",
      "location": "Eastern Europe",
      "iso": 348,
      "capital_city": "Budapest",
      "lat": "47.1625",
      "long": "19.5033",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Iceland": {
    "All": {
      "confirmed": 186179,
      "recovered": 0,
      "deaths": 120,
      "country": "Iceland",
      "population": 335025,
      "sq_km_area": 103000,
      "life_expectancy": "79.4",
      "elevation_in_meters": 557,
      "continent": "Europe",
      "abbreviation": "IS",
      "location": "Nordic Countries",
      "iso": 352,
      "capital_city": "Reykjav",
      "lat": "64.9631",
      "long": "-19.0208",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "India": {
    "All": {
      "confirmed": 43110586,
      "recovered": 0,
      "deaths": 524157,
      "country": "India",
      "population": 1339180127,
      "sq_km_area": 3287263,
      "life_expectancy": "62.5",
      "elevation_in_meters": 160,
      "continent": "Asia",
      "abbreviation": "IN",
      "location": "Southern and Central Asia",
      "iso": 356,
      "capital_city": "New Delhi"
    },
    "Andaman and Nicobar Islands": {
      "lat": "11.225999",
      "long": "92.968178",
      "confirmed": 10039,
      "recovered": 0,
      "deaths": 129,
      "updated": "2022-05-11 04:20:48"
    },
    "Andhra Pradesh": {
      "lat": "15.9129",
      "long": "79.74",
      "confirmed": 2319752,
      "recovered": 0,
      "deaths": 14730,
      "updated": "2022-05-11 04:20:48"
    },
    "Arunachal Pradesh": {
      "lat": "27.768456",
      "long": "96.384277",
      "confirmed": 64502,
      "recovered": 0,
      "deaths": 296,
      "updated": "2022-05-11 04:20:48"
    },
    "Assam": {
      "lat": "26.357149",
      "long": "92.830441",
      "confirmed": 724219,
      "recovered": 0,
      "deaths": 7986,
      "updated": "2022-05-11 04:20:48"
    },
    "Bihar": {
      "lat": "25.679658",
      "long": "85.60484",
      "confirmed": 830639,
      "recovered": 0,
      "deaths": 12256,
      "updated": "2022-05-11 04:20:48"
    },
    "Chandigarh": {
      "lat": "30.733839",
      "long": "76.768278",
      "confirmed": 92168,
      "recovered": 0,
      "deaths": 1165,
      "updated": "2022-05-11 04:20:48"
    },
    "Chhattisgarh": {
      "lat": "21.264705",
      "long": "82.035366",
      "confirmed": 1152321,
      "recovered": 0,
      "deaths": 14034,
      "updated": "2022-05-11 04:20:48"
    },
    "Dadra and Nagar Haveli and Daman and Diu": {
      "lat": "20.194742",
      "long": "73.080901",
      "confirmed": 11441,
      "recovered": 0,
      "deaths": 4,
      "updated": "2022-05-11 04:20:48"
    },
    "Delhi": {
      "lat": "28.646519",
      "long": "77.10898",
      "confirmed": 1896171,
      "recovered": 0,
      "deaths": 26183,
      "updated": "2022-05-11 04:20:48"
    },
    "Goa": {
      "lat": "15.359682",
      "long": "74.057396",
      "confirmed": 245517,
      "recovered": 0,
      "deaths": 3832,
      "updated": "2022-05-11 04:20:48"
    },
    "Gujarat": {
      "lat": "22.694884",
      "long": "71.590923",
      "confirmed": 1224563,
      "recovered": 0,
      "deaths": 10944,
      "updated": "2022-05-11 04:20:48"
    },
    "Haryana": {
      "lat": "29.20004",
      "long": "76.332824",
      "confirmed": 997376,
      "recovered": 0,
      "deaths": 10620,
      "updated": "2022-05-11 04:20:48"
    },
    "Himachal Pradesh": {
      "lat": "31.927213",
      "long": "77.233081",
      "confirmed": 284884,
      "recovered": 0,
      "deaths": 4135,
      "updated": "2022-05-11 04:20:48"
    },
    "Jammu and Kashmir": {
      "lat": "33.75943",
      "long": "76.612638",
      "confirmed": 454118,
      "recovered": 0,
      "deaths": 4751,
      "updated": "2022-05-11 04:20:48"
    },
    "Jharkhand": {
      "lat": "23.654536",
      "long": "85.557631",
      "confirmed": 435272,
      "recovered": 0,
      "deaths": 5317,
      "updated": "2022-05-11 04:20:48"
    },
    "Karnataka": {
      "lat": "14.70518",
      "long": "76.166436",
      "confirmed": 3948966,
      "recovered": 0,
      "deaths": 40105,
      "updated": "2022-05-11 04:20:48"
    },
    "Kerala": {
      "lat": "10.450898",
      "long": "76.405749",
      "confirmed": 6544914,
      "recovered": 0,
      "deaths": 69325,
      "updated": "2022-05-11 04:20:48"
    },
    "Ladakh": {
      "lat": "34.1526",
      "long": "77.5771",
      "confirmed": 28250,
      "recovered": 0,
      "deaths": 228,
      "updated": "2022-05-11 04:20:48"
    },
    "Lakshadweep": {
      "lat": "13.6999972",
      "long": "72.1833326",
      "confirmed": 11402,
      "recovered": 0,
      "deaths": 52,
      "updated": "2022-05-11 04:20:48"
    },
    "Madhya Pradesh": {
      "lat": "23.541513",
      "long": "78.289633",
      "confirmed": 1041747,
      "recovered": 0,
      "deaths": 10735,
      "updated": "2022-05-11 04:20:48"
    },
    "Maharashtra": {
      "lat": "19.449759",
      "long": "76.108221",
      "confirmed": 7879622,
      "recovered": 0,
      "deaths": 147849,
      "updated": "2022-05-11 04:20:48"
    },
    "Manipur": {
      "lat": "24.738975",
      "long": "93.882541",
      "confirmed": 137227,
      "recovered": 0,
      "deaths": 2120,
      "updated": "2022-05-11 04:20:48"
    },
    "Meghalaya": {
      "lat": "25.536934",
      "long": "91.278882",
      "confirmed": 93811,
      "recovered": 0,
      "deaths": 1593,
      "updated": "2022-05-11 04:20:48"
    },
    "Mizoram": {
      "lat": "23.309381",
      "long": "92.83822",
      "confirmed": 227794,
      "recovered": 0,
      "deaths": 697,
      "updated": "2022-05-11 04:20:48"
    },
    "Nagaland": {
      "lat": "26.06702",
      "long": "94.470302",
      "confirmed": 35492,
      "recovered": 0,
      "deaths": 760,
      "updated": "2022-05-11 04:20:48"
    },
    "Odisha": {
      "lat": "20.505428",
      "long": "84.418059",
      "confirmed": 1288222,
      "recovered": 0,
      "deaths": 9126,
      "updated": "2022-05-11 04:20:48"
    },
    "Puducherry": {
      "lat": "11.882658",
      "long": "78.86498",
      "confirmed": 165799,
      "recovered": 0,
      "deaths": 1962,
      "updated": "2022-05-11 04:20:48"
    },
    "Punjab": {
      "lat": "30.841465",
      "long": "75.40879",
      "confirmed": 759958,
      "recovered": 0,
      "deaths": 17751,
      "updated": "2022-05-11 04:20:48"
    },
    "Rajasthan": {
      "lat": "26.583423",
      "long": "73.847973",
      "confirmed": 1284397,
      "recovered": 0,
      "deaths": 9554,
      "updated": "2022-05-11 04:20:48"
    },
    "Sikkim": {
      "lat": "27.571671",
      "long": "88.472712",
      "confirmed": 39154,
      "recovered": 0,
      "deaths": 452,
      "updated": "2022-05-11 04:20:48"
    },
    "Tamil Nadu": {
      "lat": "11.006091",
      "long": "78.400624",
      "confirmed": 3454431,
      "recovered": 0,
      "deaths": 38025,
      "updated": "2022-05-11 04:20:48"
    },
    "Telangana": {
      "lat": "18.1124",
      "long": "79.0193",
      "confirmed": 792389,
      "recovered": 0,
      "deaths": 4111,
      "updated": "2022-05-11 04:20:48"
    },
    "Tripura": {
      "lat": "23.746783",
      "long": "91.743565",
      "confirmed": 100887,
      "recovered": 0,
      "deaths": 923,
      "updated": "2022-05-11 04:20:48"
    },
    "Unknown": {
      "lat": "",
      "long": "",
      "confirmed": 0,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Uttar Pradesh": {
      "lat": "26.925425",
      "long": "80.560982",
      "confirmed": 2076858,
      "recovered": 0,
      "deaths": 23511,
      "updated": "2022-05-11 04:20:48"
    },
    "Uttarakhand": {
      "lat": "30.156447",
      "long": "79.197608",
      "confirmed": 437638,
      "recovered": 0,
      "deaths": 7693,
      "updated": "2022-05-11 04:20:48"
    },
    "West Bengal": {
      "lat": "23.814082",
      "long": "87.979803",
      "confirmed": 2018646,
      "recovered": 0,
      "deaths": 21203,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Indonesia": {
    "All": {
      "confirmed": 6048685,
      "recovered": 0,
      "deaths": 156396,
      "country": "Indonesia",
      "population": 263991379,
      "sq_km_area": 1904569,
      "life_expectancy": "70.1",
      "elevation_in_meters": 367,
      "continent": "Asia",
      "abbreviation": "ID",
      "location": "Southeast Asia",
      "iso": 360,
      "capital_city": "Jakarta",
      "lat": "-0.7893",
      "long": "113.9213",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Iran": {
    "All": {
      "confirmed": 7226219,
      "recovered": 0,
      "deaths": 141192,
      "country": "Iran",
      "population": 81162788,
      "sq_km_area": 1648195,
      "life_expectancy": "69.7",
      "elevation_in_meters": "1,305",
      "continent": "Asia",
      "abbreviation": "IR",
      "location": "Southern and Central Asia",
      "iso": 364,
      "capital_city": "Tehran",
      "lat": "32.427908",
      "long": "53.688046",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Iraq": {
    "All": {
      "confirmed": 2325871,
      "recovered": 0,
      "deaths": 25215,
      "country": "Iraq",
      "population": 38274618,
      "sq_km_area": 438317,
      "life_expectancy": "66.5",
      "elevation_in_meters": 312,
      "continent": "Asia",
      "abbreviation": "IQ",
      "location": "Middle East",
      "iso": 368,
      "capital_city": "Baghdad",
      "lat": "33.223191",
      "long": "43.679291",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Ireland": {
    "All": {
      "confirmed": 1527328,
      "recovered": 0,
      "deaths": 7167,
      "country": "Ireland",
      "population": 4761657,
      "sq_km_area": 70273,
      "life_expectancy": "76.8",
      "elevation_in_meters": 118,
      "continent": "Europe",
      "abbreviation": "IE",
      "location": "British Isles",
      "iso": 372,
      "capital_city": "Dublin",
      "lat": "53.1424",
      "long": "-7.6921",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Israel": {
    "All": {
      "confirmed": 4097837,
      "recovered": 0,
      "deaths": 10749,
      "country": "Israel",
      "population": 8321570,
      "sq_km_area": 21056,
      "life_expectancy": "78.6",
      "elevation_in_meters": 508,
      "continent": "Asia",
      "abbreviation": "IL",
      "location": "Middle East",
      "iso": 376,
      "capital_city": "Jerusalem",
      "lat": "31.046051",
      "long": "34.851612",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Italy": {
    "All": {
      "confirmed": 16872618,
      "recovered": 0,
      "deaths": 164731,
      "country": "Italy",
      "population": 59359900,
      "sq_km_area": 301316,
      "life_expectancy": 79,
      "elevation_in_meters": 538,
      "continent": "Europe",
      "abbreviation": "IT",
      "location": "Southern Europe",
      "iso": 380,
      "capital_city": "Roma"
    },
    "Abruzzo": {
      "lat": "42.35122196",
      "long": "13.39843823",
      "confirmed": 388718,
      "recovered": 0,
      "deaths": 3253,
      "updated": "2022-05-11 04:20:48"
    },
    "Basilicata": {
      "lat": "40.63947052",
      "long": "15.80514834",
      "confirmed": 132249,
      "recovered": 0,
      "deaths": 904,
      "updated": "2022-05-11 04:20:48"
    },
    "Calabria": {
      "lat": "38.90597598",
      "long": "16.59440194",
      "confirmed": 372126,
      "recovered": 0,
      "deaths": 2542,
      "updated": "2022-05-11 04:20:48"
    },
    "Campania": {
      "lat": "40.83956555",
      "long": "14.25084984",
      "confirmed": 1651286,
      "recovered": 0,
      "deaths": 10370,
      "updated": "2022-05-11 04:20:48"
    },
    "Emilia-Romagna": {
      "lat": "44.49436681",
      "long": "11.3417208",
      "confirmed": 1442456,
      "recovered": 0,
      "deaths": 16740,
      "updated": "2022-05-11 04:20:48"
    },
    "Friuli Venezia Giulia": {
      "lat": "45.6494354",
      "long": "13.76813649",
      "confirmed": 370133,
      "recovered": 0,
      "deaths": 5051,
      "updated": "2022-05-11 04:20:48"
    },
    "Lazio": {
      "lat": "41.89277044",
      "long": "12.48366722",
      "confirmed": 1520813,
      "recovered": 0,
      "deaths": 11201,
      "updated": "2022-05-11 04:20:48"
    },
    "Liguria": {
      "lat": "44.41149315",
      "long": "8.9326992",
      "confirmed": 436867,
      "recovered": 0,
      "deaths": 5298,
      "updated": "2022-05-11 04:20:48"
    },
    "Lombardia": {
      "lat": "45.46679409",
      "long": "9.190347404",
      "confirmed": 2819610,
      "recovered": 0,
      "deaths": 40186,
      "updated": "2022-05-11 04:20:48"
    },
    "Marche": {
      "lat": "43.61675973",
      "long": "13.5188753",
      "confirmed": 457584,
      "recovered": 0,
      "deaths": 3863,
      "updated": "2022-05-11 04:20:48"
    },
    "Molise": {
      "lat": "41.55774754",
      "long": "14.65916051",
      "confirmed": 62658,
      "recovered": 0,
      "deaths": 622,
      "updated": "2022-05-11 04:20:48"
    },
    "P.A. Bolzano": {
      "lat": "46.49933453",
      "long": "11.35662422",
      "confirmed": 213959,
      "recovered": 0,
      "deaths": 1468,
      "updated": "2022-05-11 04:20:48"
    },
    "P.A. Trento": {
      "lat": "46.06893511",
      "long": "11.12123097",
      "confirmed": 164000,
      "recovered": 0,
      "deaths": 1559,
      "updated": "2022-05-11 04:20:48"
    },
    "Piemonte": {
      "lat": "45.0732745",
      "long": "7.680687483",
      "confirmed": 1167442,
      "recovered": 0,
      "deaths": 13362,
      "updated": "2022-05-11 04:20:48"
    },
    "Puglia": {
      "lat": "41.12559576",
      "long": "16.86736689",
      "confirmed": 1096731,
      "recovered": 0,
      "deaths": 8360,
      "updated": "2022-05-11 04:20:48"
    },
    "Sardegna": {
      "lat": "39.21531192",
      "long": "9.110616306",
      "confirmed": 292079,
      "recovered": 0,
      "deaths": 2380,
      "updated": "2022-05-11 04:20:48"
    },
    "Sicilia": {
      "lat": "38.11569725",
      "long": "13.3623567",
      "confirmed": 1144106,
      "recovered": 0,
      "deaths": 10722,
      "updated": "2022-05-11 04:20:48"
    },
    "Toscana": {
      "lat": "43.76923077",
      "long": "11.25588885",
      "confirmed": 1120126,
      "recovered": 0,
      "deaths": 9949,
      "updated": "2022-05-11 04:20:48"
    },
    "Umbria": {
      "lat": "43.10675841",
      "long": "12.38824698",
      "confirmed": 275722,
      "recovered": 0,
      "deaths": 1837,
      "updated": "2022-05-11 04:20:48"
    },
    "Valle d'Aosta": {
      "lat": "45.73750286",
      "long": "7.320149366",
      "confirmed": 35694,
      "recovered": 0,
      "deaths": 533,
      "updated": "2022-05-11 04:20:48"
    },
    "Veneto": {
      "lat": "45.43490485",
      "long": "12.33845213",
      "confirmed": 1708259,
      "recovered": 0,
      "deaths": 14531,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Jamaica": {
    "All": {
      "confirmed": 131327,
      "recovered": 0,
      "deaths": 2980,
      "country": "Jamaica",
      "population": 2890299,
      "sq_km_area": 10990,
      "life_expectancy": "75.2",
      "elevation_in_meters": 18,
      "continent": "North America",
      "abbreviation": "JM",
      "location": "Caribbean",
      "iso": 388,
      "capital_city": "Kingston",
      "lat": "18.1096",
      "long": "-77.2975",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Japan": {
    "All": {
      "confirmed": 8168462,
      "recovered": 0,
      "deaths": 29898,
      "country": "Japan",
      "population": 127484450,
      "sq_km_area": 377829,
      "life_expectancy": "80.7",
      "elevation_in_meters": 438,
      "continent": "Asia",
      "abbreviation": "JP",
      "location": "Eastern Asia",
      "iso": 392,
      "capital_city": "Tokyo"
    },
    "Aichi": {
      "lat": "35.035551",
      "long": "137.211621",
      "confirmed": 500955,
      "recovered": 0,
      "deaths": 2033,
      "updated": "2022-05-11 04:20:48"
    },
    "Akita": {
      "lat": "39.748679",
      "long": "140.408228",
      "confirmed": 27213,
      "recovered": 0,
      "deaths": 64,
      "updated": "2022-05-11 04:20:48"
    },
    "Aomori": {
      "lat": "40.781541",
      "long": "140.828896",
      "confirmed": 51607,
      "recovered": 0,
      "deaths": 100,
      "updated": "2022-05-11 04:20:48"
    },
    "Chiba": {
      "lat": "35.510141",
      "long": "140.198917",
      "confirmed": 430593,
      "recovered": 0,
      "deaths": 1757,
      "updated": "2022-05-11 04:20:48"
    },
    "Ehime": {
      "lat": "33.624835",
      "long": "132.856842",
      "confirmed": 35361,
      "recovered": 0,
      "deaths": 137,
      "updated": "2022-05-11 04:20:48"
    },
    "Fukui": {
      "lat": "35.846614",
      "long": "136.224654",
      "confirmed": 29392,
      "recovered": 0,
      "deaths": 45,
      "updated": "2022-05-11 04:20:48"
    },
    "Fukuoka": {
      "lat": "33.526032",
      "long": "130.666949",
      "confirmed": 388082,
      "recovered": 0,
      "deaths": 1233,
      "updated": "2022-05-11 04:20:48"
    },
    "Fukushima": {
      "lat": "37.378867",
      "long": "140.223295",
      "confirmed": 55804,
      "recovered": 0,
      "deaths": 216,
      "updated": "2022-05-11 04:20:48"
    },
    "Gifu": {
      "lat": "35.778671",
      "long": "137.055925",
      "confirmed": 88857,
      "recovered": 0,
      "deaths": 324,
      "updated": "2022-05-11 04:20:48"
    },
    "Gunma": {
      "lat": "36.504479",
      "long": "138.985605",
      "confirmed": 87893,
      "recovered": 0,
      "deaths": 309,
      "updated": "2022-05-11 04:20:48"
    },
    "Hiroshima": {
      "lat": "34.605309",
      "long": "132.788719",
      "confirmed": 135352,
      "recovered": 0,
      "deaths": 474,
      "updated": "2022-05-11 04:20:48"
    },
    "Hokkaido": {
      "lat": "43.385711",
      "long": "142.552318",
      "confirmed": 314712,
      "recovered": 0,
      "deaths": 2011,
      "updated": "2022-05-11 04:20:48"
    },
    "Hyogo": {
      "lat": "35.039913",
      "long": "134.828057",
      "confirmed": 396759,
      "recovered": 0,
      "deaths": 2210,
      "updated": "2022-05-11 04:20:48"
    },
    "Ibaraki": {
      "lat": "36.303588",
      "long": "140.319591",
      "confirmed": 148779,
      "recovered": 0,
      "deaths": 424,
      "updated": "2022-05-11 04:20:48"
    },
    "Ishikawa": {
      "lat": "36.769464",
      "long": "136.771027",
      "confirmed": 46689,
      "recovered": 0,
      "deaths": 192,
      "updated": "2022-05-11 04:20:48"
    },
    "Iwate": {
      "lat": "39.593287",
      "long": "141.361777",
      "confirmed": 29934,
      "recovered": 0,
      "deaths": 86,
      "updated": "2022-05-11 04:20:48"
    },
    "Kagawa": {
      "lat": "34.217292",
      "long": "133.969047",
      "confirmed": 42032,
      "recovered": 0,
      "deaths": 122,
      "updated": "2022-05-11 04:20:48"
    },
    "Kagoshima": {
      "lat": "31.009484",
      "long": "130.430665",
      "confirmed": 70614,
      "recovered": 0,
      "deaths": 186,
      "updated": "2022-05-11 04:20:48"
    },
    "Kanagawa": {
      "lat": "35.415312",
      "long": "139.338983",
      "confirmed": 718261,
      "recovered": 0,
      "deaths": 2153,
      "updated": "2022-05-11 04:20:48"
    },
    "Kochi": {
      "lat": "33.422519",
      "long": "133.367307",
      "confirmed": 23301,
      "recovered": 0,
      "deaths": 107,
      "updated": "2022-05-11 04:20:48"
    },
    "Kumamoto": {
      "lat": "32.608154",
      "long": "130.745231",
      "confirmed": 86784,
      "recovered": 0,
      "deaths": 285,
      "updated": "2022-05-11 04:20:48"
    },
    "Kyoto": {
      "lat": "35.253815",
      "long": "135.443341",
      "confirmed": 187485,
      "recovered": 0,
      "deaths": 706,
      "updated": "2022-05-11 04:20:48"
    },
    "Mie": {
      "lat": "34.508018",
      "long": "136.376013",
      "confirmed": 74484,
      "recovered": 0,
      "deaths": 285,
      "updated": "2022-05-11 04:20:48"
    },
    "Miyagi": {
      "lat": "38.446859",
      "long": "140.927086",
      "confirmed": 77860,
      "recovered": 0,
      "deaths": 191,
      "updated": "2022-05-11 04:20:48"
    },
    "Miyazaki": {
      "lat": "32.193204",
      "long": "131.299374",
      "confirmed": 43710,
      "recovered": 0,
      "deaths": 137,
      "updated": "2022-05-11 04:20:48"
    },
    "Nagano": {
      "lat": "36.132134",
      "long": "138.045528",
      "confirmed": 65598,
      "recovered": 0,
      "deaths": 186,
      "updated": "2022-05-11 04:20:48"
    },
    "Nagasaki": {
      "lat": "33.235712",
      "long": "129.608033",
      "confirmed": 50682,
      "recovered": 0,
      "deaths": 124,
      "updated": "2022-05-11 04:20:48"
    },
    "Nara": {
      "lat": "34.317451",
      "long": "135.871644",
      "confirmed": 85625,
      "recovered": 0,
      "deaths": 377,
      "updated": "2022-05-11 04:20:48"
    },
    "Niigata": {
      "lat": "37.521819",
      "long": "138.918647",
      "confirmed": 64254,
      "recovered": 0,
      "deaths": 91,
      "updated": "2022-05-11 04:20:48"
    },
    "Oita": {
      "lat": "33.200697",
      "long": "131.43324",
      "confirmed": 47143,
      "recovered": 0,
      "deaths": 157,
      "updated": "2022-05-11 04:20:48"
    },
    "Okayama": {
      "lat": "34.89246",
      "long": "133.826252",
      "confirmed": 85568,
      "recovered": 0,
      "deaths": 243,
      "updated": "2022-05-11 04:20:48"
    },
    "Okinawa": {
      "lat": "25.768923",
      "long": "126.668016",
      "confirmed": 176720,
      "recovered": 0,
      "deaths": 450,
      "updated": "2022-05-11 04:20:48"
    },
    "Osaka": {
      "lat": "34.620965",
      "long": "135.507481",
      "confirmed": 919133,
      "recovered": 0,
      "deaths": 4971,
      "updated": "2022-05-11 04:20:48"
    },
    "Port Quarantine": {
      "lat": "",
      "long": "",
      "confirmed": 4463,
      "recovered": 0,
      "deaths": 4,
      "updated": "2021-11-10 23:21:44"
    },
    "Saga": {
      "lat": "33.286977",
      "long": "130.115738",
      "confirmed": 47526,
      "recovered": 0,
      "deaths": 105,
      "updated": "2022-05-11 04:20:48"
    },
    "Saitama": {
      "lat": "35.997101",
      "long": "139.347635",
      "confirmed": 524756,
      "recovered": 0,
      "deaths": 1496,
      "updated": "2022-05-11 04:20:48"
    },
    "Shiga": {
      "lat": "35.215827",
      "long": "136.138064",
      "confirmed": 83682,
      "recovered": 0,
      "deaths": 216,
      "updated": "2022-05-11 04:20:48"
    },
    "Shimane": {
      "lat": "35.07076",
      "long": "132.554064",
      "confirmed": 14872,
      "recovered": 0,
      "deaths": 15,
      "updated": "2022-05-11 04:20:48"
    },
    "Shizuoka": {
      "lat": "34.916975",
      "long": "138.407784",
      "confirmed": 152674,
      "recovered": 0,
      "deaths": 404,
      "updated": "2022-05-11 04:20:48"
    },
    "Tochigi": {
      "lat": "36.689912",
      "long": "139.819213",
      "confirmed": 84482,
      "recovered": 0,
      "deaths": 266,
      "updated": "2022-05-11 04:20:48"
    },
    "Tokushima": {
      "lat": "33.919178",
      "long": "134.242091",
      "confirmed": 19612,
      "recovered": 0,
      "deaths": 80,
      "updated": "2022-05-11 04:20:48"
    },
    "Tokyo": {
      "lat": "35.711343",
      "long": "139.446921",
      "confirmed": 1471547,
      "recovered": 0,
      "deaths": 4370,
      "updated": "2022-05-11 04:20:48"
    },
    "Tottori": {
      "lat": "35.359069",
      "long": "133.863619",
      "confirmed": 13129,
      "recovered": 0,
      "deaths": 16,
      "updated": "2022-05-11 04:20:48"
    },
    "Toyama": {
      "lat": "36.637464",
      "long": "137.269346",
      "confirmed": 33305,
      "recovered": 0,
      "deaths": 92,
      "updated": "2022-05-11 04:20:48"
    },
    "Unknown": {
      "lat": "",
      "long": "",
      "confirmed": 8,
      "recovered": 0,
      "deaths": 0,
      "updated": "2021-11-10 23:21:44"
    },
    "Wakayama": {
      "lat": "33.911879",
      "long": "135.505446",
      "confirmed": 37881,
      "recovered": 0,
      "deaths": 117,
      "updated": "2022-05-11 04:20:48"
    },
    "Yamagata": {
      "lat": "38.448396",
      "long": "140.102154",
      "confirmed": 24713,
      "recovered": 0,
      "deaths": 89,
      "updated": "2022-05-11 04:20:48"
    },
    "Yamaguchi": {
      "lat": "34.20119",
      "long": "131.573293",
      "confirmed": 38600,
      "recovered": 0,
      "deaths": 174,
      "updated": "2022-05-11 04:20:48"
    },
    "Yamanashi": {
      "lat": "35.612364",
      "long": "138.611489",
      "confirmed": 29976,
      "recovered": 0,
      "deaths": 68,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Jordan": {
    "All": {
      "confirmed": 1696054,
      "recovered": 0,
      "deaths": 14066,
      "country": "Jordan",
      "population": 9702353,
      "sq_km_area": 88946,
      "life_expectancy": "77.4",
      "elevation_in_meters": 812,
      "continent": "Asia",
      "abbreviation": "JO",
      "location": "Middle East",
      "iso": 400,
      "capital_city": "Amman",
      "lat": "31.24",
      "long": "36.51",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Kazakhstan": {
    "All": {
      "confirmed": 1394644,
      "recovered": 0,
      "deaths": 19014,
      "country": "Kazakhstan",
      "population": 18204499,
      "sq_km_area": 2724900,
      "life_expectancy": "63.2",
      "elevation_in_meters": null,
      "continent": "Asia",
      "abbreviation": "KZ",
      "location": "Southern and Central Asia",
      "iso": null,
      "capital_city": "Astana",
      "lat": "48.0196",
      "long": "66.9237",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Kenya": {
    "All": {
      "confirmed": 323921,
      "recovered": 0,
      "deaths": 5649,
      "country": "Kenya",
      "population": 49699862,
      "sq_km_area": 580367,
      "life_expectancy": 48,
      "elevation_in_meters": 762,
      "continent": "Africa",
      "abbreviation": "KE",
      "location": "Eastern Africa",
      "iso": 404,
      "capital_city": "Nairobi",
      "lat": "-0.0236",
      "long": "37.9062",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Kiribati": {
    "All": {
      "confirmed": 3093,
      "recovered": 0,
      "deaths": 13,
      "country": "Kiribati",
      "population": 116398,
      "sq_km_area": 726,
      "life_expectancy": "59.8",
      "elevation_in_meters": null,
      "continent": "Oceania",
      "abbreviation": "KI",
      "location": "Micronesia",
      "iso": 296,
      "capital_city": "Bairiki",
      "lat": "-3.3704",
      "long": "-168.734",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Korea, South": {
    "All": {
      "confirmed": 17658794,
      "recovered": 0,
      "deaths": 23491,
      "country": "Korea, South",
      "population": 50982212,
      "sq_km_area": 99434,
      "life_expectancy": "74.4",
      "elevation_in_meters": 282,
      "continent": "Asia",
      "abbreviation": "KR",
      "location": "Eastern Asia",
      "iso": 410,
      "capital_city": "Seoul",
      "lat": "35.907757",
      "long": "127.766922",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Kosovo": {
    "All": {
      "confirmed": 228150,
      "recovered": 0,
      "deaths": 3138,
      "lat": "42.602636",
      "long": "20.902977",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Kuwait": {
    "All": {
      "confirmed": 631898,
      "recovered": 0,
      "deaths": 2555,
      "country": "Kuwait",
      "population": 4136528,
      "sq_km_area": 17818,
      "life_expectancy": "76.1",
      "elevation_in_meters": 108,
      "continent": "Asia",
      "abbreviation": "KW",
      "location": "Middle East",
      "iso": 414,
      "capital_city": "Kuwait",
      "lat": "29.31166",
      "long": "47.481766",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Kyrgyzstan": {
    "All": {
      "confirmed": 200993,
      "recovered": 0,
      "deaths": 2991,
      "country": "Kyrgyzstan",
      "population": 6045117,
      "sq_km_area": 199900,
      "life_expectancy": "63.4",
      "elevation_in_meters": "2,988",
      "continent": "Asia",
      "abbreviation": "KG",
      "location": "Southern and Central Asia",
      "iso": 417,
      "capital_city": "Bishkek",
      "lat": "41.20438",
      "long": "74.766098",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Laos": {
    "All": {
      "confirmed": 208939,
      "recovered": 0,
      "deaths": 752,
      "country": "Laos",
      "population": 6858160,
      "sq_km_area": 236800,
      "life_expectancy": "53.1",
      "elevation_in_meters": 710,
      "continent": "Asia",
      "abbreviation": "LA",
      "location": "Southeast Asia",
      "iso": 418,
      "capital_city": "Vientiane",
      "lat": "19.85627",
      "long": "102.495496",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Latvia": {
    "All": {
      "confirmed": 824926,
      "recovered": 0,
      "deaths": 5792,
      "country": "Latvia",
      "population": 1949670,
      "sq_km_area": 64589,
      "life_expectancy": "68.4",
      "elevation_in_meters": 87,
      "continent": "Europe",
      "abbreviation": "LV",
      "location": "Baltic Countries",
      "iso": 428,
      "capital_city": "Riga",
      "lat": "56.8796",
      "long": "24.6032",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Lebanon": {
    "All": {
      "confirmed": 1097643,
      "recovered": 0,
      "deaths": 10402,
      "country": "Lebanon",
      "population": 6082357,
      "sq_km_area": 10400,
      "life_expectancy": "71.3",
      "elevation_in_meters": "1,250",
      "continent": "Asia",
      "abbreviation": "LB",
      "location": "Middle East",
      "iso": 422,
      "capital_city": "Beirut",
      "lat": "33.8547",
      "long": "35.8623",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Lesotho": {
    "All": {
      "confirmed": 33151,
      "recovered": 0,
      "deaths": 697,
      "country": "Lesotho",
      "population": 2233339,
      "sq_km_area": 30355,
      "life_expectancy": "50.8",
      "elevation_in_meters": "2,161",
      "continent": "Africa",
      "abbreviation": "LS",
      "location": "Southern Africa",
      "iso": 426,
      "capital_city": "Maseru",
      "lat": "-29.61",
      "long": "28.2336",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Liberia": {
    "All": {
      "confirmed": 7434,
      "recovered": 0,
      "deaths": 294,
      "country": "Liberia",
      "population": 4731906,
      "sq_km_area": 111369,
      "life_expectancy": 51,
      "elevation_in_meters": 243,
      "continent": "Africa",
      "abbreviation": "LR",
      "location": "Western Africa",
      "iso": 430,
      "capital_city": "Monrovia",
      "lat": "6.428055",
      "long": "-9.429499",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Libya": {
    "All": {
      "confirmed": 501919,
      "recovered": 0,
      "deaths": 6430,
      "country": "Libya",
      "population": 5605000,
      "sq_km_area": 1759540,
      "life_expectancy": "75.5",
      "elevation_in_meters": null,
      "continent": "Africa",
      "abbreviation": "LY",
      "location": "Northern Africa",
      "iso": null,
      "capital_city": "Tripoli",
      "lat": "26.3351",
      "long": "17.228331",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Liechtenstein": {
    "All": {
      "confirmed": 17292,
      "recovered": 0,
      "deaths": 84,
      "country": "Liechtenstein",
      "population": 37922,
      "sq_km_area": 160,
      "life_expectancy": "78.8",
      "elevation_in_meters": null,
      "continent": "Europe",
      "abbreviation": "LI",
      "location": "Western Europe",
      "iso": 438,
      "capital_city": "Vaduz",
      "lat": "47.14",
      "long": "9.55",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Lithuania": {
    "All": {
      "confirmed": 1059836,
      "recovered": 0,
      "deaths": 9121,
      "country": "Lithuania",
      "population": 2890297,
      "sq_km_area": 65301,
      "life_expectancy": "69.1",
      "elevation_in_meters": 110,
      "continent": "Europe",
      "abbreviation": "LT",
      "location": "Baltic Countries",
      "iso": 440,
      "capital_city": "Vilnius",
      "lat": "55.1694",
      "long": "23.8813",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Luxembourg": {
    "All": {
      "confirmed": 242194,
      "recovered": 0,
      "deaths": 1071,
      "country": "Luxembourg",
      "population": 583455,
      "sq_km_area": 2586,
      "life_expectancy": "77.1",
      "elevation_in_meters": 325,
      "continent": "Europe",
      "abbreviation": "LU",
      "location": "Western Europe",
      "iso": 442,
      "capital_city": "Luxembourg [Luxemburg/L",
      "lat": "49.8153",
      "long": "6.1296",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "MS Zaandam": {
    "All": {
      "confirmed": 9,
      "recovered": 0,
      "deaths": 2,
      "lat": "",
      "long": "",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Madagascar": {
    "All": {
      "confirmed": 64236,
      "recovered": 0,
      "deaths": 1393,
      "country": "Madagascar",
      "population": 25570895,
      "sq_km_area": 587041,
      "life_expectancy": 55,
      "elevation_in_meters": 615,
      "continent": "Africa",
      "abbreviation": "MG",
      "location": "Eastern Africa",
      "iso": 450,
      "capital_city": "Antananarivo",
      "lat": "-18.766947",
      "long": "46.869107",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Malawi": {
    "All": {
      "confirmed": 85825,
      "recovered": 0,
      "deaths": 2635,
      "country": "Malawi",
      "population": 18622104,
      "sq_km_area": 118484,
      "life_expectancy": "37.6",
      "elevation_in_meters": 779,
      "continent": "Africa",
      "abbreviation": "MW",
      "location": "Eastern Africa",
      "iso": 454,
      "capital_city": "Lilongwe",
      "lat": "-13.2543",
      "long": "34.3015",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Malaysia": {
    "All": {
      "confirmed": 4463740,
      "recovered": 0,
      "deaths": 35590,
      "country": "Malaysia",
      "population": 31624264,
      "sq_km_area": 329758,
      "life_expectancy": "70.8",
      "elevation_in_meters": 538,
      "continent": "Asia",
      "abbreviation": "MY",
      "location": "Southeast Asia",
      "iso": 458,
      "capital_city": "Kuala Lumpur"
    },
    "Johor": {
      "lat": "1.4854",
      "long": "103.7618",
      "confirmed": 382907,
      "recovered": 0,
      "deaths": 4507,
      "updated": "2022-05-11 04:20:48"
    },
    "Kedah": {
      "lat": "6.1184",
      "long": "100.3685",
      "confirmed": 299156,
      "recovered": 0,
      "deaths": 2635,
      "updated": "2022-05-11 04:20:48"
    },
    "Kelantan": {
      "lat": "6.1254",
      "long": "102.2381",
      "confirmed": 247554,
      "recovered": 0,
      "deaths": 1419,
      "updated": "2022-05-11 04:20:48"
    },
    "Melaka": {
      "lat": "2.1896",
      "long": "102.2501",
      "confirmed": 122609,
      "recovered": 0,
      "deaths": 1118,
      "updated": "2022-05-11 04:20:48"
    },
    "Negeri Sembilan": {
      "lat": "2.7258",
      "long": "101.9424",
      "confirmed": 202378,
      "recovered": 0,
      "deaths": 1472,
      "updated": "2022-05-11 04:20:48"
    },
    "Pahang": {
      "lat": "3.8126",
      "long": "103.3256",
      "confirmed": 171070,
      "recovered": 0,
      "deaths": 972,
      "updated": "2022-05-11 04:20:48"
    },
    "Perak": {
      "lat": "4.5921",
      "long": "101.0901",
      "confirmed": 201418,
      "recovered": 0,
      "deaths": 1916,
      "updated": "2022-05-11 04:20:48"
    },
    "Perlis": {
      "lat": "6.4449",
      "long": "100.2048",
      "confirmed": 17329,
      "recovered": 0,
      "deaths": 183,
      "updated": "2022-05-11 04:20:48"
    },
    "Pulau Pinang": {
      "lat": "5.4141",
      "long": "100.3288",
      "confirmed": 278482,
      "recovered": 0,
      "deaths": 1986,
      "updated": "2022-05-11 04:20:48"
    },
    "Sabah": {
      "lat": "5.9788",
      "long": "116.0753",
      "confirmed": 371003,
      "recovered": 0,
      "deaths": 3124,
      "updated": "2022-05-11 04:20:48"
    },
    "Sarawak": {
      "lat": "1.5533",
      "long": "110.3592",
      "confirmed": 305721,
      "recovered": 0,
      "deaths": 1731,
      "updated": "2022-05-11 04:20:48"
    },
    "Selangor": {
      "lat": "3.0738",
      "long": "101.5183",
      "confirmed": 1347006,
      "recovered": 0,
      "deaths": 10644,
      "updated": "2022-05-11 04:20:48"
    },
    "Terengganu": {
      "lat": "5.3117",
      "long": "103.1324",
      "confirmed": 125898,
      "recovered": 0,
      "deaths": 865,
      "updated": "2022-05-11 04:20:48"
    },
    "Unknown": {
      "lat": "",
      "long": "",
      "confirmed": 0,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "W.P. Kuala Lumpur": {
      "lat": "3.139",
      "long": "101.6869",
      "confirmed": 350293,
      "recovered": 0,
      "deaths": 2820,
      "updated": "2022-05-11 04:20:48"
    },
    "W.P. Labuan": {
      "lat": "5.2831",
      "long": "115.2308",
      "confirmed": 21340,
      "recovered": 0,
      "deaths": 155,
      "updated": "2022-05-11 04:20:48"
    },
    "W.P. Putrajaya": {
      "lat": "2.9264",
      "long": "101.6964",
      "confirmed": 19576,
      "recovered": 0,
      "deaths": 43,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Maldives": {
    "All": {
      "confirmed": 179483,
      "recovered": 0,
      "deaths": 298,
      "country": "Maldives",
      "population": 436330,
      "sq_km_area": 298,
      "life_expectancy": "62.2",
      "elevation_in_meters": "1.8",
      "continent": "Asia",
      "abbreviation": "MV",
      "location": "Southern and Central Asia",
      "iso": 462,
      "capital_city": "Male",
      "lat": "3.2028",
      "long": "73.2207",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Mali": {
    "All": {
      "confirmed": 30950,
      "recovered": 0,
      "deaths": 733,
      "country": "Mali",
      "population": 18541980,
      "sq_km_area": 1240192,
      "life_expectancy": "46.7",
      "elevation_in_meters": 343,
      "continent": "Africa",
      "abbreviation": "ML",
      "location": "Western Africa",
      "iso": 466,
      "capital_city": "Bamako",
      "lat": "17.570692",
      "long": "-3.996166",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Malta": {
    "All": {
      "confirmed": 93041,
      "recovered": 0,
      "deaths": 713,
      "country": "Malta",
      "population": 430835,
      "sq_km_area": 316,
      "life_expectancy": "77.9",
      "elevation_in_meters": null,
      "continent": "Europe",
      "abbreviation": "MT",
      "location": "Southern Europe",
      "iso": 470,
      "capital_city": "Valletta",
      "lat": "35.9375",
      "long": "14.3754",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Marshall Islands": {
    "All": {
      "confirmed": 17,
      "recovered": 0,
      "deaths": 0,
      "country": "Marshall Islands",
      "population": 53127,
      "sq_km_area": 181,
      "life_expectancy": "65.5",
      "elevation_in_meters": null,
      "continent": "Oceania",
      "abbreviation": "MH",
      "location": "Micronesia",
      "iso": 584,
      "capital_city": "Dalap-Uliga-Darrit",
      "lat": "7.1315",
      "long": "171.1845",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Mauritania": {
    "All": {
      "confirmed": 58778,
      "recovered": 0,
      "deaths": 982,
      "country": "Mauritania",
      "population": 4420184,
      "sq_km_area": 1025520,
      "life_expectancy": "50.8",
      "elevation_in_meters": 276,
      "continent": "Africa",
      "abbreviation": "MR",
      "location": "Western Africa",
      "iso": 478,
      "capital_city": "Nouakchott",
      "lat": "21.0079",
      "long": "-10.9408",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Mauritius": {
    "All": {
      "confirmed": 222848,
      "recovered": 0,
      "deaths": 996,
      "country": "Mauritius",
      "population": 1265138,
      "sq_km_area": 2040,
      "life_expectancy": 71,
      "elevation_in_meters": null,
      "continent": "Africa",
      "abbreviation": "MU",
      "location": "Eastern Africa",
      "iso": 480,
      "capital_city": "Port-Louis",
      "lat": "-20.348404",
      "long": "57.552152",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Mexico": {
    "All": {
      "confirmed": 5745652,
      "recovered": 0,
      "deaths": 324465,
      "country": "Mexico",
      "population": 129163276,
      "sq_km_area": 1958201,
      "life_expectancy": "71.5",
      "elevation_in_meters": "1,111",
      "continent": "North America",
      "abbreviation": "MX",
      "location": "Central America",
      "iso": 484,
      "capital_city": "Ciudad de M",
      "lat": "19.4969",
      "long": "-99.7233"
    },
    "Aguascalientes": {
      "lat": "21.8853",
      "long": "-102.2916",
      "confirmed": 66137,
      "recovered": 0,
      "deaths": 3502,
      "updated": "2022-05-11 04:20:48"
    },
    "Baja California": {
      "lat": "30.8406",
      "long": "-115.2838",
      "confirmed": 134242,
      "recovered": 0,
      "deaths": 12277,
      "updated": "2022-05-11 04:20:48"
    },
    "Baja California Sur": {
      "lat": "26.0444",
      "long": "-111.6661",
      "confirmed": 103822,
      "recovered": 0,
      "deaths": 2689,
      "updated": "2022-05-11 04:20:48"
    },
    "Campeche": {
      "lat": "19.8301",
      "long": "-90.5349",
      "confirmed": 34111,
      "recovered": 0,
      "deaths": 2242,
      "updated": "2022-05-11 04:20:48"
    },
    "Chiapas": {
      "lat": "16.7569",
      "long": "-93.1292",
      "confirmed": 39224,
      "recovered": 0,
      "deaths": 2411,
      "updated": "2022-05-11 04:20:48"
    },
    "Chihuahua": {
      "lat": "28.633",
      "long": "-106.0691",
      "confirmed": 131652,
      "recovered": 0,
      "deaths": 9959,
      "updated": "2022-05-11 04:20:48"
    },
    "Ciudad de Mexico": {
      "lat": "19.4326",
      "long": "-99.1332",
      "confirmed": 1399114,
      "recovered": 0,
      "deaths": 42799,
      "updated": "2022-05-11 04:20:48"
    },
    "Coahuila": {
      "lat": "27.0587",
      "long": "-101.7068",
      "confirmed": 145507,
      "recovered": 0,
      "deaths": 8797,
      "updated": "2022-05-11 04:20:48"
    },
    "Colima": {
      "lat": "19.1223",
      "long": "-104.0072",
      "confirmed": 54791,
      "recovered": 0,
      "deaths": 2202,
      "updated": "2022-05-11 04:20:48"
    },
    "Durango": {
      "lat": "24.5593",
      "long": "-104.6588",
      "confirmed": 68252,
      "recovered": 0,
      "deaths": 3616,
      "updated": "2022-05-11 04:20:48"
    },
    "Guanajuato": {
      "lat": "21.019",
      "long": "-101.2574",
      "confirmed": 282183,
      "recovered": 0,
      "deaths": 14887,
      "updated": "2022-05-11 04:20:48"
    },
    "Guerrero": {
      "lat": "17.4392",
      "long": "-99.5451",
      "confirmed": 98402,
      "recovered": 0,
      "deaths": 6758,
      "updated": "2022-05-11 04:20:48"
    },
    "Hidalgo": {
      "lat": "20.0911",
      "long": "-98.7624",
      "confirmed": 93553,
      "recovered": 0,
      "deaths": 8410,
      "updated": "2022-05-11 04:20:48"
    },
    "Jalisco": {
      "lat": "20.6595",
      "long": "-103.3494",
      "confirmed": 245702,
      "recovered": 0,
      "deaths": 19620,
      "updated": "2022-05-11 04:20:48"
    },
    "Mexico": {
      "lat": "19.4969",
      "long": "-99.7233",
      "confirmed": 572400,
      "recovered": 0,
      "deaths": 47244,
      "updated": "2022-05-11 04:20:48"
    },
    "Michoacan": {
      "lat": "19.5665",
      "long": "-101.7068",
      "confirmed": 94180,
      "recovered": 0,
      "deaths": 8827,
      "updated": "2022-05-11 04:20:48"
    },
    "Morelos": {
      "lat": "18.6813",
      "long": "-99.1013",
      "confirmed": 70280,
      "recovered": 0,
      "deaths": 5270,
      "updated": "2022-05-11 04:20:48"
    },
    "Nayarit": {
      "lat": "21.7514",
      "long": "-104.8455",
      "confirmed": 58266,
      "recovered": 0,
      "deaths": 3200,
      "updated": "2022-05-11 04:20:48"
    },
    "Nuevo Leon": {
      "lat": "25.5922",
      "long": "-99.9962",
      "confirmed": 319587,
      "recovered": 0,
      "deaths": 15005,
      "updated": "2022-05-11 04:20:48"
    },
    "Oaxaca": {
      "lat": "17.0732",
      "long": "-96.7266",
      "confirmed": 120093,
      "recovered": 0,
      "deaths": 6191,
      "updated": "2022-05-11 04:20:48"
    },
    "Puebla": {
      "lat": "19.0414",
      "long": "-98.2063",
      "confirmed": 169683,
      "recovered": 0,
      "deaths": 16452,
      "updated": "2022-05-11 04:20:48"
    },
    "Queretaro": {
      "lat": "20.5888",
      "long": "-100.3899",
      "confirmed": 142136,
      "recovered": 0,
      "deaths": 6195,
      "updated": "2022-05-11 04:20:48"
    },
    "Quintana Roo": {
      "lat": "19.1817",
      "long": "-88.4791",
      "confirmed": 91986,
      "recovered": 0,
      "deaths": 4380,
      "updated": "2022-05-11 04:20:48"
    },
    "San Luis Potosi": {
      "lat": "22.1565",
      "long": "-100.9855",
      "confirmed": 186388,
      "recovered": 0,
      "deaths": 7484,
      "updated": "2022-05-11 04:20:48"
    },
    "Sinaloa": {
      "lat": "25.1721",
      "long": "-107.4795",
      "confirmed": 122053,
      "recovered": 0,
      "deaths": 9724,
      "updated": "2022-05-11 04:20:48"
    },
    "Sonora": {
      "lat": "29.2972",
      "long": "-110.3309",
      "confirmed": 165650,
      "recovered": 0,
      "deaths": 10119,
      "updated": "2022-05-11 04:20:48"
    },
    "Tabasco": {
      "lat": "17.8409",
      "long": "-92.6189",
      "confirmed": 189805,
      "recovered": 0,
      "deaths": 6047,
      "updated": "2022-05-11 04:20:48"
    },
    "Tamaulipas": {
      "lat": "24.2669",
      "long": "-98.8363",
      "confirmed": 146335,
      "recovered": 0,
      "deaths": 7992,
      "updated": "2022-05-11 04:20:48"
    },
    "Tlaxcala": {
      "lat": "19.3139",
      "long": "-98.2404",
      "confirmed": 43849,
      "recovered": 0,
      "deaths": 3073,
      "updated": "2022-05-11 04:20:48"
    },
    "Unknown": {
      "lat": "",
      "long": "",
      "confirmed": 0,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Veracruz": {
      "lat": "19.1738",
      "long": "-96.1342",
      "confirmed": 179213,
      "recovered": 0,
      "deaths": 16426,
      "updated": "2022-05-11 04:20:48"
    },
    "Yucatan": {
      "lat": "20.7099",
      "long": "-89.0943",
      "confirmed": 109376,
      "recovered": 0,
      "deaths": 6809,
      "updated": "2022-05-11 04:20:48"
    },
    "Zacatecas": {
      "lat": "22.7709",
      "long": "-102.5832",
      "confirmed": 67680,
      "recovered": 0,
      "deaths": 3858,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Micronesia": {
    "All": {
      "confirmed": 7,
      "recovered": 0,
      "deaths": 0,
      "lat": "7.4256",
      "long": "150.5508",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Moldova": {
    "All": {
      "confirmed": 518166,
      "recovered": 0,
      "deaths": 11516,
      "country": "Moldova",
      "population": 4051212,
      "sq_km_area": 33851,
      "life_expectancy": "64.5",
      "elevation_in_meters": 139,
      "continent": "Europe",
      "abbreviation": "MD",
      "location": "Eastern Europe",
      "iso": 498,
      "capital_city": "Chisinau",
      "lat": "47.4116",
      "long": "28.3699",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Monaco": {
    "All": {
      "confirmed": 11972,
      "recovered": 0,
      "deaths": 57,
      "country": "Monaco",
      "population": 38695,
      "sq_km_area": 1.5,
      "life_expectancy": "78.8",
      "elevation_in_meters": null,
      "continent": "Europe",
      "abbreviation": "MC",
      "location": "Western Europe",
      "iso": 492,
      "capital_city": "Monaco-Ville",
      "lat": "43.7333",
      "long": "7.4167",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Mongolia": {
    "All": {
      "confirmed": 920781,
      "recovered": 0,
      "deaths": 2179,
      "country": "Mongolia",
      "population": 3075647,
      "sq_km_area": 1566500,
      "life_expectancy": "67.3",
      "elevation_in_meters": "1,528",
      "continent": "Asia",
      "abbreviation": "MN",
      "location": "Eastern Asia",
      "iso": 496,
      "capital_city": "Ulan Bator",
      "lat": "46.8625",
      "long": "103.8467",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Montenegro": {
    "All": {
      "confirmed": 235945,
      "recovered": 0,
      "deaths": 2717,
      "lat": "42.708678",
      "long": "19.37439",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Morocco": {
    "All": {
      "confirmed": 1165366,
      "recovered": 0,
      "deaths": 16071,
      "country": "Morocco",
      "population": 35739580,
      "sq_km_area": 446550,
      "life_expectancy": "69.1",
      "elevation_in_meters": 909,
      "continent": "Africa",
      "abbreviation": "MA",
      "location": "Northern Africa",
      "iso": 504,
      "capital_city": "Rabat",
      "lat": "31.7917",
      "long": "-7.0926",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Mozambique": {
    "All": {
      "confirmed": 225440,
      "recovered": 0,
      "deaths": 2201,
      "country": "Mozambique",
      "population": 29668834,
      "sq_km_area": 801590,
      "life_expectancy": "37.5",
      "elevation_in_meters": 345,
      "continent": "Africa",
      "abbreviation": "MZ",
      "location": "Eastern Africa",
      "iso": 508,
      "capital_city": "Maputo",
      "lat": "-18.665695",
      "long": "35.529562",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Namibia": {
    "All": {
      "confirmed": 159311,
      "recovered": 0,
      "deaths": 4028,
      "country": "Namibia",
      "population": 2533794,
      "sq_km_area": 824292,
      "life_expectancy": "42.5",
      "elevation_in_meters": "1,141",
      "continent": "Africa",
      "abbreviation": "NA",
      "location": "Southern Africa",
      "iso": 516,
      "capital_city": "Windhoek",
      "lat": "-22.9576",
      "long": "18.4904",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Nepal": {
    "All": {
      "confirmed": 978960,
      "recovered": 0,
      "deaths": 11952,
      "country": "Nepal",
      "population": 29304998,
      "sq_km_area": 147181,
      "life_expectancy": "57.8",
      "elevation_in_meters": "3,265",
      "continent": "Asia",
      "abbreviation": "NP",
      "location": "Southern and Central Asia",
      "iso": 524,
      "capital_city": "Kathmandu",
      "lat": "28.1667",
      "long": "84.25",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Netherlands": {
    "All": {
      "confirmed": 8244881,
      "recovered": 0,
      "deaths": 22910,
      "country": "Netherlands",
      "population": 17035938,
      "sq_km_area": 41526,
      "life_expectancy": "78.3",
      "elevation_in_meters": 30,
      "continent": "Europe",
      "abbreviation": "NL",
      "location": "Western Europe",
      "iso": 528,
      "capital_city": "Amsterdam"
    },
    "Aruba": {
      "lat": "12.5211",
      "long": "-69.9683",
      "confirmed": 35189,
      "recovered": 0,
      "deaths": 212,
      "updated": "2022-05-11 04:20:48"
    },
    "Bonaire, Sint Eustatius and Saba": {
      "lat": "12.1784",
      "long": "-68.2385",
      "confirmed": 9902,
      "recovered": 0,
      "deaths": 35,
      "updated": "2022-05-11 04:20:48"
    },
    "Curacao": {
      "lat": "12.1696",
      "long": "-68.99",
      "confirmed": 42567,
      "recovered": 0,
      "deaths": 275,
      "updated": "2022-05-11 04:20:48"
    },
    "Drenthe": {
      "lat": "52.862485",
      "long": "6.618435",
      "confirmed": 202225,
      "recovered": 0,
      "deaths": 451,
      "updated": "2022-05-11 04:20:48"
    },
    "Flevoland": {
      "lat": "52.550383",
      "long": "5.515162",
      "confirmed": 183432,
      "recovered": 0,
      "deaths": 331,
      "updated": "2022-05-11 04:20:48"
    },
    "Friesland": {
      "lat": "53.087337",
      "long": "5.7925",
      "confirmed": 277414,
      "recovered": 0,
      "deaths": 617,
      "updated": "2022-05-11 04:20:48"
    },
    "Gelderland": {
      "lat": "52.061738",
      "long": "5.939114",
      "confirmed": 983788,
      "recovered": 0,
      "deaths": 2797,
      "updated": "2022-05-11 04:20:48"
    },
    "Groningen": {
      "lat": "53.217922",
      "long": "6.741514",
      "confirmed": 247960,
      "recovered": 0,
      "deaths": 355,
      "updated": "2022-05-11 04:20:48"
    },
    "Limburg": {
      "lat": "51.209227",
      "long": "5.93387",
      "confirmed": 528234,
      "recovered": 0,
      "deaths": 2165,
      "updated": "2022-05-11 04:20:48"
    },
    "Noord-Brabant": {
      "lat": "51.561174",
      "long": "5.184942",
      "confirmed": 1233959,
      "recovered": 0,
      "deaths": 3695,
      "updated": "2022-05-11 04:20:48"
    },
    "Noord-Holland": {
      "lat": "52.600906",
      "long": "4.918688",
      "confirmed": 1320321,
      "recovered": 0,
      "deaths": 3370,
      "updated": "2022-05-11 04:20:48"
    },
    "Overijssel": {
      "lat": "52.444558",
      "long": "6.441722",
      "confirmed": 565125,
      "recovered": 0,
      "deaths": 1416,
      "updated": "2022-05-11 04:20:48"
    },
    "Sint Maarten": {
      "lat": "18.0425",
      "long": "-63.0548",
      "confirmed": 10123,
      "recovered": 0,
      "deaths": 86,
      "updated": "2022-05-11 04:20:48"
    },
    "Unknown": {
      "lat": "",
      "long": "",
      "confirmed": 84139,
      "recovered": 0,
      "deaths": 21,
      "updated": "2022-02-28 23:21:00"
    },
    "Utrecht": {
      "lat": "52.084251",
      "long": "5.163824",
      "confirmed": 662795,
      "recovered": 0,
      "deaths": 1535,
      "updated": "2022-05-11 04:20:48"
    },
    "Zeeland": {
      "lat": "51.47936",
      "long": "3.861559",
      "confirmed": 168005,
      "recovered": 0,
      "deaths": 390,
      "updated": "2022-05-11 04:20:48"
    },
    "Zuid-Holland": {
      "lat": "51.937835",
      "long": "4.462114",
      "confirmed": 1689703,
      "recovered": 0,
      "deaths": 5159,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "New Zealand": {
    "All": {
      "confirmed": 1013721,
      "recovered": 0,
      "deaths": 855,
      "country": "New Zealand",
      "population": 4705818,
      "sq_km_area": 270534,
      "life_expectancy": "77.8",
      "elevation_in_meters": 388,
      "continent": "Oceania",
      "abbreviation": "NZ",
      "location": "Australia and New Zealand",
      "iso": 554,
      "capital_city": "Wellington",
      "lat": "-40.9006",
      "long": "174.886",
      "updated": "2022-05-11 04:20:48"
    },
    "Cook Islands": {
      "lat": "-21.2367",
      "long": "-159.7777",
      "confirmed": 5336,
      "recovered": 0,
      "deaths": 1,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Nicaragua": {
    "All": {
      "confirmed": 18491,
      "recovered": 0,
      "deaths": 235,
      "country": "Nicaragua",
      "population": 6217581,
      "sq_km_area": 130000,
      "life_expectancy": "68.7",
      "elevation_in_meters": 298,
      "continent": "North America",
      "abbreviation": "NI",
      "location": "Central America",
      "iso": 558,
      "capital_city": "Managua",
      "lat": "12.865416",
      "long": "-85.207229",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Niger": {
    "All": {
      "confirmed": 9005,
      "recovered": 0,
      "deaths": 309,
      "country": "Niger",
      "population": 21477348,
      "sq_km_area": 1267000,
      "life_expectancy": "41.3",
      "elevation_in_meters": 474,
      "continent": "Africa",
      "abbreviation": "NE",
      "location": "Western Africa",
      "iso": 562,
      "capital_city": "Niamey",
      "lat": "17.607789",
      "long": "8.081666",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Nigeria": {
    "All": {
      "confirmed": 255802,
      "recovered": 0,
      "deaths": 3143,
      "country": "Nigeria",
      "population": 190886311,
      "sq_km_area": 923768,
      "life_expectancy": "51.6",
      "elevation_in_meters": 380,
      "continent": "Africa",
      "abbreviation": "NG",
      "location": "Western Africa",
      "iso": 566,
      "capital_city": "Abuja",
      "lat": "9.082",
      "long": "8.6753",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "North Macedonia": {
    "All": {
      "confirmed": 310413,
      "recovered": 0,
      "deaths": 9287,
      "country": "North Macedonia",
      "population": 2024000,
      "sq_km_area": 25713,
      "life_expectancy": "73.8",
      "elevation_in_meters": 741,
      "continent": "Europe",
      "abbreviation": "MK",
      "location": "Southern Europe",
      "iso": 807,
      "capital_city": "Skopje",
      "lat": "41.6086",
      "long": "21.7453",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Norway": {
    "All": {
      "confirmed": 1428699,
      "recovered": 0,
      "deaths": 3006,
      "country": "Norway",
      "population": 5305383,
      "sq_km_area": 323877,
      "life_expectancy": "78.7",
      "elevation_in_meters": 460,
      "continent": "Europe",
      "abbreviation": "NO",
      "location": "Nordic Countries",
      "iso": 578,
      "capital_city": "Oslo",
      "lat": "60.472",
      "long": "8.4689",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Oman": {
    "All": {
      "confirmed": 389325,
      "recovered": 0,
      "deaths": 4259,
      "country": "Oman",
      "population": 4636262,
      "sq_km_area": 309500,
      "life_expectancy": "71.8",
      "elevation_in_meters": 310,
      "continent": "Asia",
      "abbreviation": "OM",
      "location": "Middle East",
      "iso": 512,
      "capital_city": "Masqat",
      "lat": "21.512583",
      "long": "55.923255",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Pakistan": {
    "All": {
      "confirmed": 1528833,
      "recovered": 0,
      "deaths": 30375,
      "country": "Pakistan",
      "population": 197015955,
      "sq_km_area": 796095,
      "life_expectancy": "61.1",
      "elevation_in_meters": 900,
      "continent": "Asia",
      "abbreviation": "PK",
      "location": "Southern and Central Asia",
      "iso": 586,
      "capital_city": "Islamabad"
    },
    "Azad Jammu and Kashmir": {
      "lat": "34.027401",
      "long": "73.947253",
      "confirmed": 43314,
      "recovered": 0,
      "deaths": 792,
      "updated": "2022-05-11 04:20:48"
    },
    "Balochistan": {
      "lat": "28.328492",
      "long": "65.898403",
      "confirmed": 35486,
      "recovered": 0,
      "deaths": 378,
      "updated": "2022-05-11 04:20:48"
    },
    "Gilgit-Baltistan": {
      "lat": "35.792146",
      "long": "74.982138",
      "confirmed": 11745,
      "recovered": 0,
      "deaths": 191,
      "updated": "2022-05-11 04:20:48"
    },
    "Islamabad": {
      "lat": "33.665087",
      "long": "73.121219",
      "confirmed": 135246,
      "recovered": 0,
      "deaths": 1024,
      "updated": "2022-05-11 04:20:48"
    },
    "Khyber Pakhtunkhwa": {
      "lat": "34.485332",
      "long": "72.09169",
      "confirmed": 219554,
      "recovered": 0,
      "deaths": 6324,
      "updated": "2022-05-11 04:20:48"
    },
    "Punjab": {
      "lat": "30.811346",
      "long": "72.139132",
      "confirmed": 506499,
      "recovered": 0,
      "deaths": 13562,
      "updated": "2022-05-11 04:20:48"
    },
    "Sindh": {
      "lat": "26.009446",
      "long": "68.776807",
      "confirmed": 576989,
      "recovered": 0,
      "deaths": 8104,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Palau": {
    "All": {
      "confirmed": 4782,
      "recovered": 0,
      "deaths": 6,
      "country": "Palau",
      "population": 21729,
      "sq_km_area": 459,
      "life_expectancy": "68.6",
      "elevation_in_meters": null,
      "continent": "Oceania",
      "abbreviation": "PW",
      "location": "Micronesia",
      "iso": 585,
      "capital_city": "Koror",
      "lat": "7.515",
      "long": "134.5825",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Panama": {
    "All": {
      "confirmed": 793137,
      "recovered": 0,
      "deaths": 8194,
      "country": "Panama",
      "population": 4098587,
      "sq_km_area": 75517,
      "life_expectancy": "75.5",
      "elevation_in_meters": 360,
      "continent": "North America",
      "abbreviation": "PA",
      "location": "Central America",
      "iso": 591,
      "capital_city": "Ciudad de Panam",
      "lat": "8.538",
      "long": "-80.7821",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Papua New Guinea": {
    "All": {
      "confirmed": 43839,
      "recovered": 0,
      "deaths": 651,
      "country": "Papua New Guinea",
      "population": 8251162,
      "sq_km_area": 462840,
      "life_expectancy": "63.1",
      "elevation_in_meters": 667,
      "continent": "Oceania",
      "abbreviation": "PG",
      "location": "Melanesia",
      "iso": 598,
      "capital_city": "Port Moresby",
      "lat": "-6.314993",
      "long": "143.95555",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Paraguay": {
    "All": {
      "confirmed": 649718,
      "recovered": 0,
      "deaths": 18872,
      "country": "Paraguay",
      "population": 6811297,
      "sq_km_area": 406752,
      "life_expectancy": "73.7",
      "elevation_in_meters": 178,
      "continent": "South America",
      "abbreviation": "PY",
      "location": "South America",
      "iso": 600,
      "capital_city": "Asunci",
      "lat": "-23.4425",
      "long": "-58.4438",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Peru": {
    "All": {
      "confirmed": 3570339,
      "recovered": 0,
      "deaths": 212968,
      "country": "Peru",
      "population": 32165485,
      "sq_km_area": 1285216,
      "life_expectancy": 70,
      "elevation_in_meters": "1,555",
      "continent": "South America",
      "abbreviation": "PE",
      "location": "South America",
      "iso": 604,
      "capital_city": "Lima"
    },
    "Amazonas": {
      "lat": "-5.077253",
      "long": "-78.050172",
      "confirmed": 44213,
      "recovered": 0,
      "deaths": 1340,
      "updated": "2022-05-11 04:20:48"
    },
    "Ancash": {
      "lat": "-9.407125",
      "long": "-77.671795",
      "confirmed": 128016,
      "recovered": 0,
      "deaths": 7153,
      "updated": "2022-05-11 04:20:48"
    },
    "Apurimac": {
      "lat": "-14.027713",
      "long": "-72.975378",
      "confirmed": 39083,
      "recovered": 0,
      "deaths": 1634,
      "updated": "2022-05-11 04:20:48"
    },
    "Arequipa": {
      "lat": "-15.843524",
      "long": "-72.475539",
      "confirmed": 215268,
      "recovered": 0,
      "deaths": 10321,
      "updated": "2022-05-11 04:20:48"
    },
    "Ayacucho": {
      "lat": "-14.091648",
      "long": "-74.08344",
      "confirmed": 48227,
      "recovered": 0,
      "deaths": 2329,
      "updated": "2022-05-11 04:20:48"
    },
    "Cajamarca": {
      "lat": "-6.430284",
      "long": "-78.745596",
      "confirmed": 96206,
      "recovered": 0,
      "deaths": 4463,
      "updated": "2022-05-11 04:20:48"
    },
    "Callao": {
      "lat": "-11.954609",
      "long": "-77.136042",
      "confirmed": 146939,
      "recovered": 0,
      "deaths": 10506,
      "updated": "2022-05-11 04:20:48"
    },
    "Cusco": {
      "lat": "-13.191068",
      "long": "-72.153609",
      "confirmed": 117054,
      "recovered": 0,
      "deaths": 5176,
      "updated": "2022-05-11 04:20:48"
    },
    "Huancavelica": {
      "lat": "-13.023888",
      "long": "-75.00277",
      "confirmed": 25861,
      "recovered": 0,
      "deaths": 1273,
      "updated": "2022-05-11 04:20:48"
    },
    "Huanuco": {
      "lat": "-9.421676",
      "long": "-76.040642",
      "confirmed": 52180,
      "recovered": 0,
      "deaths": 2892,
      "updated": "2022-05-11 04:20:48"
    },
    "Ica": {
      "lat": "-14.235097",
      "long": "-75.574821",
      "confirmed": 103838,
      "recovered": 0,
      "deaths": 8935,
      "updated": "2022-05-11 04:20:48"
    },
    "Junin": {
      "lat": "-11.541783",
      "long": "-74.876968",
      "confirmed": 126383,
      "recovered": 0,
      "deaths": 7482,
      "updated": "2022-05-11 04:20:48"
    },
    "La Libertad": {
      "lat": "-7.92139",
      "long": "-78.370238",
      "confirmed": 146874,
      "recovered": 0,
      "deaths": 10956,
      "updated": "2022-05-11 04:20:48"
    },
    "Lambayeque": {
      "lat": "-6.353049",
      "long": "-79.824113",
      "confirmed": 105683,
      "recovered": 0,
      "deaths": 9240,
      "updated": "2022-05-11 04:20:48"
    },
    "Lima": {
      "lat": "-11.766533",
      "long": "-76.604498",
      "confirmed": 1617674,
      "recovered": 0,
      "deaths": 93149,
      "updated": "2022-05-11 04:20:48"
    },
    "Loreto": {
      "lat": "-4.124847",
      "long": "-74.424115",
      "confirmed": 57977,
      "recovered": 0,
      "deaths": 4386,
      "updated": "2022-05-11 04:20:48"
    },
    "Madre de Dios": {
      "lat": "-11.972699",
      "long": "-70.53172",
      "confirmed": 17864,
      "recovered": 0,
      "deaths": 854,
      "updated": "2022-05-11 04:20:48"
    },
    "Moquegua": {
      "lat": "-16.860271",
      "long": "-70.839046",
      "confirmed": 48795,
      "recovered": 0,
      "deaths": 1625,
      "updated": "2022-05-11 04:20:48"
    },
    "Pasco": {
      "lat": "-10.39655",
      "long": "-75.307635",
      "confirmed": 24007,
      "recovered": 0,
      "deaths": 1105,
      "updated": "2022-05-11 04:20:48"
    },
    "Piura": {
      "lat": "-5.133361",
      "long": "-80.335861",
      "confirmed": 158653,
      "recovered": 0,
      "deaths": 13100,
      "updated": "2022-05-11 04:20:48"
    },
    "Puno": {
      "lat": "-14.995827",
      "long": "-69.922726",
      "confirmed": 66161,
      "recovered": 0,
      "deaths": 4787,
      "updated": "2022-05-11 04:20:48"
    },
    "San Martin": {
      "lat": "-7.039531",
      "long": "-76.729127",
      "confirmed": 61864,
      "recovered": 0,
      "deaths": 3163,
      "updated": "2022-05-11 04:20:48"
    },
    "Tacna": {
      "lat": "-17.644161",
      "long": "-70.27756",
      "confirmed": 53785,
      "recovered": 0,
      "deaths": 2137,
      "updated": "2022-05-11 04:20:48"
    },
    "Tumbes": {
      "lat": "-3.857496",
      "long": "-80.545255",
      "confirmed": 27596,
      "recovered": 0,
      "deaths": 1690,
      "updated": "2022-05-11 04:20:48"
    },
    "Ucayali": {
      "lat": "-9.621718",
      "long": "-73.444929",
      "confirmed": 39581,
      "recovered": 0,
      "deaths": 3250,
      "updated": "2022-05-11 04:20:48"
    },
    "Unknown": {
      "lat": "",
      "long": "",
      "confirmed": 557,
      "recovered": 0,
      "deaths": 22,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Philippines": {
    "All": {
      "confirmed": 3687320,
      "recovered": 0,
      "deaths": 60439,
      "country": "Philippines",
      "population": 104918090,
      "sq_km_area": 300000,
      "life_expectancy": "67.5",
      "elevation_in_meters": 442,
      "continent": "Asia",
      "abbreviation": "PH",
      "location": "Southeast Asia",
      "iso": 608,
      "capital_city": "Manila",
      "lat": "12.879721",
      "long": "121.774017",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Poland": {
    "All": {
      "confirmed": 6001327,
      "recovered": 0,
      "deaths": 116150,
      "country": "Poland",
      "population": 38170712,
      "sq_km_area": 323250,
      "life_expectancy": "73.2",
      "elevation_in_meters": 173,
      "continent": "Europe",
      "abbreviation": "PL",
      "location": "Eastern Europe",
      "iso": 616,
      "capital_city": "Warszawa",
      "lat": "51.9194",
      "long": "19.1451",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Portugal": {
    "All": {
      "confirmed": 3970557,
      "recovered": 0,
      "deaths": 22472,
      "country": "Portugal",
      "population": 10329506,
      "sq_km_area": 91982,
      "life_expectancy": "75.8",
      "elevation_in_meters": 372,
      "continent": "Europe",
      "abbreviation": "PT",
      "location": "Southern Europe",
      "iso": 620,
      "capital_city": "Lisboa",
      "lat": "39.3999",
      "long": "-8.2245",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Qatar": {
    "All": {
      "confirmed": 365495,
      "recovered": 0,
      "deaths": 677,
      "country": "Qatar",
      "population": 2639211,
      "sq_km_area": 11000,
      "life_expectancy": "72.4",
      "elevation_in_meters": 28,
      "continent": "Asia",
      "abbreviation": "QA",
      "location": "Middle East",
      "iso": 634,
      "capital_city": "Doha",
      "lat": "25.3548",
      "long": "51.1839",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Romania": {
    "All": {
      "confirmed": 2900375,
      "recovered": 0,
      "deaths": 65581,
      "country": "Romania",
      "population": 19679306,
      "sq_km_area": 238391,
      "life_expectancy": "69.9",
      "elevation_in_meters": 414,
      "continent": "Europe",
      "abbreviation": "RO",
      "location": "Eastern Europe",
      "iso": 642,
      "capital_city": "Bucuresti",
      "lat": "45.9432",
      "long": "24.9668",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Russia": {
    "All": {
      "confirmed": 17971207,
      "recovered": 0,
      "deaths": 369548,
      "country": "Russia",
      "population": 143989754,
      "sq_km_area": 17075400,
      "life_expectancy": "67.2",
      "elevation_in_meters": null,
      "continent": "Europe",
      "abbreviation": "RU",
      "location": "Eastern Europe",
      "iso": null,
      "capital_city": "Moscow"
    },
    "Adygea Republic": {
      "lat": "44.6939006",
      "long": "40.1520421",
      "confirmed": 49283,
      "recovered": 0,
      "deaths": 998,
      "updated": "2022-05-11 04:20:48"
    },
    "Altai Krai": {
      "lat": "52.6932243",
      "long": "82.6931424",
      "confirmed": 267353,
      "recovered": 0,
      "deaths": 8620,
      "updated": "2022-05-11 04:20:48"
    },
    "Altai Republic": {
      "lat": "50.7114101",
      "long": "86.8572186",
      "confirmed": 34223,
      "recovered": 0,
      "deaths": 612,
      "updated": "2022-05-11 04:20:48"
    },
    "Amur Oblast": {
      "lat": "52.8032368",
      "long": "128.437295",
      "confirmed": 107018,
      "recovered": 0,
      "deaths": 764,
      "updated": "2022-05-11 04:20:48"
    },
    "Arkhangelsk Oblast": {
      "lat": "63.5589686",
      "long": "43.1221646",
      "confirmed": 229146,
      "recovered": 0,
      "deaths": 1742,
      "updated": "2022-05-11 04:20:48"
    },
    "Astrakhan Oblast": {
      "lat": "47.1878186",
      "long": "47.608851",
      "confirmed": 116389,
      "recovered": 0,
      "deaths": 2997,
      "updated": "2022-05-11 04:20:48"
    },
    "Bashkortostan Republic": {
      "lat": "54.8573563",
      "long": "57.1439682",
      "confirmed": 286930,
      "recovered": 0,
      "deaths": 5625,
      "updated": "2022-05-11 04:20:48"
    },
    "Belgorod Oblast": {
      "lat": "50.7080119",
      "long": "37.5837615",
      "confirmed": 130256,
      "recovered": 0,
      "deaths": 2242,
      "updated": "2022-05-11 04:20:48"
    },
    "Bryansk Oblast": {
      "lat": "52.8873315",
      "long": "33.415853",
      "confirmed": 161370,
      "recovered": 0,
      "deaths": 3997,
      "updated": "2022-05-11 04:20:48"
    },
    "Buryatia Republic": {
      "lat": "52.7182426",
      "long": "109.492143",
      "confirmed": 136185,
      "recovered": 0,
      "deaths": 3017,
      "updated": "2022-05-11 04:20:48"
    },
    "Chechen Republic": {
      "lat": "43.3976147",
      "long": "45.6985005",
      "confirmed": 43479,
      "recovered": 0,
      "deaths": 1076,
      "updated": "2022-05-11 04:20:48"
    },
    "Chelyabinsk Oblast": {
      "lat": "54.4223954",
      "long": "61.1865846",
      "confirmed": 327970,
      "recovered": 0,
      "deaths": 7617,
      "updated": "2022-05-11 04:20:48"
    },
    "Chukotka Autonomous Okrug": {
      "lat": "66.0006475",
      "long": "169.4900869",
      "confirmed": 5653,
      "recovered": 0,
      "deaths": 42,
      "updated": "2022-05-11 04:20:48"
    },
    "Chuvashia Republic": {
      "lat": "55.4259922",
      "long": "47.0849429",
      "confirmed": 79034,
      "recovered": 0,
      "deaths": 4623,
      "updated": "2022-05-11 04:20:48"
    },
    "Dagestan Republic": {
      "lat": "43.0574916",
      "long": "47.1332224",
      "confirmed": 93039,
      "recovered": 0,
      "deaths": 3592,
      "updated": "2022-05-11 04:20:48"
    },
    "Ingushetia Republic": {
      "lat": "43.11542075",
      "long": "45.01713552",
      "confirmed": 40791,
      "recovered": 0,
      "deaths": 549,
      "updated": "2022-05-11 04:20:48"
    },
    "Irkutsk Oblast": {
      "lat": "56.6370122",
      "long": "104.719221",
      "confirmed": 292503,
      "recovered": 0,
      "deaths": 8440,
      "updated": "2022-05-11 04:20:48"
    },
    "Ivanovo Oblast": {
      "lat": "56.9167446",
      "long": "41.4352137",
      "confirmed": 110851,
      "recovered": 0,
      "deaths": 3098,
      "updated": "2022-05-11 04:20:48"
    },
    "Jewish Autonomous Okrug": {
      "lat": "48.57527615",
      "long": "132.6630746",
      "confirmed": 18656,
      "recovered": 0,
      "deaths": 543,
      "updated": "2022-05-11 04:20:48"
    },
    "Kabardino-Balkarian Republic": {
      "lat": "43.4806048",
      "long": "43.5978976",
      "confirmed": 61718,
      "recovered": 0,
      "deaths": 1868,
      "updated": "2022-05-11 04:20:48"
    },
    "Kaliningrad Oblast": {
      "lat": "54.7293041",
      "long": "21.1489473",
      "confirmed": 168302,
      "recovered": 0,
      "deaths": 1902,
      "updated": "2022-05-11 04:20:48"
    },
    "Kalmykia Republic": {
      "lat": "46.2313018",
      "long": "45.3275745",
      "confirmed": 51304,
      "recovered": 0,
      "deaths": 842,
      "updated": "2022-05-11 04:20:48"
    },
    "Kaluga Oblast": {
      "lat": "54.4382773",
      "long": "35.5272854",
      "confirmed": 103442,
      "recovered": 0,
      "deaths": 1453,
      "updated": "2022-05-11 04:20:48"
    },
    "Kamchatka Krai": {
      "lat": "57.1914882",
      "long": "160.0383819",
      "confirmed": 39701,
      "recovered": 0,
      "deaths": 613,
      "updated": "2022-05-11 04:20:48"
    },
    "Karachay-Cherkess Republic": {
      "lat": "43.7368326",
      "long": "41.7267991",
      "confirmed": 45904,
      "recovered": 0,
      "deaths": 984,
      "updated": "2022-05-11 04:20:48"
    },
    "Karelia Republic": {
      "lat": "62.6194031",
      "long": "33.4920267",
      "confirmed": 134550,
      "recovered": 0,
      "deaths": 1502,
      "updated": "2022-05-11 04:20:48"
    },
    "Kemerovo Oblast": {
      "lat": "54.5335781",
      "long": "87.342861",
      "confirmed": 162567,
      "recovered": 0,
      "deaths": 2331,
      "updated": "2022-05-11 04:20:48"
    },
    "Khabarovsk Krai": {
      "lat": "51.6312684",
      "long": "136.121524",
      "confirmed": 201124,
      "recovered": 0,
      "deaths": 1541,
      "updated": "2022-05-11 04:20:48"
    },
    "Khakassia Republic": {
      "lat": "53.72258845",
      "long": "91.44293627",
      "confirmed": 87587,
      "recovered": 0,
      "deaths": 2409,
      "updated": "2022-05-11 04:20:48"
    },
    "Khanty-Mansi Autonomous Okrug": {
      "lat": "61.0259025",
      "long": "69.0982628",
      "confirmed": 209985,
      "recovered": 0,
      "deaths": 2540,
      "updated": "2022-05-11 04:20:48"
    },
    "Kirov Oblast": {
      "lat": "57.9665589",
      "long": "49.4074599",
      "confirmed": 151274,
      "recovered": 0,
      "deaths": 1036,
      "updated": "2022-05-11 04:20:48"
    },
    "Komi Republic": {
      "lat": "63.9881421",
      "long": "54.3326073",
      "confirmed": 171133,
      "recovered": 0,
      "deaths": 3160,
      "updated": "2022-05-11 04:20:48"
    },
    "Kostroma Oblast": {
      "lat": "58.424756",
      "long": "44.2533273",
      "confirmed": 88685,
      "recovered": 0,
      "deaths": 1374,
      "updated": "2022-05-11 04:20:48"
    },
    "Krasnodar Krai": {
      "lat": "45.7684014",
      "long": "39.0261044",
      "confirmed": 259203,
      "recovered": 0,
      "deaths": 10882,
      "updated": "2022-05-11 04:20:48"
    },
    "Krasnoyarsk Krai": {
      "lat": "63.3233807",
      "long": "97.0979974",
      "confirmed": 364743,
      "recovered": 0,
      "deaths": 10799,
      "updated": "2022-05-11 04:20:48"
    },
    "Kurgan Oblast": {
      "lat": "55.7655302",
      "long": "64.5632681",
      "confirmed": 104092,
      "recovered": 0,
      "deaths": 1426,
      "updated": "2022-05-11 04:20:48"
    },
    "Kursk Oblast": {
      "lat": "51.6568453",
      "long": "36.4852695",
      "confirmed": 117556,
      "recovered": 0,
      "deaths": 2470,
      "updated": "2022-05-11 04:20:48"
    },
    "Leningrad Oblast": {
      "lat": "60.1853296",
      "long": "32.3925325",
      "confirmed": 186461,
      "recovered": 0,
      "deaths": 3478,
      "updated": "2022-05-11 04:20:48"
    },
    "Lipetsk Oblast": {
      "lat": "52.6935178",
      "long": "39.1122664",
      "confirmed": 150190,
      "recovered": 0,
      "deaths": 3732,
      "updated": "2022-05-11 04:20:48"
    },
    "Magadan Oblast": {
      "lat": "62.48858785",
      "long": "153.9903764",
      "confirmed": 19775,
      "recovered": 0,
      "deaths": 390,
      "updated": "2022-05-11 04:20:48"
    },
    "Mari El Republic": {
      "lat": "56.5767504",
      "long": "47.8817512",
      "confirmed": 44536,
      "recovered": 0,
      "deaths": 1086,
      "updated": "2022-05-11 04:20:48"
    },
    "Mordovia Republic": {
      "lat": "54.4419829",
      "long": "44.4661144",
      "confirmed": 67496,
      "recovered": 0,
      "deaths": 1382,
      "updated": "2022-05-11 04:20:48"
    },
    "Moscow": {
      "lat": "55.7504461",
      "long": "37.6174943",
      "confirmed": 2764226,
      "recovered": 0,
      "deaths": 43421,
      "updated": "2022-05-11 04:20:48"
    },
    "Moscow Oblast": {
      "lat": "55.5043158",
      "long": "38.0353929",
      "confirmed": 972153,
      "recovered": 0,
      "deaths": 15054,
      "updated": "2022-05-11 04:20:48"
    },
    "Murmansk Oblast": {
      "lat": "68.0000418",
      "long": "33.9999151",
      "confirmed": 134371,
      "recovered": 0,
      "deaths": 3317,
      "updated": "2022-05-11 04:20:48"
    },
    "Nenets Autonomous Okrug": {
      "lat": "68.27557185",
      "long": "57.1686375",
      "confirmed": 7342,
      "recovered": 0,
      "deaths": 100,
      "updated": "2022-05-11 04:20:48"
    },
    "Nizhny Novgorod Oblast": {
      "lat": "55.4718033",
      "long": "44.0911594",
      "confirmed": 418514,
      "recovered": 0,
      "deaths": 11479,
      "updated": "2022-05-11 04:20:48"
    },
    "North Ossetia - Alania Republic": {
      "lat": "42.7933611",
      "long": "44.6324493",
      "confirmed": 40751,
      "recovered": 0,
      "deaths": 1252,
      "updated": "2022-05-11 04:20:48"
    },
    "Novgorod Oblast": {
      "lat": "58.2843833",
      "long": "32.5169757",
      "confirmed": 99358,
      "recovered": 0,
      "deaths": 1024,
      "updated": "2022-05-11 04:20:48"
    },
    "Novosibirsk Oblast": {
      "lat": "54.9720169",
      "long": "79.4813924",
      "confirmed": 257122,
      "recovered": 0,
      "deaths": 5641,
      "updated": "2022-05-11 04:20:48"
    },
    "Omsk Oblast": {
      "lat": "56.0935263",
      "long": "73.5099936",
      "confirmed": 206712,
      "recovered": 0,
      "deaths": 4359,
      "updated": "2022-05-11 04:20:48"
    },
    "Orel Oblast": {
      "lat": "52.9685433",
      "long": "36.0692477",
      "confirmed": 112103,
      "recovered": 0,
      "deaths": 1912,
      "updated": "2022-05-11 04:20:48"
    },
    "Orenburg Oblast": {
      "lat": "52.0269262",
      "long": "54.7276647",
      "confirmed": 215669,
      "recovered": 0,
      "deaths": 3983,
      "updated": "2022-05-11 04:20:48"
    },
    "Penza Oblast": {
      "lat": "53.1655415",
      "long": "44.7879181",
      "confirmed": 185607,
      "recovered": 0,
      "deaths": 5842,
      "updated": "2022-05-11 04:20:48"
    },
    "Perm Krai": {
      "lat": "58.5951603",
      "long": "56.3159546",
      "confirmed": 368127,
      "recovered": 0,
      "deaths": 8777,
      "updated": "2022-05-11 04:20:48"
    },
    "Primorsky Krai": {
      "lat": "45.0819456",
      "long": "134.726645",
      "confirmed": 174506,
      "recovered": 0,
      "deaths": 1955,
      "updated": "2022-05-11 04:20:48"
    },
    "Pskov Oblast": {
      "lat": "57.5358729",
      "long": "28.8586826",
      "confirmed": 109890,
      "recovered": 0,
      "deaths": 1832,
      "updated": "2022-05-11 04:20:48"
    },
    "Rostov Oblast": {
      "lat": "47.6222451",
      "long": "40.7957942",
      "confirmed": 373977,
      "recovered": 0,
      "deaths": 10897,
      "updated": "2022-05-11 04:20:48"
    },
    "Ryazan Oblast": {
      "lat": "54.4226732",
      "long": "40.5705246",
      "confirmed": 120119,
      "recovered": 0,
      "deaths": 3365,
      "updated": "2022-05-11 04:20:48"
    },
    "Saint Petersburg": {
      "lat": "59.9606739",
      "long": "30.1586551",
      "confirmed": 1522900,
      "recovered": 0,
      "deaths": 33614,
      "updated": "2022-05-11 04:20:48"
    },
    "Sakha (Yakutiya) Republic": {
      "lat": "66.941626",
      "long": "129.642371",
      "confirmed": 179114,
      "recovered": 0,
      "deaths": 2112,
      "updated": "2022-05-11 04:20:48"
    },
    "Sakhalin Oblast": {
      "lat": "49.7219665",
      "long": "143.448533",
      "confirmed": 64685,
      "recovered": 0,
      "deaths": 826,
      "updated": "2022-05-11 04:20:48"
    },
    "Samara Oblast": {
      "lat": "53.2128813",
      "long": "50.8914633",
      "confirmed": 382632,
      "recovered": 0,
      "deaths": 7825,
      "updated": "2022-05-11 04:20:48"
    },
    "Saratov Oblast": {
      "lat": "51.6520555",
      "long": "46.8631952",
      "confirmed": 250042,
      "recovered": 0,
      "deaths": 5948,
      "updated": "2022-05-11 04:20:48"
    },
    "Smolensk Oblast": {
      "lat": "55.0343496",
      "long": "33.0192065",
      "confirmed": 130462,
      "recovered": 0,
      "deaths": 3042,
      "updated": "2022-05-11 04:20:48"
    },
    "Stavropol Krai": {
      "lat": "44.8632577",
      "long": "43.4406913",
      "confirmed": 196704,
      "recovered": 0,
      "deaths": 7038,
      "updated": "2022-05-11 04:20:48"
    },
    "Sverdlovsk Oblast": {
      "lat": "58.6414755",
      "long": "61.8021546",
      "confirmed": 441464,
      "recovered": 0,
      "deaths": 10731,
      "updated": "2022-05-11 04:20:48"
    },
    "Tambov Oblast": {
      "lat": "52.9019574",
      "long": "41.3578918",
      "confirmed": 116177,
      "recovered": 0,
      "deaths": 2400,
      "updated": "2022-05-11 04:20:48"
    },
    "Tatarstan Republic": {
      "lat": "55.7648572",
      "long": "52.43104273",
      "confirmed": 146643,
      "recovered": 0,
      "deaths": 1989,
      "updated": "2022-05-11 04:20:48"
    },
    "Tomsk Oblast": {
      "lat": "58.6124279",
      "long": "82.0475315",
      "confirmed": 130538,
      "recovered": 0,
      "deaths": 834,
      "updated": "2022-05-11 04:20:48"
    },
    "Tula Oblast": {
      "lat": "53.9570701",
      "long": "37.3690909",
      "confirmed": 155533,
      "recovered": 0,
      "deaths": 5176,
      "updated": "2022-05-11 04:20:48"
    },
    "Tver Oblast": {
      "lat": "57.1134475",
      "long": "35.1744428",
      "confirmed": 161701,
      "recovered": 0,
      "deaths": 2731,
      "updated": "2022-05-11 04:20:48"
    },
    "Tyumen Oblast": {
      "lat": "58.8206488",
      "long": "70.3658837",
      "confirmed": 191140,
      "recovered": 0,
      "deaths": 4307,
      "updated": "2022-05-11 04:20:48"
    },
    "Tyva Republic": {
      "lat": "51.4017149",
      "long": "93.8582593",
      "confirmed": 44430,
      "recovered": 0,
      "deaths": 351,
      "updated": "2022-05-11 04:20:48"
    },
    "Udmurt Republic": {
      "lat": "57.1961165",
      "long": "52.6959832",
      "confirmed": 166220,
      "recovered": 0,
      "deaths": 3823,
      "updated": "2022-05-11 04:20:48"
    },
    "Ulyanovsk Oblast": {
      "lat": "54.1463177",
      "long": "47.2324921",
      "confirmed": 202155,
      "recovered": 0,
      "deaths": 4657,
      "updated": "2022-05-11 04:20:48"
    },
    "Vladimir Oblast": {
      "lat": "56.0503336",
      "long": "40.6561633",
      "confirmed": 150918,
      "recovered": 0,
      "deaths": 3447,
      "updated": "2022-05-11 04:20:48"
    },
    "Volgograd Oblast": {
      "lat": "49.6048339",
      "long": "44.2903582",
      "confirmed": 218441,
      "recovered": 0,
      "deaths": 6866,
      "updated": "2022-05-11 04:20:48"
    },
    "Vologda Oblast": {
      "lat": "60.0391461",
      "long": "43.1215213",
      "confirmed": 190032,
      "recovered": 0,
      "deaths": 3813,
      "updated": "2022-05-11 04:20:48"
    },
    "Voronezh Oblast": {
      "lat": "50.9800393",
      "long": "40.1506507",
      "confirmed": 381909,
      "recovered": 0,
      "deaths": 8257,
      "updated": "2022-05-11 04:20:48"
    },
    "Yamalo-Nenets Autonomous Okrug": {
      "lat": "67.1471631",
      "long": "74.3415488",
      "confirmed": 136780,
      "recovered": 0,
      "deaths": 1040,
      "updated": "2022-05-11 04:20:48"
    },
    "Yaroslavl Oblast": {
      "lat": "57.7781976",
      "long": "39.0021095",
      "confirmed": 160211,
      "recovered": 0,
      "deaths": 2778,
      "updated": "2022-05-11 04:20:48"
    },
    "Zabaykalsky Krai": {
      "lat": "52.248521",
      "long": "115.956325",
      "confirmed": 168372,
      "recovered": 0,
      "deaths": 2339,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Rwanda": {
    "All": {
      "confirmed": 129875,
      "recovered": 0,
      "deaths": 1459,
      "country": "Rwanda",
      "population": 12208407,
      "sq_km_area": 26338,
      "life_expectancy": "39.3",
      "elevation_in_meters": "1,598",
      "continent": "Africa",
      "abbreviation": "RW",
      "location": "Eastern Africa",
      "iso": 646,
      "capital_city": "Kigali",
      "lat": "-1.9403",
      "long": "29.8739",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Saint Kitts and Nevis": {
    "All": {
      "confirmed": 5595,
      "recovered": 0,
      "deaths": 43,
      "country": "Saint Kitts and Nevis",
      "population": 55345,
      "sq_km_area": 261,
      "life_expectancy": "70.7",
      "elevation_in_meters": null,
      "continent": "North America",
      "abbreviation": "KN",
      "location": "Caribbean",
      "iso": 659,
      "capital_city": "Basseterre",
      "lat": "17.357822",
      "long": "-62.782998",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Saint Lucia": {
    "All": {
      "confirmed": 23798,
      "recovered": 0,
      "deaths": 368,
      "country": "Saint Lucia",
      "population": 178844,
      "sq_km_area": 622,
      "life_expectancy": "72.3",
      "elevation_in_meters": null,
      "continent": "North America",
      "abbreviation": "LC",
      "location": "Caribbean",
      "iso": 662,
      "capital_city": "Castries",
      "lat": "13.9094",
      "long": "-60.9789",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Saint Vincent and the Grenadines": {
    "All": {
      "confirmed": 8472,
      "recovered": 0,
      "deaths": 106,
      "country": "Saint Vincent and the Grenadines",
      "population": 109897,
      "sq_km_area": 388,
      "life_expectancy": "72.3",
      "elevation_in_meters": null,
      "continent": "North America",
      "abbreviation": "VC",
      "location": "Caribbean",
      "iso": 670,
      "capital_city": "Kingstown",
      "lat": "12.9843",
      "long": "-61.2872",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Samoa": {
    "All": {
      "confirmed": 10926,
      "recovered": 0,
      "deaths": 22,
      "country": "Samoa",
      "population": 196440,
      "sq_km_area": 2831,
      "life_expectancy": "69.2",
      "elevation_in_meters": null,
      "continent": "Oceania",
      "abbreviation": "WS",
      "location": "Polynesia",
      "iso": 882,
      "capital_city": "Apia",
      "lat": "-13.759",
      "long": "-172.1046",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "San Marino": {
    "All": {
      "confirmed": 16743,
      "recovered": 0,
      "deaths": 115,
      "country": "San Marino",
      "population": 33400,
      "sq_km_area": 61,
      "life_expectancy": "81.1",
      "elevation_in_meters": null,
      "continent": "Europe",
      "abbreviation": "SM",
      "location": "Southern Europe",
      "iso": 674,
      "capital_city": "San Marino",
      "lat": "43.9424",
      "long": "12.4578",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Sao Tome and Principe": {
    "All": {
      "confirmed": 5970,
      "recovered": 0,
      "deaths": 73,
      "country": "Sao Tome and Principe",
      "population": 204327,
      "sq_km_area": 964,
      "life_expectancy": "65.3",
      "elevation_in_meters": null,
      "continent": "Africa",
      "abbreviation": "ST",
      "location": "Central Africa",
      "iso": 678,
      "capital_city": "S",
      "lat": "0.1864",
      "long": "6.6131",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Saudi Arabia": {
    "All": {
      "confirmed": 756549,
      "recovered": 0,
      "deaths": 9104,
      "country": "Saudi Arabia",
      "population": 32938213,
      "sq_km_area": 2149690,
      "life_expectancy": "67.8",
      "elevation_in_meters": 665,
      "continent": "Asia",
      "abbreviation": "SA",
      "location": "Middle East",
      "iso": 682,
      "capital_city": "Riyadh",
      "lat": "23.885942",
      "long": "45.079162",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Senegal": {
    "All": {
      "confirmed": 86019,
      "recovered": 0,
      "deaths": 1966,
      "country": "Senegal",
      "population": 15850567,
      "sq_km_area": 196722,
      "life_expectancy": "62.2",
      "elevation_in_meters": 69,
      "continent": "Africa",
      "abbreviation": "SN",
      "location": "Western Africa",
      "iso": 686,
      "capital_city": "Dakar",
      "lat": "14.4974",
      "long": "-14.4524",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Serbia": {
    "All": {
      "confirmed": 2010495,
      "recovered": 0,
      "deaths": 16037,
      "lat": "44.0165",
      "long": "21.0059",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Seychelles": {
    "All": {
      "confirmed": 42841,
      "recovered": 0,
      "deaths": 166,
      "country": "Seychelles",
      "population": 94737,
      "sq_km_area": 455,
      "life_expectancy": "70.4",
      "elevation_in_meters": null,
      "continent": "Africa",
      "abbreviation": "SC",
      "location": "Eastern Africa",
      "iso": 690,
      "capital_city": "Victoria",
      "lat": "-4.6796",
      "long": "55.492",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Sierra Leone": {
    "All": {
      "confirmed": 7682,
      "recovered": 0,
      "deaths": 125,
      "country": "Sierra Leone",
      "population": 7557212,
      "sq_km_area": 71740,
      "life_expectancy": "45.3",
      "elevation_in_meters": 279,
      "continent": "Africa",
      "abbreviation": "SL",
      "location": "Western Africa",
      "iso": 694,
      "capital_city": "Freetown",
      "lat": "8.460555",
      "long": "-11.779889",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Singapore": {
    "All": {
      "confirmed": 1225024,
      "recovered": 0,
      "deaths": 1356,
      "country": "Singapore",
      "population": 5708844,
      "sq_km_area": 618,
      "life_expectancy": "80.1",
      "elevation_in_meters": null,
      "continent": "Asia",
      "abbreviation": "SG",
      "location": "Southeast Asia",
      "iso": 702,
      "capital_city": "Singapore",
      "lat": "1.2833",
      "long": "103.8333",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Slovakia": {
    "All": {
      "confirmed": 2536743,
      "recovered": 0,
      "deaths": 19994,
      "country": "Slovakia",
      "population": 5447662,
      "sq_km_area": 49012,
      "life_expectancy": "73.7",
      "elevation_in_meters": 458,
      "continent": "Europe",
      "abbreviation": "SK",
      "location": "Eastern Europe",
      "iso": 703,
      "capital_city": "Bratislava",
      "lat": "48.669",
      "long": "19.699",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Slovenia": {
    "All": {
      "confirmed": 1016993,
      "recovered": 0,
      "deaths": 6613,
      "country": "Slovenia",
      "population": 2079976,
      "sq_km_area": 20256,
      "life_expectancy": "74.9",
      "elevation_in_meters": 492,
      "continent": "Europe",
      "abbreviation": "SI",
      "location": "Southern Europe",
      "iso": 705,
      "capital_city": "Ljubljana",
      "lat": "46.1512",
      "long": "14.9955",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Solomon Islands": {
    "All": {
      "confirmed": 18174,
      "recovered": 0,
      "deaths": 146,
      "country": "Solomon Islands",
      "population": 611343,
      "sq_km_area": 28896,
      "life_expectancy": "71.3",
      "elevation_in_meters": null,
      "continent": "Oceania",
      "abbreviation": "SB",
      "location": "Melanesia",
      "iso": 90,
      "capital_city": "Honiara",
      "lat": "-9.6457",
      "long": "160.1562",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Somalia": {
    "All": {
      "confirmed": 26499,
      "recovered": 0,
      "deaths": 1361,
      "country": "Somalia",
      "population": 14742523,
      "sq_km_area": 637657,
      "life_expectancy": "46.2",
      "elevation_in_meters": 410,
      "continent": "Africa",
      "abbreviation": "SO",
      "location": "Eastern Africa",
      "iso": 706,
      "capital_city": "Mogadishu",
      "lat": "5.152149",
      "long": "46.199616",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "South Africa": {
    "All": {
      "confirmed": 3852148,
      "recovered": 0,
      "deaths": 100559,
      "country": "South Africa",
      "population": 56717156,
      "sq_km_area": 1221037,
      "life_expectancy": "51.1",
      "elevation_in_meters": "1,034",
      "continent": "Africa",
      "abbreviation": "ZA",
      "location": "Southern Africa",
      "iso": 710,
      "capital_city": "Pretoria",
      "lat": "-30.5595",
      "long": "22.9375",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "South Sudan": {
    "All": {
      "confirmed": 17513,
      "recovered": 0,
      "deaths": 138,
      "country": "South Sudan",
      "population": 12575714,
      "sq_km_area": 619745,
      "life_expectancy": null,
      "elevation_in_meters": null,
      "continent": "Africa",
      "abbreviation": "SS",
      "location": "Eastern Africa",
      "iso": 728,
      "capital_city": "Juba",
      "lat": "6.877",
      "long": "31.307",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Spain": {
    "All": {
      "confirmed": 12009059,
      "recovered": 0,
      "deaths": 104869,
      "country": "Spain",
      "population": 46354321,
      "sq_km_area": 505992,
      "life_expectancy": "78.8",
      "elevation_in_meters": 660,
      "continent": "Europe",
      "abbreviation": "ES",
      "location": "Southern Europe",
      "iso": 724,
      "capital_city": "Madrid"
    },
    "Andalusia": {
      "lat": "37.5443",
      "long": "-4.7278",
      "confirmed": 1454824,
      "recovered": 0,
      "deaths": 13488,
      "updated": "2022-05-11 04:20:48"
    },
    "Aragon": {
      "lat": "41.5976",
      "long": "-0.9057",
      "confirmed": 419737,
      "recovered": 0,
      "deaths": 4720,
      "updated": "2022-05-11 04:20:48"
    },
    "Asturias": {
      "lat": "43.3614",
      "long": "-5.8593",
      "confirmed": 224409,
      "recovered": 0,
      "deaths": 2738,
      "updated": "2022-05-11 04:20:48"
    },
    "Baleares": {
      "lat": "39.710358",
      "long": "2.995148",
      "confirmed": 283679,
      "recovered": 0,
      "deaths": 1352,
      "updated": "2022-05-11 04:20:48"
    },
    "C. Valenciana": {
      "lat": "39.484",
      "long": "-0.7533",
      "confirmed": 1402710,
      "recovered": 0,
      "deaths": 9276,
      "updated": "2022-05-11 04:20:48"
    },
    "Canarias": {
      "lat": "28.2916",
      "long": "-16.6291",
      "confirmed": 357681,
      "recovered": 0,
      "deaths": 1726,
      "updated": "2022-05-11 04:20:48"
    },
    "Cantabria": {
      "lat": "43.1828",
      "long": "-3.9878",
      "confirmed": 137896,
      "recovered": 0,
      "deaths": 828,
      "updated": "2022-05-11 04:20:48"
    },
    "Castilla - La Mancha": {
      "lat": "39.2796",
      "long": "-3.0977",
      "confirmed": 509738,
      "recovered": 0,
      "deaths": 7231,
      "updated": "2022-05-11 04:20:48"
    },
    "Castilla y Leon": {
      "lat": "41.8357",
      "long": "-4.3976",
      "confirmed": 726819,
      "recovered": 0,
      "deaths": 8518,
      "updated": "2022-05-11 04:20:48"
    },
    "Catalonia": {
      "lat": "41.5912",
      "long": "1.5209",
      "confirmed": 2418345,
      "recovered": 0,
      "deaths": 19014,
      "updated": "2022-05-11 04:20:48"
    },
    "Ceuta": {
      "lat": "35.8894",
      "long": "-5.3213",
      "confirmed": 21001,
      "recovered": 0,
      "deaths": 148,
      "updated": "2022-05-11 04:20:48"
    },
    "Extremadura": {
      "lat": "39.4937",
      "long": "-6.0679",
      "confirmed": 265557,
      "recovered": 0,
      "deaths": 2333,
      "updated": "2022-05-11 04:20:48"
    },
    "Galicia": {
      "lat": "42.5751",
      "long": "-8.1339",
      "confirmed": 631196,
      "recovered": 0,
      "deaths": 3355,
      "updated": "2022-05-11 04:20:48"
    },
    "La Rioja": {
      "lat": "42.2871",
      "long": "-2.5396",
      "confirmed": 97089,
      "recovered": 0,
      "deaths": 920,
      "updated": "2022-05-11 04:20:48"
    },
    "Madrid": {
      "lat": "40.4168",
      "long": "-3.7038",
      "confirmed": 1680686,
      "recovered": 0,
      "deaths": 18627,
      "updated": "2022-05-11 04:20:48"
    },
    "Melilla": {
      "lat": "35.2923",
      "long": "-2.9381",
      "confirmed": 21229,
      "recovered": 0,
      "deaths": 154,
      "updated": "2022-05-11 04:20:48"
    },
    "Murcia": {
      "lat": "37.9922",
      "long": "-1.1307",
      "confirmed": 416799,
      "recovered": 0,
      "deaths": 2255,
      "updated": "2022-05-11 04:20:48"
    },
    "Navarra": {
      "lat": "42.6954",
      "long": "-1.6761",
      "confirmed": 244882,
      "recovered": 0,
      "deaths": 1547,
      "updated": "2022-05-11 04:20:48"
    },
    "Pais Vasco": {
      "lat": "42.9896",
      "long": "-2.6189",
      "confirmed": 694782,
      "recovered": 0,
      "deaths": 6639,
      "updated": "2022-05-11 04:20:48"
    },
    "Unknown": {
      "lat": "",
      "long": "",
      "confirmed": 0,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Sri Lanka": {
    "All": {
      "confirmed": 663597,
      "recovered": 0,
      "deaths": 16509,
      "country": "Sri Lanka",
      "population": 20876917,
      "life_expectancy": null,
      "elevation_in_meters": null,
      "location": null,
      "iso": null,
      "capital_city": null,
      "lat": "7.873054",
      "long": "80.771797",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Sudan": {
    "All": {
      "confirmed": 62161,
      "recovered": 0,
      "deaths": 4936,
      "country": "Sudan",
      "population": 40533330,
      "sq_km_area": 1886068,
      "life_expectancy": "56.6",
      "elevation_in_meters": 568,
      "continent": "Africa",
      "abbreviation": "SD",
      "location": "Northern Africa",
      "iso": 729,
      "capital_city": "Khartum",
      "lat": "12.8628",
      "long": "30.2176",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Summer Olympics 2020": {
    "All": {
      "confirmed": 865,
      "recovered": 0,
      "deaths": 0,
      "lat": "35.6491",
      "long": "139.7737",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Suriname": {
    "All": {
      "confirmed": 80008,
      "recovered": 0,
      "deaths": 1337,
      "country": "Suriname",
      "population": 563402,
      "sq_km_area": 163265,
      "life_expectancy": "71.4",
      "elevation_in_meters": 246,
      "continent": "South America",
      "abbreviation": "SR",
      "location": "South America",
      "iso": 740,
      "capital_city": "Paramaribo",
      "lat": "3.9193",
      "long": "-56.0278",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Sweden": {
    "All": {
      "confirmed": 2503090,
      "recovered": 0,
      "deaths": 18824,
      "country": "Sweden",
      "population": 9910701,
      "sq_km_area": 449964,
      "life_expectancy": "79.6",
      "elevation_in_meters": 320,
      "continent": "Europe",
      "abbreviation": "SE",
      "location": "Nordic Countries",
      "iso": 752,
      "capital_city": "Stockholm"
    },
    "Blekinge": {
      "lat": "56.2784",
      "long": "15.018",
      "confirmed": 29624,
      "recovered": 0,
      "deaths": 164,
      "updated": "2022-05-11 04:20:48"
    },
    "Dalarna": {
      "lat": "61.0917",
      "long": "14.6664",
      "confirmed": 69712,
      "recovered": 0,
      "deaths": 475,
      "updated": "2022-05-11 04:20:48"
    },
    "Gavleborg": {
      "lat": "61.3012",
      "long": "16.1534",
      "confirmed": 73735,
      "recovered": 0,
      "deaths": 696,
      "updated": "2022-05-11 04:20:48"
    },
    "Gotland": {
      "lat": "57.4684",
      "long": "18.4867",
      "confirmed": 11429,
      "recovered": 0,
      "deaths": 71,
      "updated": "2022-05-11 04:20:48"
    },
    "Halland": {
      "lat": "56.8967",
      "long": "12.8034",
      "confirmed": 104713,
      "recovered": 0,
      "deaths": 447,
      "updated": "2022-05-11 04:20:48"
    },
    "Jamtland Harjedalen": {
      "lat": "63.1712",
      "long": "14.9592",
      "confirmed": 32769,
      "recovered": 0,
      "deaths": 174,
      "updated": "2022-05-11 04:20:48"
    },
    "Jonkoping": {
      "lat": "57.3708",
      "long": "14.3439",
      "confirmed": 86347,
      "recovered": 0,
      "deaths": 683,
      "updated": "2022-05-11 04:20:48"
    },
    "Kalmar": {
      "lat": "57.235",
      "long": "16.1849",
      "confirmed": 60117,
      "recovered": 0,
      "deaths": 353,
      "updated": "2022-05-11 04:20:48"
    },
    "Kronoberg": {
      "lat": "56.7183",
      "long": "14.4115",
      "confirmed": 49440,
      "recovered": 0,
      "deaths": 383,
      "updated": "2022-05-11 04:20:48"
    },
    "Norrbotten": {
      "lat": "66.8309",
      "long": "20.3992",
      "confirmed": 48807,
      "recovered": 0,
      "deaths": 404,
      "updated": "2022-05-11 04:20:48"
    },
    "Orebro": {
      "lat": "59.535",
      "long": "15.0066",
      "confirmed": 92737,
      "recovered": 0,
      "deaths": 463,
      "updated": "2022-05-11 04:20:48"
    },
    "Ostergotland": {
      "lat": "58.3454",
      "long": "15.5198",
      "confirmed": 94949,
      "recovered": 0,
      "deaths": 813,
      "updated": "2022-05-11 04:20:48"
    },
    "Skane": {
      "lat": "55.9903",
      "long": "13.5958",
      "confirmed": 337831,
      "recovered": 0,
      "deaths": 2375,
      "updated": "2022-05-11 04:20:48"
    },
    "Sormland": {
      "lat": "59.0336",
      "long": "16.7519",
      "confirmed": 63735,
      "recovered": 0,
      "deaths": 586,
      "updated": "2022-05-11 04:20:48"
    },
    "Stockholm": {
      "lat": "59.6025",
      "long": "18.1384",
      "confirmed": 572466,
      "recovered": 0,
      "deaths": 5238,
      "updated": "2022-05-11 04:20:48"
    },
    "Uppsala": {
      "lat": "60.0092",
      "long": "17.2715",
      "confirmed": 89521,
      "recovered": 0,
      "deaths": 680,
      "updated": "2022-05-11 04:20:48"
    },
    "Varmland": {
      "lat": "59.7294",
      "long": "13.2354",
      "confirmed": 65365,
      "recovered": 0,
      "deaths": 346,
      "updated": "2022-05-11 04:20:48"
    },
    "Vasterbotten": {
      "lat": "65.3337",
      "long": "16.5162",
      "confirmed": 56537,
      "recovered": 0,
      "deaths": 322,
      "updated": "2022-05-11 04:20:48"
    },
    "Vasternorrland": {
      "lat": "63.4276",
      "long": "17.7292",
      "confirmed": 53515,
      "recovered": 0,
      "deaths": 599,
      "updated": "2022-05-11 04:20:48"
    },
    "Vastmanland": {
      "lat": "59.6714",
      "long": "16.2159",
      "confirmed": 75757,
      "recovered": 0,
      "deaths": 483,
      "updated": "2022-05-11 04:20:48"
    },
    "Vastra Gotaland": {
      "lat": "58.2528",
      "long": "13.0596",
      "confirmed": 433984,
      "recovered": 0,
      "deaths": 3069,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Switzerland": {
    "All": {
      "confirmed": 3649155,
      "recovered": 0,
      "deaths": 13773,
      "country": "Switzerland",
      "population": 8476005,
      "sq_km_area": 41284,
      "life_expectancy": "79.6",
      "elevation_in_meters": "1,350",
      "continent": "Europe",
      "abbreviation": "CH",
      "location": "Western Europe",
      "iso": 756,
      "capital_city": "Bern",
      "lat": "46.8182",
      "long": "8.2275",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Syria": {
    "All": {
      "confirmed": 55863,
      "recovered": 0,
      "deaths": 3150,
      "country": "Syria",
      "population": 18269868,
      "sq_km_area": 185180,
      "life_expectancy": "68.5",
      "elevation_in_meters": 514,
      "continent": "Asia",
      "abbreviation": "SY",
      "location": "Middle East",
      "iso": 760,
      "capital_city": "Damascus",
      "lat": "34.802075",
      "long": "38.996815",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Taiwan*": {
    "All": {
      "confirmed": 448323,
      "recovered": 0,
      "deaths": 943,
      "lat": "23.7",
      "long": "121.0",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Tajikistan": {
    "All": {
      "confirmed": 17786,
      "recovered": 0,
      "deaths": 125,
      "country": "Tajikistan",
      "population": 8921343,
      "sq_km_area": 143100,
      "life_expectancy": "64.1",
      "elevation_in_meters": "3,186",
      "continent": "Asia",
      "abbreviation": "TJ",
      "location": "Southern and Central Asia",
      "iso": 762,
      "capital_city": "Dushanbe",
      "lat": "38.861",
      "long": "71.2761",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Tanzania": {
    "All": {
      "confirmed": 35354,
      "recovered": 0,
      "deaths": 840,
      "country": "Tanzania",
      "population": 57310019,
      "sq_km_area": 883749,
      "life_expectancy": "52.3",
      "elevation_in_meters": "1,018",
      "continent": "Africa",
      "abbreviation": "TZ",
      "location": "Eastern Africa",
      "iso": 834,
      "capital_city": "Dodoma",
      "lat": "-6.369028",
      "long": "34.888822",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Thailand": {
    "All": {
      "confirmed": 4345218,
      "recovered": 0,
      "deaths": 29252,
      "country": "Thailand",
      "population": 69037513,
      "sq_km_area": 513115,
      "life_expectancy": "68.6",
      "elevation_in_meters": 287,
      "continent": "Asia",
      "abbreviation": "TH",
      "location": "Southeast Asia",
      "iso": 764,
      "capital_city": "Bangkok",
      "lat": "15.870032",
      "long": "100.992541",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Timor-Leste": {
    "All": {
      "confirmed": 22886,
      "recovered": 0,
      "deaths": 130,
      "lat": "-8.874217",
      "long": "125.727539",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Togo": {
    "All": {
      "confirmed": 37009,
      "recovered": 0,
      "deaths": 273,
      "country": "Togo",
      "population": 7797694,
      "sq_km_area": 56785,
      "life_expectancy": "54.7",
      "elevation_in_meters": 236,
      "continent": "Africa",
      "abbreviation": "TG",
      "location": "Western Africa",
      "iso": 768,
      "capital_city": "Lom",
      "lat": "8.6195",
      "long": "0.8248",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Tonga": {
    "All": {
      "confirmed": 10826,
      "recovered": 0,
      "deaths": 11,
      "country": "Tonga",
      "population": 108020,
      "sq_km_area": 650,
      "life_expectancy": "67.9",
      "elevation_in_meters": null,
      "continent": "Oceania",
      "abbreviation": "TO",
      "location": "Polynesia",
      "iso": 776,
      "capital_city": "Nuku'alofa",
      "lat": "-21.179",
      "long": "-175.1982",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Trinidad and Tobago": {
    "All": {
      "confirmed": 152380,
      "recovered": 0,
      "deaths": 3861,
      "country": "Trinidad and Tobago",
      "population": 1369125,
      "sq_km_area": 5130,
      "life_expectancy": 68,
      "elevation_in_meters": 83,
      "continent": "North America",
      "abbreviation": "TT",
      "location": "Caribbean",
      "iso": 780,
      "capital_city": "Port-of-Spain",
      "lat": "10.6918",
      "long": "-61.2225",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Tunisia": {
    "All": {
      "confirmed": 1041197,
      "recovered": 0,
      "deaths": 28575,
      "country": "Tunisia",
      "population": 11532127,
      "sq_km_area": 163610,
      "life_expectancy": "73.7",
      "elevation_in_meters": 246,
      "continent": "Africa",
      "abbreviation": "TN",
      "location": "Northern Africa",
      "iso": 788,
      "capital_city": "Tunis",
      "lat": "33.886917",
      "long": "9.537499",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Turkey": {
    "All": {
      "confirmed": 15046779,
      "recovered": 0,
      "deaths": 98861,
      "country": "Turkey",
      "population": 80745020,
      "sq_km_area": 774815,
      "life_expectancy": 71,
      "elevation_in_meters": "1,132",
      "continent": "Asia",
      "abbreviation": "TR",
      "location": "Middle East",
      "iso": 792,
      "capital_city": "Ankara",
      "lat": "38.9637",
      "long": "35.2433",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "US": {
    "All": {
      "confirmed": 82059839,
      "recovered": 0,
      "deaths": 998048,
      "country": "US",
      "population": 324459463,
      "sq_km_area": 9363520,
      "life_expectancy": "77.1",
      "elevation_in_meters": 760,
      "continent": "North America",
      "abbreviation": "US",
      "location": "North America",
      "iso": 840,
      "capital_city": "Washington"
    },
    "Alabama": {
      "lat": "34.15030532",
      "long": "-87.37325922",
      "confirmed": 7572,
      "recovered": 0,
      "deaths": 131,
      "updated": "2022-05-11 04:20:48"
    },
    "Alaska": {
      "lat": "65.50815459",
      "long": "-151.3907387",
      "confirmed": 1438,
      "recovered": 0,
      "deaths": 10,
      "updated": "2022-05-11 04:20:48"
    },
    "American Samoa": {
      "lat": "-14.271",
      "long": "-170.132",
      "confirmed": 5969,
      "recovered": 0,
      "deaths": 29,
      "updated": "2022-05-11 04:20:48"
    },
    "Arizona": {
      "lat": "32.76895712",
      "long": "-113.9066674",
      "confirmed": 62716,
      "recovered": 0,
      "deaths": 1180,
      "updated": "2022-05-11 04:20:48"
    },
    "Arkansas": {
      "lat": "35.00292371",
      "long": "-93.41171338",
      "confirmed": 6858,
      "recovered": 0,
      "deaths": 106,
      "updated": "2022-05-11 04:20:48"
    },
    "California": {
      "lat": "39.26255932",
      "long": "-121.3535644",
      "confirmed": 17236,
      "recovered": 0,
      "deaths": 122,
      "updated": "2022-05-11 04:20:48"
    },
    "Colorado": {
      "lat": "40.00346839",
      "long": "-102.4258673",
      "confirmed": 1883,
      "recovered": 0,
      "deaths": 23,
      "updated": "2022-05-11 04:20:48"
    },
    "Connecticut": {
      "lat": "41.82972709",
      "long": "-71.98182316",
      "confirmed": 26461,
      "recovered": 0,
      "deaths": 305,
      "updated": "2022-05-11 04:20:48"
    },
    "Delaware": {
      "lat": "",
      "long": "",
      "confirmed": 885,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Diamond Princess": {
      "lat": "",
      "long": "",
      "confirmed": 49,
      "recovered": 0,
      "deaths": 0,
      "updated": "2020-08-04 02:27:56"
    },
    "District of Columbia": {
      "lat": "38.90417773",
      "long": "-77.01655992",
      "confirmed": 143005,
      "recovered": 0,
      "deaths": 1340,
      "updated": "2022-05-11 04:20:48"
    },
    "Florida": {
      "lat": "30.61359259",
      "long": "-85.66002461",
      "confirmed": 6663,
      "recovered": 0,
      "deaths": 110,
      "updated": "2022-05-11 04:20:48"
    },
    "Georgia": {
      "lat": "31.55162306",
      "long": "-83.85090513",
      "confirmed": 4620,
      "recovered": 0,
      "deaths": 119,
      "updated": "2022-05-11 04:20:48"
    },
    "Grand Princess": {
      "lat": "",
      "long": "",
      "confirmed": 103,
      "recovered": 0,
      "deaths": 3,
      "updated": "2020-08-04 02:27:56"
    },
    "Guam": {
      "lat": "13.4443",
      "long": "144.7937",
      "confirmed": 48401,
      "recovered": 0,
      "deaths": 358,
      "updated": "2022-05-11 04:20:48"
    },
    "Hawaii": {
      "lat": "",
      "long": "",
      "confirmed": 0,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Idaho": {
      "lat": "44.45275475",
      "long": "-116.7847688",
      "confirmed": 2392,
      "recovered": 0,
      "deaths": 57,
      "updated": "2022-05-11 04:20:48"
    },
    "Illinois": {
      "lat": "40.78579374",
      "long": "-89.20973757",
      "confirmed": 10534,
      "recovered": 0,
      "deaths": 111,
      "updated": "2022-05-11 04:20:48"
    },
    "Indiana": {
      "lat": "41.13863784",
      "long": "-85.50791236",
      "confirmed": 9720,
      "recovered": 0,
      "deaths": 84,
      "updated": "2022-05-11 04:20:48"
    },
    "Iowa": {
      "lat": "42.73305373",
      "long": "-93.73515113",
      "confirmed": 3614,
      "recovered": 0,
      "deaths": 63,
      "updated": "2022-05-11 04:20:48"
    },
    "Kansas": {
      "lat": "39.11727348",
      "long": "-94.76378225",
      "confirmed": 47187,
      "recovered": 0,
      "deaths": 488,
      "updated": "2022-05-11 04:20:48"
    },
    "Kentucky": {
      "lat": "38.04178222",
      "long": "-84.7417556",
      "confirmed": 6978,
      "recovered": 0,
      "deaths": 49,
      "updated": "2022-05-11 04:20:48"
    },
    "Louisiana": {
      "lat": "31.94449367",
      "long": "-92.63789413",
      "confirmed": 4169,
      "recovered": 0,
      "deaths": 64,
      "updated": "2022-05-11 04:20:48"
    },
    "Maine": {
      "lat": "43.47808377",
      "long": "-70.71052375",
      "confirmed": 41568,
      "recovered": 0,
      "deaths": 291,
      "updated": "2022-05-11 04:20:48"
    },
    "Maryland": {
      "lat": "38.21274277",
      "long": "-75.33200012",
      "confirmed": 8786,
      "recovered": 0,
      "deaths": 160,
      "updated": "2022-05-11 04:20:48"
    },
    "Massachusetts": {
      "lat": "42.35026951",
      "long": "-71.90493363",
      "confirmed": 200061,
      "recovered": 0,
      "deaths": 2593,
      "updated": "2022-05-11 04:20:48"
    },
    "Michigan": {
      "lat": "44.33853602",
      "long": "-85.57712739",
      "confirmed": 7125,
      "recovered": 0,
      "deaths": 107,
      "updated": "2022-05-11 04:20:48"
    },
    "Minnesota": {
      "lat": "44.71710183",
      "long": "-95.86842453",
      "confirmed": 2566,
      "recovered": 0,
      "deaths": 29,
      "updated": "2022-05-11 04:20:48"
    },
    "Mississippi": {
      "lat": "32.77890365",
      "long": "-90.39656148",
      "confirmed": 8054,
      "recovered": 0,
      "deaths": 107,
      "updated": "2022-05-11 04:20:48"
    },
    "Missouri": {
      "lat": "37.27029221",
      "long": "-92.46914488",
      "confirmed": 3834,
      "recovered": 0,
      "deaths": 80,
      "updated": "2022-05-11 04:20:48"
    },
    "Montana": {
      "lat": "45.93955949",
      "long": "-108.2691486",
      "confirmed": 43038,
      "recovered": 0,
      "deaths": 551,
      "updated": "2022-05-11 04:20:48"
    },
    "Nebraska": {
      "lat": "40.87272618",
      "long": "-97.59710186",
      "confirmed": 3924,
      "recovered": 0,
      "deaths": 21,
      "updated": "2022-05-11 04:20:48"
    },
    "Nevada": {
      "lat": "39.44157041",
      "long": "-114.899966",
      "confirmed": 1694,
      "recovered": 0,
      "deaths": 19,
      "updated": "2022-05-11 04:20:48"
    },
    "New Hampshire": {
      "lat": "",
      "long": "",
      "confirmed": 4428,
      "recovered": 0,
      "deaths": 2,
      "updated": "2022-05-11 04:20:48"
    },
    "New Jersey": {
      "lat": "40.85951833",
      "long": "-74.99556527",
      "confirmed": 24681,
      "recovered": 0,
      "deaths": 342,
      "updated": "2022-05-11 04:20:48"
    },
    "New Mexico": {
      "lat": "34.71669834",
      "long": "-106.8103733",
      "confirmed": 18704,
      "recovered": 0,
      "deaths": 276,
      "updated": "2022-05-11 04:20:48"
    },
    "New York": {
      "lat": "42.63505484",
      "long": "-77.10369919",
      "confirmed": 3683,
      "recovered": 0,
      "deaths": 40,
      "updated": "2022-05-11 04:20:48"
    },
    "North Carolina": {
      "lat": "35.90079156",
      "long": "-82.31237181",
      "confirmed": 5331,
      "recovered": 0,
      "deaths": 57,
      "updated": "2022-05-11 04:20:48"
    },
    "North Dakota": {
      "lat": "48.34522353",
      "long": "-103.4793387",
      "confirmed": 10488,
      "recovered": 0,
      "deaths": 68,
      "updated": "2022-05-11 04:20:48"
    },
    "Northern Mariana Islands": {
      "lat": "15.0979",
      "long": "145.6739",
      "confirmed": 11305,
      "recovered": 0,
      "deaths": 34,
      "updated": "2022-05-11 04:20:48"
    },
    "Ohio": {
      "lat": "40.84339621",
      "long": "-83.30734173",
      "confirmed": 5425,
      "recovered": 0,
      "deaths": 105,
      "updated": "2022-05-11 04:20:48"
    },
    "Oklahoma": {
      "lat": "36.42316318",
      "long": "-99.26283045",
      "confirmed": 5168,
      "recovered": 0,
      "deaths": 76,
      "updated": "2022-05-11 04:20:48"
    },
    "Oregon": {
      "lat": "45.23330449",
      "long": "-123.3086963",
      "confirmed": 18179,
      "recovered": 0,
      "deaths": 222,
      "updated": "2022-05-11 04:20:48"
    },
    "Pennsylvania": {
      "lat": "39.9210089",
      "long": "-76.73040131",
      "confirmed": 119729,
      "recovered": 0,
      "deaths": 1501,
      "updated": "2022-05-11 04:20:48"
    },
    "Puerto Rico": {
      "lat": "18.080374",
      "long": "-66.858814",
      "confirmed": 4793,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Recovered": {
      "lat": "",
      "long": "",
      "confirmed": 0,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Rhode Island": {
      "lat": "41.45961631",
      "long": "-71.61435303",
      "confirmed": 33726,
      "recovered": 0,
      "deaths": 224,
      "updated": "2022-05-11 04:20:48"
    },
    "South Carolina": {
      "lat": "34.97281497",
      "long": "-81.18085944",
      "confirmed": 77962,
      "recovered": 0,
      "deaths": 676,
      "updated": "2022-05-11 04:20:48"
    },
    "South Dakota": {
      "lat": "44.97881876",
      "long": "-101.6654622",
      "confirmed": 664,
      "recovered": 0,
      "deaths": 11,
      "updated": "2022-05-11 04:20:48"
    },
    "Tennessee": {
      "lat": "36.15496772",
      "long": "-86.29775884",
      "confirmed": 41840,
      "recovered": 0,
      "deaths": 484,
      "updated": "2022-05-11 04:20:48"
    },
    "Texas": {
      "lat": "28.86617238",
      "long": "-99.76050829",
      "confirmed": 4058,
      "recovered": 0,
      "deaths": 68,
      "updated": "2022-05-11 04:20:48"
    },
    "Utah": {
      "lat": "41.27116049",
      "long": "-111.9145117",
      "confirmed": 74242,
      "recovered": 0,
      "deaths": 455,
      "updated": "2022-05-11 04:20:48"
    },
    "Vermont": {
      "lat": "43.58010937",
      "long": "-72.58595157",
      "confirmed": 9542,
      "recovered": 0,
      "deaths": 52,
      "updated": "2022-05-11 04:20:48"
    },
    "Virgin Islands": {
      "lat": "18.3358",
      "long": "-64.8963",
      "confirmed": 17485,
      "recovered": 0,
      "deaths": 113,
      "updated": "2022-05-11 04:20:48"
    },
    "Virginia": {
      "lat": "37.24374789",
      "long": "-76.54412815",
      "confirmed": 10121,
      "recovered": 0,
      "deaths": 109,
      "updated": "2022-05-11 04:20:48"
    },
    "Washington": {
      "lat": "46.45738486",
      "long": "-120.7380126",
      "confirmed": 72284,
      "recovered": 0,
      "deaths": 789,
      "updated": "2022-05-11 04:20:48"
    },
    "West Virginia": {
      "lat": "37.612327",
      "long": "-81.54511071",
      "confirmed": 7034,
      "recovered": 0,
      "deaths": 116,
      "updated": "2022-05-11 04:20:48"
    },
    "Wisconsin": {
      "lat": "44.45537896",
      "long": "-90.04158336",
      "confirmed": 21360,
      "recovered": 0,
      "deaths": 233,
      "updated": "2022-05-11 04:20:48"
    },
    "Wyoming": {
      "lat": "43.83961191",
      "long": "-104.5674881",
      "confirmed": 1588,
      "recovered": 0,
      "deaths": 18,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Uganda": {
    "All": {
      "confirmed": 164153,
      "recovered": 0,
      "deaths": 3598,
      "country": "Uganda",
      "population": 42862958,
      "sq_km_area": 241038,
      "life_expectancy": "42.9",
      "elevation_in_meters": null,
      "continent": "Africa",
      "abbreviation": "UG",
      "location": "Eastern Africa",
      "iso": 800,
      "capital_city": "Kampala",
      "lat": "1.373333",
      "long": "32.290275",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Ukraine": {
    "All": {
      "confirmed": 5040518,
      "recovered": 0,
      "deaths": 112459,
      "country": "Ukraine",
      "population": 44222947,
      "sq_km_area": 603700,
      "life_expectancy": 66,
      "elevation_in_meters": 175,
      "continent": "Europe",
      "abbreviation": "UA",
      "location": "Eastern Europe",
      "iso": 804,
      "capital_city": "Kyiv"
    },
    "Cherkasy Oblast": {
      "lat": "49.4444",
      "long": "32.0598",
      "confirmed": 163768,
      "recovered": 0,
      "deaths": 2973,
      "updated": "2022-03-01 23:21:04"
    },
    "Chernihiv Oblast": {
      "lat": "51.4982",
      "long": "31.2893",
      "confirmed": 126202,
      "recovered": 0,
      "deaths": 2751,
      "updated": "2022-03-01 23:21:04"
    },
    "Chernivtsi Oblast": {
      "lat": "48.2917",
      "long": "25.9352",
      "confirmed": 150465,
      "recovered": 0,
      "deaths": 3290,
      "updated": "2022-03-01 23:21:04"
    },
    "Crimea Republic*": {
      "lat": "45.2835",
      "long": "34.2008",
      "confirmed": 157596,
      "recovered": 0,
      "deaths": 4866,
      "updated": "2022-03-01 23:21:04"
    },
    "Dnipropetrovsk Oblast": {
      "lat": "48.4647",
      "long": "35.0462",
      "confirmed": 303551,
      "recovered": 0,
      "deaths": 9454,
      "updated": "2022-03-01 23:21:04"
    },
    "Donetsk Oblast": {
      "lat": "48.0159",
      "long": "37.8028",
      "confirmed": 216052,
      "recovered": 0,
      "deaths": 5607,
      "updated": "2022-03-01 23:21:04"
    },
    "Ivano-Frankivsk Oblast": {
      "lat": "48.9226",
      "long": "24.7111",
      "confirmed": 181629,
      "recovered": 0,
      "deaths": 3476,
      "updated": "2022-03-01 23:21:04"
    },
    "Kharkiv Oblast": {
      "lat": "49.9935",
      "long": "36.2304",
      "confirmed": 305661,
      "recovered": 0,
      "deaths": 6858,
      "updated": "2022-03-01 23:21:04"
    },
    "Kherson Oblast": {
      "lat": "46.6354",
      "long": "32.6169",
      "confirmed": 107686,
      "recovered": 0,
      "deaths": 2881,
      "updated": "2022-03-01 23:21:04"
    },
    "Khmelnytskyi Oblast": {
      "lat": "49.423",
      "long": "26.9871",
      "confirmed": 201270,
      "recovered": 0,
      "deaths": 3703,
      "updated": "2022-03-01 23:21:04"
    },
    "Kiev": {
      "lat": "50.4501",
      "long": "30.5234",
      "confirmed": 445098,
      "recovered": 0,
      "deaths": 8966,
      "updated": "2022-03-01 23:21:04"
    },
    "Kiev Oblast": {
      "lat": "50.053",
      "long": "30.7667",
      "confirmed": 226220,
      "recovered": 0,
      "deaths": 5019,
      "updated": "2022-03-01 23:21:04"
    },
    "Kirovohrad Oblast": {
      "lat": "48.5079",
      "long": "32.2623",
      "confirmed": 45117,
      "recovered": 0,
      "deaths": 1741,
      "updated": "2022-03-01 23:21:04"
    },
    "Luhansk Oblast": {
      "lat": "48.574",
      "long": "39.3078",
      "confirmed": 80033,
      "recovered": 0,
      "deaths": 2392,
      "updated": "2022-03-01 23:21:04"
    },
    "Lviv Oblast": {
      "lat": "49.8397",
      "long": "24.0297",
      "confirmed": 303357,
      "recovered": 0,
      "deaths": 6569,
      "updated": "2022-03-01 23:21:04"
    },
    "Mykolaiv Oblast": {
      "lat": "46.975",
      "long": "31.9946",
      "confirmed": 146174,
      "recovered": 0,
      "deaths": 3530,
      "updated": "2022-03-01 23:21:04"
    },
    "Odessa Oblast": {
      "lat": "46.4846",
      "long": "30.7326",
      "confirmed": 325462,
      "recovered": 0,
      "deaths": 5917,
      "updated": "2022-03-01 23:21:04"
    },
    "Poltava Oblast": {
      "lat": "49.5883",
      "long": "34.5514",
      "confirmed": 179994,
      "recovered": 0,
      "deaths": 4181,
      "updated": "2022-03-01 23:21:04"
    },
    "Rivne Oblast": {
      "lat": "50.6199",
      "long": "26.2516",
      "confirmed": 171031,
      "recovered": 0,
      "deaths": 2530,
      "updated": "2022-03-01 23:21:04"
    },
    "Sevastopol*": {
      "lat": "44.6054",
      "long": "33.522",
      "confirmed": 73298,
      "recovered": 0,
      "deaths": 2088,
      "updated": "2022-03-01 23:21:04"
    },
    "Sumy Oblast": {
      "lat": "50.9077",
      "long": "34.7981",
      "confirmed": 182268,
      "recovered": 0,
      "deaths": 3208,
      "updated": "2022-03-01 23:21:04"
    },
    "Ternopil Oblast": {
      "lat": "49.5535",
      "long": "25.5948",
      "confirmed": 146363,
      "recovered": 0,
      "deaths": 2391,
      "updated": "2022-03-01 23:21:04"
    },
    "Vinnytsia Oblast": {
      "lat": "49.2331",
      "long": "28.4682",
      "confirmed": 149845,
      "recovered": 0,
      "deaths": 3546,
      "updated": "2022-03-01 23:21:04"
    },
    "Volyn Oblast": {
      "lat": "50.7472",
      "long": "25.3254",
      "confirmed": 132045,
      "recovered": 0,
      "deaths": 2394,
      "updated": "2022-03-01 23:21:04"
    },
    "Zakarpattia Oblast": {
      "lat": "48.6208",
      "long": "22.2879",
      "confirmed": 112462,
      "recovered": 0,
      "deaths": 2724,
      "updated": "2022-03-01 23:21:04"
    },
    "Zaporizhia Oblast": {
      "lat": "47.8388",
      "long": "35.1396",
      "confirmed": 215070,
      "recovered": 0,
      "deaths": 5866,
      "updated": "2022-03-01 23:21:04"
    },
    "Zhytomyr Oblast": {
      "lat": "50.2547",
      "long": "28.6587",
      "confirmed": 192801,
      "recovered": 0,
      "deaths": 3538,
      "updated": "2022-03-01 23:21:04"
    }
  },
  "United Arab Emirates": {
    "All": {
      "confirmed": 900764,
      "recovered": 0,
      "deaths": 2302,
      "country": "United Arab Emirates",
      "population": 9400145,
      "sq_km_area": 83600,
      "life_expectancy": "74.1",
      "elevation_in_meters": 149,
      "continent": "Asia",
      "abbreviation": "AE",
      "location": "Middle East",
      "iso": 784,
      "capital_city": "Abu Dhabi",
      "lat": "23.424076",
      "long": "53.847818",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "United Kingdom": {
    "All": {
      "confirmed": 22329180,
      "recovered": 0,
      "deaths": 177358,
      "country": "United Kingdom",
      "population": 66181585,
      "sq_km_area": 242900,
      "life_expectancy": "77.7",
      "elevation_in_meters": 162,
      "continent": "Europe",
      "abbreviation": "GB",
      "location": "British Isles",
      "iso": 826,
      "capital_city": "London"
    },
    "Anguilla": {
      "lat": "18.2206",
      "long": "-63.0686",
      "confirmed": 2984,
      "recovered": 0,
      "deaths": 9,
      "updated": "2022-05-11 04:20:48"
    },
    "Bermuda": {
      "lat": "32.3078",
      "long": "-64.7505",
      "confirmed": 13872,
      "recovered": 0,
      "deaths": 135,
      "updated": "2022-05-11 04:20:48"
    },
    "British Virgin Islands": {
      "lat": "18.4207",
      "long": "-64.64",
      "confirmed": 6467,
      "recovered": 0,
      "deaths": 62,
      "updated": "2022-05-11 04:20:48"
    },
    "Cayman Islands": {
      "lat": "19.3133",
      "long": "-81.2546",
      "confirmed": 22828,
      "recovered": 0,
      "deaths": 28,
      "updated": "2022-05-11 04:20:48"
    },
    "Channel Islands": {
      "lat": "49.3723",
      "long": "-2.3644",
      "confirmed": 0,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "England": {
      "lat": "52.3555",
      "long": "-1.1743",
      "confirmed": 18631175,
      "recovered": 0,
      "deaths": 153676,
      "updated": "2022-05-11 04:20:48"
    },
    "Falkland Islands (Malvinas)": {
      "lat": "-51.7963",
      "long": "-59.5236",
      "confirmed": 392,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Gibraltar": {
      "lat": "36.1408",
      "long": "-5.3536",
      "confirmed": 17996,
      "recovered": 0,
      "deaths": 102,
      "updated": "2022-05-11 04:20:48"
    },
    "Guernsey": {
      "lat": "49.448196",
      "long": "-2.58949",
      "confirmed": 24832,
      "recovered": 0,
      "deaths": 45,
      "updated": "2022-05-11 04:20:48"
    },
    "Isle of Man": {
      "lat": "54.2361",
      "long": "-4.5481",
      "confirmed": 32424,
      "recovered": 0,
      "deaths": 104,
      "updated": "2022-05-11 04:20:48"
    },
    "Jersey": {
      "lat": "49.2138",
      "long": "-2.1358",
      "confirmed": 50033,
      "recovered": 0,
      "deaths": 127,
      "updated": "2022-05-11 04:20:48"
    },
    "Montserrat": {
      "lat": "16.742498",
      "long": "-62.187366",
      "confirmed": 653,
      "recovered": 0,
      "deaths": 2,
      "updated": "2022-05-11 04:20:48"
    },
    "Northern Ireland": {
      "lat": "54.7877",
      "long": "-6.4923",
      "confirmed": 710567,
      "recovered": 0,
      "deaths": 3432,
      "updated": "2022-05-11 04:20:48"
    },
    "Saint Helena, Ascension and Tristan da Cunha": {
      "lat": "-7.9467",
      "long": "-14.3559",
      "confirmed": 4,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Scotland": {
      "lat": "56.4907",
      "long": "-4.2026",
      "confirmed": 1935488,
      "recovered": 0,
      "deaths": 12179,
      "updated": "2022-05-11 04:20:48"
    },
    "Turks and Caicos Islands": {
      "lat": "21.694",
      "long": "-71.7979",
      "confirmed": 5995,
      "recovered": 0,
      "deaths": 36,
      "updated": "2022-05-11 04:20:48"
    },
    "Unknown": {
      "lat": "",
      "long": "",
      "confirmed": 0,
      "recovered": 0,
      "deaths": 0,
      "updated": "2022-05-11 04:20:48"
    },
    "Wales": {
      "lat": "52.1307",
      "long": "-3.7837",
      "confirmed": 873470,
      "recovered": 0,
      "deaths": 7421,
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Uruguay": {
    "All": {
      "confirmed": 902540,
      "recovered": 0,
      "deaths": 7213,
      "country": "Uruguay",
      "population": 3456750,
      "sq_km_area": 175016,
      "life_expectancy": "75.2",
      "elevation_in_meters": 109,
      "continent": "South America",
      "abbreviation": "UY",
      "location": "South America",
      "iso": 858,
      "capital_city": "Montevideo",
      "lat": "-32.5228",
      "long": "-55.7658",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Uzbekistan": {
    "All": {
      "confirmed": 238743,
      "recovered": 0,
      "deaths": 1637,
      "country": "Uzbekistan",
      "population": 31910641,
      "sq_km_area": 447400,
      "life_expectancy": "63.7",
      "elevation_in_meters": null,
      "continent": "Asia",
      "abbreviation": "UZ",
      "location": "Southern and Central Asia",
      "iso": 860,
      "capital_city": "Toskent",
      "lat": "41.377491",
      "long": "64.585262",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Vanuatu": {
    "All": {
      "confirmed": 8063,
      "recovered": 0,
      "deaths": 14,
      "country": "Vanuatu",
      "population": 276244,
      "sq_km_area": 12189,
      "life_expectancy": "60.6",
      "elevation_in_meters": null,
      "continent": "Oceania",
      "abbreviation": "VU",
      "location": "Melanesia",
      "iso": 548,
      "capital_city": "Port-Vila",
      "lat": "-15.3767",
      "long": "166.9592",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Venezuela": {
    "All": {
      "confirmed": 522749,
      "recovered": 0,
      "deaths": 5709,
      "country": "Venezuela",
      "population": 31977065,
      "sq_km_area": 912050,
      "life_expectancy": "73.1",
      "elevation_in_meters": 450,
      "continent": "South America",
      "abbreviation": "VE",
      "location": "South America",
      "iso": 862,
      "capital_city": "Caracas",
      "lat": "6.4238",
      "long": "-66.5897",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Vietnam": {
    "All": {
      "confirmed": 10681214,
      "recovered": 0,
      "deaths": 43058,
      "country": "Vietnam",
      "population": 95540800,
      "sq_km_area": 331689,
      "life_expectancy": "69.3",
      "elevation_in_meters": 398,
      "continent": "Asia",
      "abbreviation": "VN",
      "location": "Southeast Asia",
      "iso": 704,
      "capital_city": "Hanoi",
      "lat": "14.058324",
      "long": "108.277199",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "West Bank and Gaza": {
    "All": {
      "confirmed": 657193,
      "recovered": 0,
      "deaths": 5657,
      "lat": "31.9522",
      "long": "35.2332",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Winter Olympics 2022": {
    "All": {
      "confirmed": 535,
      "recovered": 0,
      "deaths": 0,
      "lat": "39.9042",
      "long": "116.4074",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Yemen": {
    "All": {
      "confirmed": 11819,
      "recovered": 0,
      "deaths": 2149,
      "country": "Yemen",
      "population": 28250420,
      "sq_km_area": 527968,
      "life_expectancy": "59.8",
      "elevation_in_meters": 999,
      "continent": "Asia",
      "abbreviation": "YE",
      "location": "Middle East",
      "iso": 887,
      "capital_city": "Sanaa",
      "lat": "15.552727",
      "long": "48.516388",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Zambia": {
    "All": {
      "confirmed": 320226,
      "recovered": 0,
      "deaths": 3983,
      "country": "Zambia",
      "population": 17094130,
      "sq_km_area": 752618,
      "life_expectancy": "37.2",
      "elevation_in_meters": "1,138",
      "continent": "Africa",
      "abbreviation": "ZM",
      "location": "Eastern Africa",
      "iso": 894,
      "capital_city": "Lusaka",
      "lat": "-13.133897",
      "long": "27.849332",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Zimbabwe": {
    "All": {
      "confirmed": 248642,
      "recovered": 0,
      "deaths": 5481,
      "country": "Zimbabwe",
      "population": 16529904,
      "sq_km_area": 390757,
      "life_expectancy": "37.8",
      "elevation_in_meters": 961,
      "continent": "Africa",
      "abbreviation": "ZW",
      "location": "Eastern Africa",
      "iso": 716,
      "capital_city": "Harare",
      "lat": "-19.015438",
      "long": "29.154857",
      "updated": "2022-05-11 04:20:48"
    }
  },
  "Global": {
    "All": {
      "population": 7444509223,
      "confirmed": 518739086,
      "recovered": 0,
      "deaths": 6255511
    }
  }
}
"""

private val vaccinesResponseMock = """
{
  "Afghanistan": {
    "All": {
      "administered": 6023425,
      "people_vaccinated": 4670950,
      "people_partially_vaccinated": 5320381,
      "country": "Afghanistan",
      "population": 35530081,
      "sq_km_area": 652090,
      "life_expectancy": "45.9",
      "elevation_in_meters": null,
      "continent": "Asia",
      "abbreviation": "AF",
      "location": "Southern and Central Asia",
      "iso": 4,
      "capital_city": "Kabul",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Albania": {
    "All": {
      "administered": 2837346,
      "people_vaccinated": 1235239,
      "people_partially_vaccinated": 1311182,
      "country": "Albania",
      "population": 2930187,
      "sq_km_area": 28748,
      "life_expectancy": "71.6",
      "elevation_in_meters": null,
      "continent": "Europe",
      "abbreviation": "AL",
      "location": "Southern Europe",
      "iso": 8,
      "capital_city": "Tirana",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Algeria": {
    "All": {
      "administered": 15205854,
      "people_vaccinated": 6481186,
      "people_partially_vaccinated": 7840131,
      "country": "Algeria",
      "population": 41318142,
      "sq_km_area": 2381741,
      "life_expectancy": "69.7",
      "elevation_in_meters": 800,
      "continent": "Africa",
      "abbreviation": "DZ",
      "location": "Northern Africa",
      "iso": 12,
      "capital_city": "Alger",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Andorra": {
    "All": {
      "administered": 152694,
      "people_vaccinated": 53414,
      "people_partially_vaccinated": 57866,
      "country": "Andorra",
      "population": 76965,
      "sq_km_area": 468,
      "life_expectancy": "83.5",
      "elevation_in_meters": "1,996",
      "continent": "Europe",
      "abbreviation": "AD",
      "location": "Southern Europe",
      "iso": 20,
      "capital_city": "Andorra la Vella",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Angola": {
    "All": {
      "administered": 17896626,
      "people_vaccinated": 6327907,
      "people_partially_vaccinated": 12059919,
      "country": "Angola",
      "population": 29784193,
      "sq_km_area": 1246700,
      "life_expectancy": "38.3",
      "elevation_in_meters": "1,112",
      "continent": "Africa",
      "abbreviation": "AO",
      "location": "Central Africa",
      "iso": 24,
      "capital_city": "Luanda",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Antigua and Barbuda": {
    "All": {
      "administered": 135605,
      "people_vaccinated": 61687,
      "people_partially_vaccinated": 63918,
      "country": "Antigua and Barbuda",
      "population": 102012,
      "sq_km_area": 442,
      "life_expectancy": "70.5",
      "elevation_in_meters": null,
      "continent": "North America",
      "abbreviation": "AG",
      "location": "Caribbean",
      "iso": 28,
      "capital_city": "Saint John's",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Argentina": {
    "All": {
      "administered": 99624384,
      "people_vaccinated": 37312781,
      "people_partially_vaccinated": 41048967,
      "country": "Argentina",
      "population": 44271041,
      "sq_km_area": 2780400,
      "life_expectancy": "75.1",
      "elevation_in_meters": 595,
      "continent": "South America",
      "abbreviation": "AR",
      "location": "South America",
      "iso": 32,
      "capital_city": "Buenos Aires",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Autonomous City of Buenos Aires": {
      "administered": 7922876,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Buenos Aires": {
      "administered": 39014345,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Catamarca": {
      "administered": 975580,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Chaco": {
      "administered": 2178763,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Chubut": {
      "administered": 1154873,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Cordoba": {
      "administered": 8200481,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Corrientes": {
      "administered": 2330942,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Entre Rios": {
      "administered": 2962632,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Formosa": {
      "administered": 1491936,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Jujuy": {
      "administered": 1603838,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "La Pampa": {
      "administered": 916696,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "La Rioja": {
      "administered": 905476,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Mendoza": {
      "administered": 4090069,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Misiones": {
      "administered": 2100017,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Neuquen": {
      "administered": 1533520,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Rio Negro": {
      "administered": 1663630,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Salta": {
      "administered": 2637500,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "San Juan": {
      "administered": 1651169,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "San Luis": {
      "administered": 1251703,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Santa Cruz": {
      "administered": 701521,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Santa Fe": {
      "administered": 8336639,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Santiago del Estero": {
      "administered": 2334643,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Tierra del Fuego": {
      "administered": 374070,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Tucuman": {
      "administered": 3291465,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Armenia": {
    "All": {
      "administered": 2154689,
      "people_vaccinated": 987673,
      "people_partially_vaccinated": 1131339,
      "country": "Armenia",
      "population": 2930450,
      "sq_km_area": 29800,
      "life_expectancy": "66.4",
      "elevation_in_meters": "1,792",
      "continent": "Asia",
      "abbreviation": "AM",
      "location": "Middle East",
      "iso": 51,
      "capital_city": "Yerevan",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Australia": {
    "All": {
      "administered": 58200077,
      "people_vaccinated": 21561125,
      "people_partially_vaccinated": 22292362,
      "country": "Australia",
      "population": 24450561,
      "sq_km_area": 7741220,
      "life_expectancy": "79.8",
      "elevation_in_meters": 330,
      "continent": "Oceania",
      "abbreviation": "AU",
      "location": "Australia and New Zealand",
      "iso": 36,
      "capital_city": "Canberra",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Australian Capital Territory": {
      "administered": 1520150,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "New South Wales": {
      "administered": 18054443,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Northern Territory": {
      "administered": 580507,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Queensland": {
      "administered": 11009884,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "South Australia": {
      "administered": 4019881,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Tasmania": {
      "administered": 1313112,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Unknown": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Victoria": {
      "administered": 15299086,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Western Australia": {
      "administered": 6403014,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Austria": {
    "All": {
      "administered": 18308168,
      "people_vaccinated": 6608725,
      "people_partially_vaccinated": 6823020,
      "country": "Austria",
      "population": 8735453,
      "sq_km_area": 83859,
      "life_expectancy": "77.7",
      "elevation_in_meters": 910,
      "continent": "Europe",
      "abbreviation": "AT",
      "location": "Western Europe",
      "iso": 40,
      "capital_city": "Wien",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Azerbaijan": {
    "All": {
      "administered": 13669891,
      "people_vaccinated": 4842230,
      "people_partially_vaccinated": 5341971,
      "country": "Azerbaijan",
      "population": 9827589,
      "sq_km_area": 86600,
      "life_expectancy": "62.9",
      "elevation_in_meters": 384,
      "continent": "Asia",
      "abbreviation": "AZ",
      "location": "Middle East",
      "iso": 31,
      "capital_city": "Baku",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Bahamas": {
    "All": {
      "administered": 340866,
      "people_vaccinated": 157964,
      "people_partially_vaccinated": 166471,
      "country": "Bahamas",
      "population": 395361,
      "sq_km_area": 13878,
      "life_expectancy": "71.1",
      "elevation_in_meters": null,
      "continent": "North America",
      "abbreviation": "BS",
      "location": "Caribbean",
      "iso": 44,
      "capital_city": "Nassau",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Bahrain": {
    "All": {
      "administered": 3436743,
      "people_vaccinated": 1219122,
      "people_partially_vaccinated": 1234889,
      "country": "Bahrain",
      "population": 1492584,
      "sq_km_area": 694,
      "life_expectancy": 73,
      "elevation_in_meters": null,
      "continent": "Asia",
      "abbreviation": "BH",
      "location": "Middle East",
      "iso": 48,
      "capital_city": "al-Manama",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Barbados": {
    "All": {
      "administered": 361863,
      "people_vaccinated": 152215,
      "people_partially_vaccinated": 161899,
      "country": "Barbados",
      "population": 285719,
      "sq_km_area": 430,
      "life_expectancy": 73,
      "elevation_in_meters": null,
      "continent": "North America",
      "abbreviation": "BB",
      "location": "Caribbean",
      "iso": 52,
      "capital_city": "Bridgetown",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Belarus": {
    "All": {
      "administered": 12495345,
      "people_vaccinated": 5770133,
      "people_partially_vaccinated": 6178206,
      "country": "Belarus",
      "population": 9468338,
      "sq_km_area": 207600,
      "life_expectancy": 68,
      "elevation_in_meters": 160,
      "continent": "Europe",
      "abbreviation": "BY",
      "location": "Eastern Europe",
      "iso": 112,
      "capital_city": "Minsk",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Belgium": {
    "All": {
      "administered": 25326608,
      "people_vaccinated": 9140837,
      "people_partially_vaccinated": 9239028,
      "country": "Belgium",
      "population": 11429336,
      "sq_km_area": 30518,
      "life_expectancy": "77.8",
      "elevation_in_meters": 181,
      "continent": "Europe",
      "abbreviation": "BE",
      "location": "Western Europe",
      "iso": 56,
      "capital_city": "Bruxelles [Brussel]",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Belize": {
    "All": {
      "administered": 473152,
      "people_vaccinated": 211123,
      "people_partially_vaccinated": 237193,
      "country": "Belize",
      "population": 374681,
      "sq_km_area": 22696,
      "life_expectancy": "70.9",
      "elevation_in_meters": 173,
      "continent": "North America",
      "abbreviation": "BZ",
      "location": "Central America",
      "iso": 84,
      "capital_city": "Belmopan",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Benin": {
    "All": {
      "administered": 3333450,
      "people_vaccinated": 2621821,
      "people_partially_vaccinated": 3154360,
      "country": "Benin",
      "population": 11175692,
      "sq_km_area": 112622,
      "life_expectancy": "50.2",
      "elevation_in_meters": 273,
      "continent": "Africa",
      "abbreviation": "BJ",
      "location": "Western Africa",
      "iso": 204,
      "capital_city": "Porto-Novo",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Bhutan": {
    "All": {
      "administered": 1907022,
      "people_vaccinated": 671505,
      "people_partially_vaccinated": 692549,
      "country": "Bhutan",
      "population": 807610,
      "sq_km_area": 47000,
      "life_expectancy": "52.4",
      "elevation_in_meters": "3,280",
      "continent": "Asia",
      "abbreviation": "BT",
      "location": "Southern and Central Asia",
      "iso": 64,
      "capital_city": "Thimphu",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Bolivia": {
    "All": {
      "administered": 13552099,
      "people_vaccinated": 5904881,
      "people_partially_vaccinated": 7159929,
      "country": "Bolivia",
      "population": 11051600,
      "sq_km_area": 1098581,
      "life_expectancy": "63.7",
      "elevation_in_meters": "1,192",
      "continent": "South America",
      "abbreviation": "BO",
      "location": "South America",
      "iso": 68,
      "capital_city": "La Paz",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Bosnia and Herzegovina": {
    "All": {
      "administered": 1924950,
      "people_vaccinated": 846080,
      "people_partially_vaccinated": 943394,
      "country": "Bosnia and Herzegovina",
      "population": 3507017,
      "sq_km_area": 51197,
      "life_expectancy": "71.5",
      "elevation_in_meters": 500,
      "continent": "Europe",
      "abbreviation": "BA",
      "location": "Southern Europe",
      "iso": 70,
      "capital_city": "Sarajevo",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Botswana": {
    "All": {
      "administered": 2517260,
      "people_vaccinated": 1339651,
      "people_partially_vaccinated": 1479625,
      "country": "Botswana",
      "population": 2291661,
      "sq_km_area": 581730,
      "life_expectancy": "39.3",
      "elevation_in_meters": "1,013",
      "continent": "Africa",
      "abbreviation": "BW",
      "location": "Southern Africa",
      "iso": 72,
      "capital_city": "Gaborone",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Brazil": {
    "All": {
      "administered": 432639345,
      "people_vaccinated": 164719113,
      "people_partially_vaccinated": 182912971,
      "country": "Brazil",
      "population": 209288278,
      "sq_km_area": 8547403,
      "life_expectancy": "62.9",
      "elevation_in_meters": 320,
      "continent": "South America",
      "abbreviation": "BR",
      "location": "South America",
      "iso": 76,
      "capital_city": "Brasília",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Brunei": {
    "All": {
      "administered": 1084543,
      "people_vaccinated": 405414,
      "people_partially_vaccinated": 412058,
      "country": "Brunei",
      "population": 428697,
      "sq_km_area": 5765,
      "life_expectancy": "73.6",
      "elevation_in_meters": 478,
      "continent": "Asia",
      "abbreviation": "BN",
      "location": "Southeast Asia",
      "iso": 96,
      "capital_city": "Bandar Seri Begawan",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Bulgaria": {
    "All": {
      "administered": 4388303,
      "people_vaccinated": 2057158,
      "people_partially_vaccinated": 2086746,
      "country": "Bulgaria",
      "population": 7084571,
      "sq_km_area": 110994,
      "life_expectancy": "70.9",
      "elevation_in_meters": 472,
      "continent": "Europe",
      "abbreviation": "BG",
      "location": "Eastern Europe",
      "iso": 100,
      "capital_city": "Sofia",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Burkina Faso": {
    "All": {
      "administered": 3320425,
      "people_vaccinated": 1539455,
      "people_partially_vaccinated": 2432124,
      "country": "Burkina Faso",
      "population": 19193382,
      "sq_km_area": 274000,
      "life_expectancy": "46.7",
      "elevation_in_meters": 297,
      "continent": "Africa",
      "abbreviation": "BF",
      "location": "Western Africa",
      "iso": 854,
      "capital_city": "Ouagadougou",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Burma": {
    "All": {
      "administered": 56610283,
      "people_vaccinated": 24084296,
      "people_partially_vaccinated": 30931226,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Burundi": {
    "All": {
      "administered": 21152,
      "people_vaccinated": 12078,
      "people_partially_vaccinated": 12651,
      "country": "Burundi",
      "population": 10864245,
      "sq_km_area": 27834,
      "life_expectancy": "46.2",
      "elevation_in_meters": "1,504",
      "continent": "Africa",
      "abbreviation": "BI",
      "location": "Eastern Africa",
      "iso": 108,
      "capital_city": "Bujumbura",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Cabo Verde": {
    "All": {
      "administered": 756797,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Cambodia": {
    "All": {
      "administered": 38606671,
      "people_vaccinated": 14217963,
      "people_partially_vaccinated": 14958188,
      "country": "Cambodia",
      "population": 16005373,
      "sq_km_area": 181035,
      "life_expectancy": "56.5",
      "elevation_in_meters": 126,
      "continent": "Asia",
      "abbreviation": "KH",
      "location": "Southeast Asia",
      "iso": 116,
      "capital_city": "Phnom Penh",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Cameroon": {
    "All": {
      "administered": 1828882,
      "people_vaccinated": 1209108,
      "people_partially_vaccinated": 1552320,
      "country": "Cameroon",
      "population": 24053727,
      "sq_km_area": 475442,
      "life_expectancy": "54.8",
      "elevation_in_meters": 667,
      "continent": "Africa",
      "abbreviation": "CM",
      "location": "Central Africa",
      "iso": 120,
      "capital_city": "Yaound",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Canada": {
    "All": {
      "administered": 84559800,
      "people_vaccinated": 31334681,
      "people_partially_vaccinated": 32691759,
      "country": "Canada",
      "population": 36624199,
      "sq_km_area": 9970610,
      "life_expectancy": "79.4",
      "elevation_in_meters": 487,
      "continent": "North America",
      "abbreviation": "CA",
      "location": "North America",
      "iso": 124,
      "capital_city": "Ottawa",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Alberta": {
      "administered": 8741621,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "British Columbia": {
      "administered": 11637908,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Manitoba": {
      "administered": 2863534,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "New Brunswick": {
      "administered": 1748729,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Newfoundland and Labrador": {
      "administered": 970503,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Northwest Territories": {
      "administered": 101209,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Nova Scotia": {
      "administered": 2235685,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Nunavut": {
      "administered": 77083,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Ontario": {
      "administered": 32968528,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Prince Edward Island": {
      "administered": 378536,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Quebec": {
      "administered": 20003200,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Saskatchewan": {
      "administered": 2447113,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Yukon": {
      "administered": 92155,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Central African Republic": {
    "All": {
      "administered": 1037580,
      "people_vaccinated": 988591,
      "people_partially_vaccinated": 1023144,
      "country": "Central African Republic",
      "population": 4659080,
      "sq_km_area": 622984,
      "life_expectancy": 44,
      "elevation_in_meters": 635,
      "continent": "Africa",
      "abbreviation": "CF",
      "location": "Central Africa",
      "iso": 140,
      "capital_city": "Bangui",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Chad": {
    "All": {
      "administered": 2347168,
      "people_vaccinated": 2087559,
      "people_partially_vaccinated": 2212530,
      "country": "Chad",
      "population": 14899994,
      "sq_km_area": 1284000,
      "life_expectancy": "50.5",
      "elevation_in_meters": 543,
      "continent": "Africa",
      "abbreviation": "TD",
      "location": "Central Africa",
      "iso": 148,
      "capital_city": "N'Djam",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Chile": {
    "All": {
      "administered": 53481861,
      "people_vaccinated": 17469896,
      "people_partially_vaccinated": 17921746,
      "country": "Chile",
      "population": 18054726,
      "sq_km_area": 756626,
      "life_expectancy": "75.7",
      "elevation_in_meters": "1,871",
      "continent": "South America",
      "abbreviation": "CL",
      "location": "South America",
      "iso": 152,
      "capital_city": "Santiago de Chile",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "China": {
    "All": {
      "administered": 3381478475,
      "people_vaccinated": 1251042000,
      "people_partially_vaccinated": 1286049000,
      "country": "China",
      "population": 1409517397,
      "sq_km_area": 9572900,
      "life_expectancy": "71.4",
      "elevation_in_meters": "1,840",
      "continent": "Asia",
      "abbreviation": "CN",
      "location": "Eastern Asia",
      "iso": 156,
      "capital_city": "Peking",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Hong Kong": {
      "administered": 16337018,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Macau": {
      "administered": 1370678,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Colombia": {
    "All": {
      "administered": 83345284,
      "people_vaccinated": 35409389,
      "people_partially_vaccinated": 42100794,
      "country": "Colombia",
      "population": 49065615,
      "sq_km_area": 1138914,
      "life_expectancy": "70.3",
      "elevation_in_meters": 593,
      "continent": "South America",
      "abbreviation": "CO",
      "location": "South America",
      "iso": 170,
      "capital_city": "Santaf",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Amazonas": {
      "administered": 131760,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Antioquia": {
      "administered": 11866768,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Arauca": {
      "administered": 394373,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Atlantico": {
      "administered": 4776484,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Bolivar": {
      "administered": 3461523,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Boyaca": {
      "administered": 2310688,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Caldas": {
      "administered": 1765210,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Capital District": {
      "administered": 14844301,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Caqueta": {
      "administered": 459154,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Casanare": {
      "administered": 699081,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Cauca": {
      "administered": 1444179,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Cesar": {
      "administered": 1776691,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Choco": {
      "administered": 441292,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Cordoba": {
      "administered": 2566344,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Cundinamarca": {
      "administered": 5115045,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Guainia": {
      "administered": 50108,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Guaviare": {
      "administered": 112638,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Huila": {
      "administered": 1709570,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "La Guajira": {
      "administered": 1237214,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Magdalena": {
      "administered": 2068485,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Meta": {
      "administered": 1454453,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Narino": {
      "administered": 2270739,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Norte de Santander": {
      "administered": 2478776,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Putumayo": {
      "administered": 335471,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Quindio": {
      "administered": 986438,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Risaralda": {
      "administered": 1716810,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "San Andres y Providencia": {
      "administered": 129150,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Santander": {
      "administered": 3755394,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Sucre": {
      "administered": 1410631,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Tolima": {
      "administered": 2399340,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Unknown": {
      "administered": 1468062,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Valle del Cauca": {
      "administered": 7175879,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Vaupes": {
      "administered": 39419,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Vichada": {
      "administered": 80087,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Comoros": {
    "All": {
      "administered": 642320,
      "people_vaccinated": 301218,
      "people_partially_vaccinated": 341302,
      "country": "Comoros",
      "population": 813912,
      "sq_km_area": 1862,
      "life_expectancy": 60,
      "elevation_in_meters": null,
      "continent": "Africa",
      "abbreviation": "KM",
      "location": "Eastern Africa",
      "iso": 174,
      "capital_city": "Moroni",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Congo (Brazzaville)": {
    "All": {
      "administered": 830379,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Congo (Kinshasa)": {
    "All": {
      "administered": 1143186,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Costa Rica": {
    "All": {
      "administered": 10789180,
      "people_vaccinated": 4119873,
      "people_partially_vaccinated": 4423865,
      "country": "Costa Rica",
      "population": 4905769,
      "sq_km_area": 51100,
      "life_expectancy": "75.8",
      "elevation_in_meters": 746,
      "continent": "North America",
      "abbreviation": "CR",
      "location": "Central America",
      "iso": 188,
      "capital_city": "San Jos",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Cote d'Ivoire": {
    "All": {
      "administered": 12387947,
      "people_vaccinated": 5445391,
      "people_partially_vaccinated": 7952458,
      "country": "Cote d'Ivoire",
      "population": 24294750,
      "sq_km_area": 322463,
      "life_expectancy": "45.2",
      "elevation_in_meters": 250,
      "continent": "Africa",
      "abbreviation": "CI",
      "location": "Western Africa",
      "iso": 384,
      "capital_city": "Yamoussoukro",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Croatia": {
    "All": {
      "administered": 5246946,
      "people_vaccinated": 2242525,
      "people_partially_vaccinated": 2313691,
      "country": "Croatia",
      "population": 4189353,
      "sq_km_area": 56538,
      "life_expectancy": "73.7",
      "elevation_in_meters": 331,
      "continent": "Europe",
      "abbreviation": "HR",
      "location": "Southern Europe",
      "iso": 191,
      "capital_city": "Zagreb",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Cuba": {
    "All": {
      "administered": 36222262,
      "people_vaccinated": 9952716,
      "people_partially_vaccinated": 10660696,
      "country": "Cuba",
      "population": 11484636,
      "sq_km_area": 110861,
      "life_expectancy": "76.2",
      "elevation_in_meters": 108,
      "continent": "North America",
      "abbreviation": "CU",
      "location": "Caribbean",
      "iso": 192,
      "capital_city": "La Habana",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Cyprus": {
    "All": {
      "administered": 1781639,
      "people_vaccinated": 644027,
      "people_partially_vaccinated": 667058,
      "country": "Cyprus",
      "population": 1179551,
      "sq_km_area": 9251,
      "life_expectancy": "76.7",
      "elevation_in_meters": 91,
      "continent": "Asia",
      "abbreviation": "CY",
      "location": "Middle East",
      "iso": 196,
      "capital_city": "Nicosia",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Czechia": {
    "All": {
      "administered": 17568164,
      "people_vaccinated": 6870093,
      "people_partially_vaccinated": 6959145,
      "country": "Czechia",
      "population": 10618303,
      "sq_km_area": 78866,
      "life_expectancy": "74.5",
      "elevation_in_meters": 433,
      "continent": "Europe",
      "abbreviation": "CZ",
      "location": "Eastern Europe",
      "iso": 203,
      "capital_city": "Praha",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Jihocesky": {
      "administered": 1062058,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Jihomoravsky": {
      "administered": 1967075,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Karlovarsky": {
      "administered": 466240,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Kralovehradecky": {
      "administered": 906912,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Liberecky": {
      "administered": 696147,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Moravskoslezsky": {
      "administered": 1785034,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Olomoucky": {
      "administered": 916147,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Pardubicky": {
      "administered": 798224,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Plzensky": {
      "administered": 962458,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Prague": {
      "administered": 3229305,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Stredocesky": {
      "administered": 1876653,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Unknown": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Ustecky": {
      "administered": 1258429,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Vysocina": {
      "administered": 801317,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Zlinsky": {
      "administered": 867291,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Denmark": {
    "All": {
      "administered": 13216017,
      "people_vaccinated": 4797640,
      "people_partially_vaccinated": 4836096,
      "country": "Denmark",
      "population": 5733551,
      "sq_km_area": 43094,
      "life_expectancy": "76.5",
      "elevation_in_meters": 34,
      "continent": "Europe",
      "abbreviation": "DK",
      "location": "Nordic Countries",
      "iso": 208,
      "capital_city": "Copenhagen",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Faroe Islands": {
      "administered": 103894,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Greenland": {
      "administered": 79745,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Djibouti": {
    "All": {
      "administered": 181125,
      "people_vaccinated": 120510,
      "people_partially_vaccinated": 160562,
      "country": "Djibouti",
      "population": 956985,
      "sq_km_area": 23200,
      "life_expectancy": "50.8",
      "elevation_in_meters": 430,
      "continent": "Africa",
      "abbreviation": "DJ",
      "location": "Eastern Africa",
      "iso": 262,
      "capital_city": "Djibouti",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Dominica": {
    "All": {
      "administered": 66479,
      "people_vaccinated": 30222,
      "people_partially_vaccinated": 32611,
      "country": "Dominica",
      "population": 73925,
      "sq_km_area": 751,
      "life_expectancy": "73.4",
      "elevation_in_meters": null,
      "continent": "North America",
      "abbreviation": "DM",
      "location": "Caribbean",
      "iso": 212,
      "capital_city": "Roseau",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Dominican Republic": {
    "All": {
      "administered": 15611487,
      "people_vaccinated": 5966520,
      "people_partially_vaccinated": 7210084,
      "country": "Dominican Republic",
      "population": 10766998,
      "sq_km_area": 48511,
      "life_expectancy": "73.2",
      "elevation_in_meters": 424,
      "continent": "North America",
      "abbreviation": "DO",
      "location": "Caribbean",
      "iso": 214,
      "capital_city": "Santo Domingo de Guzm",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Ecuador": {
    "All": {
      "administered": 34598879,
      "people_vaccinated": 13929847,
      "people_partially_vaccinated": 15137769,
      "country": "Ecuador",
      "population": 16624858,
      "sq_km_area": 283561,
      "life_expectancy": "71.1",
      "elevation_in_meters": "1,117",
      "continent": "South America",
      "abbreviation": "EC",
      "location": "South America",
      "iso": 218,
      "capital_city": "Quito",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Egypt": {
    "All": {
      "administered": 82139865,
      "people_vaccinated": 34481890,
      "people_partially_vaccinated": 46426378,
      "country": "Egypt",
      "population": 97553151,
      "sq_km_area": 1001449,
      "life_expectancy": "63.3",
      "elevation_in_meters": 321,
      "continent": "Africa",
      "abbreviation": "EG",
      "location": "Northern Africa",
      "iso": 818,
      "capital_city": "Cairo",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "El Salvador": {
    "All": {
      "administered": 10680432,
      "people_vaccinated": 4298297,
      "people_partially_vaccinated": 4595639,
      "country": "El Salvador",
      "population": 6377853,
      "sq_km_area": 21041,
      "life_expectancy": "69.7",
      "elevation_in_meters": 442,
      "continent": "North America",
      "abbreviation": "SV",
      "location": "Central America",
      "iso": 222,
      "capital_city": "San Salvador",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Equatorial Guinea": {
    "All": {
      "administered": 480000,
      "people_vaccinated": 214486,
      "people_partially_vaccinated": 265505,
      "country": "Equatorial Guinea",
      "population": 1267689,
      "sq_km_area": 28051,
      "life_expectancy": "53.6",
      "elevation_in_meters": 577,
      "continent": "Africa",
      "abbreviation": "GQ",
      "location": "Central Africa",
      "iso": 226,
      "capital_city": "Malabo",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Estonia": {
    "All": {
      "administered": 1985164,
      "people_vaccinated": 845484,
      "people_partially_vaccinated": 861142,
      "country": "Estonia",
      "population": 1309632,
      "sq_km_area": 45227,
      "life_expectancy": "69.5",
      "elevation_in_meters": 61,
      "continent": "Europe",
      "abbreviation": "EE",
      "location": "Baltic Countries",
      "iso": 233,
      "capital_city": "Tallinn",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Harju": {
      "administered": 878339,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Hiiu": {
      "administered": 18059,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Ida-Viru": {
      "administered": 161733,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Jarva": {
      "administered": 46128,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Jogeva": {
      "administered": 45596,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Laane": {
      "administered": 32114,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Laane-Viru": {
      "administered": 88903,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Parnu": {
      "administered": 119425,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Polva": {
      "administered": 36384,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Rapla": {
      "administered": 49219,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Saare": {
      "administered": 51496,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Tartu": {
      "administered": 256519,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Unknown": {
      "administered": 44803,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Valga": {
      "administered": 38241,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Viljandi": {
      "administered": 70735,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Voru": {
      "administered": 47470,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Eswatini": {
    "All": {
      "administered": 535393,
      "people_vaccinated": 336066,
      "people_partially_vaccinated": 387468,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Ethiopia": {
    "All": {
      "administered": 29373478,
      "people_vaccinated": 21291403,
      "people_partially_vaccinated": 24769870,
      "country": "Ethiopia",
      "population": 104957438,
      "sq_km_area": 1104300,
      "life_expectancy": "45.2",
      "elevation_in_meters": "1,330",
      "continent": "Africa",
      "abbreviation": "ET",
      "location": "Eastern Africa",
      "iso": 231,
      "capital_city": "Addis Abeba",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Fiji": {
    "All": {
      "administered": 1447529,
      "people_vaccinated": 634655,
      "people_partially_vaccinated": 687835,
      "country": "Fiji",
      "population": 905502,
      "sq_km_area": 18274,
      "life_expectancy": "67.9",
      "elevation_in_meters": null,
      "continent": "Oceania",
      "abbreviation": "FJ",
      "location": "Melanesia",
      "iso": null,
      "capital_city": "Suva",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Finland": {
    "All": {
      "administered": 11788503,
      "people_vaccinated": 4322150,
      "people_partially_vaccinated": 4510727,
      "country": "Finland",
      "population": 5523231,
      "sq_km_area": 338145,
      "life_expectancy": "77.4",
      "elevation_in_meters": 164,
      "continent": "Europe",
      "abbreviation": "FI",
      "location": "Nordic Countries",
      "iso": 246,
      "capital_city": "Helsinki [Helsingfors]",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "France": {
    "All": {
      "administered": 155613469,
      "people_vaccinated": 52757272,
      "people_partially_vaccinated": 54356560,
      "country": "France",
      "population": 64979548,
      "sq_km_area": 551500,
      "life_expectancy": "78.8",
      "elevation_in_meters": 375,
      "continent": "Europe",
      "abbreviation": "FR",
      "location": "Western Europe",
      "iso": 250,
      "capital_city": "Paris",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Auvergne-Rhone Alps": {
      "administered": 16461004,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Brittany": {
      "administered": 7775152,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Burgundy-Free County": {
      "administered": 5894452,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Centre-Loire Valley": {
      "administered": 5657888,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Corsica": {
      "administered": 634335,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "French Guiana": {
      "administered": 227699,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "French Polynesia": {
      "administered": 451950,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Great East": {
      "administered": 11620121,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Guadeloupe": {
      "administered": 373576,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Island of France": {
      "administered": 24331198,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Loire Countries": {
      "administered": 8561908,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Martinique": {
      "administered": 379623,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "New Aquitaine": {
      "administered": 13492820,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "New Caledonia": {
      "administered": 460164,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Normandy": {
      "administered": 7445541,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Occitania": {
      "administered": 12406629,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Provence-Alps-Azure Coast": {
      "administered": 10105618,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Unknown": {
      "administered": 6170726,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Upper France": {
      "administered": 12691939,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Wallis and Futuna": {
      "administered": 16426,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Gabon": {
    "All": {
      "administered": 650502,
      "people_vaccinated": 255200,
      "people_partially_vaccinated": 300871,
      "country": "Gabon",
      "population": 2025137,
      "sq_km_area": 267668,
      "life_expectancy": "50.1",
      "elevation_in_meters": 377,
      "continent": "Africa",
      "abbreviation": "GA",
      "location": "Central Africa",
      "iso": 266,
      "capital_city": "Libreville",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Gambia": {
    "All": {
      "administered": 363353,
      "people_vaccinated": 318161,
      "people_partially_vaccinated": 331266,
      "country": "Gambia",
      "population": 2100568,
      "sq_km_area": 11295,
      "life_expectancy": "53.2",
      "elevation_in_meters": 34,
      "continent": "Africa",
      "abbreviation": "GM",
      "location": "Western Africa",
      "iso": 270,
      "capital_city": "Banjul",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Georgia": {
    "All": {
      "administered": 2886084,
      "people_vaccinated": 1264997,
      "people_partially_vaccinated": 1621087,
      "country": "Georgia",
      "population": 3912061,
      "sq_km_area": 69700,
      "life_expectancy": "64.5",
      "elevation_in_meters": "1,432",
      "continent": "Asia",
      "abbreviation": "GE",
      "location": "Middle East",
      "iso": 268,
      "capital_city": "Tbilisi",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Germany": {
    "All": {
      "administered": 179173659,
      "people_vaccinated": 64446143,
      "people_partially_vaccinated": 64513729,
      "country": "Germany",
      "population": 82114224,
      "sq_km_area": 357022,
      "life_expectancy": "77.4",
      "elevation_in_meters": 263,
      "continent": "Europe",
      "abbreviation": "DE",
      "location": "Western Europe",
      "iso": 276,
      "capital_city": "Berlin",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Baden-Wurttemberg": {
      "administered": 23080654,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Bayern": {
      "administered": 27271940,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Berlin": {
      "administered": 8083545,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Brandenburg": {
      "administered": 4820834,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Bremen": {
      "administered": 1691271,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Hamburg": {
      "administered": 4341474,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Hessen": {
      "administered": 13315805,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Mecklenburg-Vorpommern": {
      "administered": 3375313,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Niedersachsen": {
      "administered": 18025843,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Nordrhein-Westfalen": {
      "administered": 40783209,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Rheinland-Pfalz": {
      "administered": 8851340,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Saarland": {
      "administered": 2307697,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Sachsen": {
      "administered": 7267892,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Sachsen-Anhalt": {
      "administered": 4409886,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Schleswig-Holstein": {
      "administered": 6935794,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Thuringen": {
      "administered": 4077392,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Unknown": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Ghana": {
    "All": {
      "administered": 13047826,
      "people_vaccinated": 6030567,
      "people_partially_vaccinated": 9688415,
      "country": "Ghana",
      "population": 28833629,
      "sq_km_area": 238533,
      "life_expectancy": "57.4",
      "elevation_in_meters": 190,
      "continent": "Africa",
      "abbreviation": "GH",
      "location": "Western Africa",
      "iso": 288,
      "capital_city": "Accra",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Greece": {
    "All": {
      "administered": 20954161,
      "people_vaccinated": 7620456,
      "people_partially_vaccinated": 7912470,
      "country": "Greece",
      "population": 11159773,
      "sq_km_area": 131626,
      "life_expectancy": "78.4",
      "elevation_in_meters": 498,
      "continent": "Europe",
      "abbreviation": "GR",
      "location": "Southern Europe",
      "iso": 300,
      "capital_city": "Athenai",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Grenada": {
    "All": {
      "administered": 88016,
      "people_vaccinated": 38228,
      "people_partially_vaccinated": 43463,
      "country": "Grenada",
      "population": 107825,
      "sq_km_area": 344,
      "life_expectancy": "64.5",
      "elevation_in_meters": null,
      "continent": "North America",
      "abbreviation": "GD",
      "location": "Caribbean",
      "iso": 308,
      "capital_city": "Saint George's",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Guatemala": {
    "All": {
      "administered": 17118023,
      "people_vaccinated": 6146209,
      "people_partially_vaccinated": 8149141,
      "country": "Guatemala",
      "population": 16913503,
      "sq_km_area": 108889,
      "life_expectancy": "66.2",
      "elevation_in_meters": 759,
      "continent": "North America",
      "abbreviation": "GT",
      "location": "Central America",
      "iso": 320,
      "capital_city": "Ciudad de Guatemala",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Guinea": {
    "All": {
      "administered": 6111743,
      "people_vaccinated": 2510700,
      "people_partially_vaccinated": 4477033,
      "country": "Guinea",
      "population": 12717176,
      "sq_km_area": 245857,
      "life_expectancy": "45.6",
      "elevation_in_meters": 472,
      "continent": "Africa",
      "abbreviation": "GN",
      "location": "Western Africa",
      "iso": 324,
      "capital_city": "Conakry",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Guinea-Bissau": {
    "All": {
      "administered": 562620,
      "people_vaccinated": 341495,
      "people_partially_vaccinated": 519455,
      "country": "Guinea-Bissau",
      "population": 1861283,
      "sq_km_area": 36125,
      "life_expectancy": 49,
      "elevation_in_meters": 70,
      "continent": "Africa",
      "abbreviation": "GW",
      "location": "Western Africa",
      "iso": 624,
      "capital_city": "Bissau",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Guyana": {
    "All": {
      "administered": 903034,
      "people_vaccinated": 365149,
      "people_partially_vaccinated": 475116,
      "country": "Guyana",
      "population": 777859,
      "sq_km_area": 214969,
      "life_expectancy": 64,
      "elevation_in_meters": 207,
      "continent": "South America",
      "abbreviation": "GY",
      "location": "South America",
      "iso": 328,
      "capital_city": "Georgetown",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Haiti": {
    "All": {
      "administered": 275632,
      "people_vaccinated": 125895,
      "people_partially_vaccinated": 179925,
      "country": "Haiti",
      "population": 10981229,
      "sq_km_area": 27750,
      "life_expectancy": "49.2",
      "elevation_in_meters": 470,
      "continent": "North America",
      "abbreviation": "HT",
      "location": "Caribbean",
      "iso": 332,
      "capital_city": "Port-au-Prince",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Honduras": {
    "All": {
      "administered": 13657639,
      "people_vaccinated": 5340476,
      "people_partially_vaccinated": 5960689,
      "country": "Honduras",
      "population": 9265067,
      "sq_km_area": 112088,
      "life_expectancy": "69.9",
      "elevation_in_meters": 684,
      "continent": "North America",
      "abbreviation": "HN",
      "location": "Central America",
      "iso": 340,
      "capital_city": "Tegucigalpa",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Hungary": {
    "All": {
      "administered": 16522050,
      "people_vaccinated": 6194102,
      "people_partially_vaccinated": 6407918,
      "country": "Hungary",
      "population": 9721559,
      "sq_km_area": 93030,
      "life_expectancy": "71.4",
      "elevation_in_meters": 143,
      "continent": "Europe",
      "abbreviation": "HU",
      "location": "Eastern Europe",
      "iso": 348,
      "capital_city": "Budapest",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Iceland": {
    "All": {
      "administered": 808672,
      "people_vaccinated": 290193,
      "people_partially_vaccinated": 309770,
      "country": "Iceland",
      "population": 335025,
      "sq_km_area": 103000,
      "life_expectancy": "79.4",
      "elevation_in_meters": 557,
      "continent": "Europe",
      "abbreviation": "IS",
      "location": "Nordic Countries",
      "iso": 352,
      "capital_city": "Reykjav",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "India": {
    "All": {
      "administered": 1908189322,
      "people_vaccinated": 869609528,
      "people_partially_vaccinated": 1006306450,
      "country": "India",
      "population": 1339180127,
      "sq_km_area": 3287263,
      "life_expectancy": "62.5",
      "elevation_in_meters": 160,
      "continent": "Asia",
      "abbreviation": "IN",
      "location": "Southern and Central Asia",
      "iso": 356,
      "capital_city": "New Delhi",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Andaman and Nicobar Islands": {
      "administered": 701146,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Andhra Pradesh": {
      "administered": 94321648,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Arunachal Pradesh": {
      "administered": 1696029,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Assam": {
      "administered": 45032701,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Bihar": {
      "administered": 129966907,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Chandigarh": {
      "administered": 2157964,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Chhattisgarh": {
      "administered": 39238991,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Dadra and Nagar Haveli and Daman and Diu": {
      "administered": 1407092,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Delhi": {
      "administered": 33828952,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Goa": {
      "administered": 2744392,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Gujarat": {
      "administered": 108290974,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Haryana": {
      "administered": 42966720,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Himachal Pradesh": {
      "administered": 13005073,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Jammu and Kashmir": {
      "administered": 22838719,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Jharkhand": {
      "administered": 39822277,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Karnataka": {
      "administered": 107076887,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Kerala": {
      "administered": 54401322,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Ladakh": {
      "administered": 472392,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Lakshadweep": {
      "administered": 122928,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Madhya Pradesh": {
      "administered": 118172319,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Maharashtra": {
      "administered": 165790256,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Manipur": {
      "administered": 2864474,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Meghalaya": {
      "administered": 2471752,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Mizoram": {
      "administered": 1599983,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Nagaland": {
      "administered": 1637747,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Odisha": {
      "administered": 66383631,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Puducherry": {
      "administered": 1695182,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Punjab": {
      "administered": 42870550,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Rajasthan": {
      "administered": 105501625,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Sikkim": {
      "administered": 1160727,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Tamil Nadu": {
      "administered": 108725406,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Telangana": {
      "administered": 63013232,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Tripura": {
      "administered": 5326079,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Unknown": {
      "administered": 5187566,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Uttar Pradesh": {
      "administered": 318859061,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Uttarakhand": {
      "administered": 17703991,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "West Bengal": {
      "administered": 139132627,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Indonesia": {
    "All": {
      "administered": 401308016,
      "people_vaccinated": 165656103,
      "people_partially_vaccinated": 199346528,
      "country": "Indonesia",
      "population": 263991379,
      "sq_km_area": 1904569,
      "life_expectancy": "70.1",
      "elevation_in_meters": 367,
      "continent": "Asia",
      "abbreviation": "ID",
      "location": "Southeast Asia",
      "iso": 360,
      "capital_city": "Jakarta",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Aceh": {
      "administered": 7533287,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Bali": {
      "administered": 9412762,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Bangka Belitung Islands": {
      "administered": 2196321,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Banten": {
      "administered": 17439847,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Bengkulu": {
      "administered": 2748821,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Central Java": {
      "administered": 55533913,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Central Kalimantan": {
      "administered": 3992759,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Central Sulawesi": {
      "administered": 3207095,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "East Java": {
      "administered": 59157994,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "East Kalimantan": {
      "administered": 6024163,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "East Nusa Tenggara": {
      "administered": 6457365,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Gorontalo": {
      "administered": 1580227,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Jambi": {
      "administered": 4957173,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Lampung": {
      "administered": 11469560,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Maluku": {
      "administered": 1762072,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "North Kalimantan": {
      "administered": 1046472,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "North Maluku": {
      "administered": 1367943,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "North Sulawesi": {
      "administered": 3483892,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "North Sumatra": {
      "administered": 22052295,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Papua": {
      "administered": 1693352,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Riau": {
      "administered": 9224909,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Riau Islands": {
      "administered": 3816802,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "South Kalimantan": {
      "administered": 5654705,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "South Sulawesi": {
      "administered": 11216492,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "South Sumatra": {
      "administered": 11397348,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Southeast Sulawesi": {
      "administered": 3134675,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Special Capital Region of Jakarta": {
      "administered": 26828537,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Special Region of Yogyakarta": {
      "administered": 7064917,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Unknown": {
      "administered": 103,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "West Java": {
      "administered": 75355509,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "West Kalimantan": {
      "administered": 6444109,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "West Nusa Tenggara": {
      "administered": 7660060,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "West Papua": {
      "administered": 931099,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "West Sulawesi": {
      "administered": 1487803,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "West Sumatra": {
      "administered": 7683030,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Iran": {
    "All": {
      "administered": 149263275,
      "people_vaccinated": 57648380,
      "people_partially_vaccinated": 64398577,
      "country": "Iran",
      "population": 81162788,
      "sq_km_area": 1648195,
      "life_expectancy": "69.7",
      "elevation_in_meters": "1,305",
      "continent": "Asia",
      "abbreviation": "IR",
      "location": "Southern and Central Asia",
      "iso": 364,
      "capital_city": "Tehran",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Iraq": {
    "All": {
      "administered": 18118688,
      "people_vaccinated": 7403714,
      "people_partially_vaccinated": 10545713,
      "country": "Iraq",
      "population": 38274618,
      "sq_km_area": 438317,
      "life_expectancy": "66.5",
      "elevation_in_meters": 312,
      "continent": "Asia",
      "abbreviation": "IQ",
      "location": "Middle East",
      "iso": 368,
      "capital_city": "Baghdad",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Ireland": {
    "All": {
      "administered": 10877615,
      "people_vaccinated": 4028001,
      "people_partially_vaccinated": 4081454,
      "country": "Ireland",
      "population": 4761657,
      "sq_km_area": 70273,
      "life_expectancy": "76.8",
      "elevation_in_meters": 118,
      "continent": "Europe",
      "abbreviation": "IE",
      "location": "British Isles",
      "iso": 372,
      "capital_city": "Dublin",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Israel": {
    "All": {
      "administered": 18140489,
      "people_vaccinated": 6137462,
      "people_partially_vaccinated": 6707901,
      "country": "Israel",
      "population": 8321570,
      "sq_km_area": 21056,
      "life_expectancy": "78.6",
      "elevation_in_meters": 508,
      "continent": "Asia",
      "abbreviation": "IL",
      "location": "Middle East",
      "iso": 376,
      "capital_city": "Jerusalem",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Italy": {
    "All": {
      "administered": 137156176,
      "people_vaccinated": 47916243,
      "people_partially_vaccinated": 50770168,
      "country": "Italy",
      "population": 59359900,
      "sq_km_area": 301316,
      "life_expectancy": 79,
      "elevation_in_meters": 538,
      "continent": "Europe",
      "abbreviation": "IT",
      "location": "Southern Europe",
      "iso": 380,
      "capital_city": "Roma",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Abruzzo": {
      "administered": 2970160,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Basilicata": {
      "administered": 1269904,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Calabria": {
      "administered": 4108354,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Campania": {
      "administered": 12551952,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Emilia-Romagna": {
      "administered": 10428483,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Friuli Venezia Giulia": {
      "administered": 2889146,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Lazio": {
      "administered": 13486380,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Liguria": {
      "administered": 3508664,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Lombardia": {
      "administered": 23943165,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Marche": {
      "administered": 3368265,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Molise": {
      "administered": 705963,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "P.A. Bolzano": {
      "administered": 1112874,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "P.A. Trento": {
      "administered": 1244146,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Piemonte": {
      "administered": 10031718,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Puglia": {
      "administered": 9380125,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Sardegna": {
      "administered": 3773719,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Sicilia": {
      "administered": 10412645,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Toscana": {
      "administered": 8789812,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Umbria": {
      "administered": 2034703,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Valle d'Aosta": {
      "administered": 278003,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Veneto": {
      "administered": 11045779,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Jamaica": {
    "All": {
      "administered": 1422615,
      "people_vaccinated": 689869,
      "people_partially_vaccinated": 793128,
      "country": "Jamaica",
      "population": 2890299,
      "sq_km_area": 10990,
      "life_expectancy": "75.2",
      "elevation_in_meters": 18,
      "continent": "North America",
      "abbreviation": "JM",
      "location": "Caribbean",
      "iso": 388,
      "capital_city": "Kingston",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Japan": {
    "All": {
      "administered": 274589263,
      "people_vaccinated": 101689560,
      "people_partially_vaccinated": 103319841,
      "country": "Japan",
      "population": 127484450,
      "sq_km_area": 377829,
      "life_expectancy": "80.7",
      "elevation_in_meters": 438,
      "continent": "Asia",
      "abbreviation": "JP",
      "location": "Eastern Asia",
      "iso": 392,
      "capital_city": "Tokyo",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Jordan": {
    "All": {
      "administered": 9901017,
      "people_vaccinated": 4486523,
      "people_partially_vaccinated": 4764976,
      "country": "Jordan",
      "population": 9702353,
      "sq_km_area": 88946,
      "life_expectancy": "77.4",
      "elevation_in_meters": 812,
      "continent": "Asia",
      "abbreviation": "JO",
      "location": "Middle East",
      "iso": 400,
      "capital_city": "Amman",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Kazakhstan": {
    "All": {
      "administered": 18745826,
      "people_vaccinated": 9255807,
      "people_partially_vaccinated": 9490019,
      "country": "Kazakhstan",
      "population": 18204499,
      "sq_km_area": 2724900,
      "life_expectancy": "63.2",
      "elevation_in_meters": null,
      "continent": "Asia",
      "abbreviation": "KZ",
      "location": "Southern and Central Asia",
      "iso": null,
      "capital_city": "Astana",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Aktobe": {
      "administered": 787757,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Almaty": {
      "administered": 2006811,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Almaty City": {
      "administered": 2183076,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Aqmola": {
      "administered": 702203,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Atyrau": {
      "administered": 531376,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "East Kazakhstan": {
      "administered": 1836746,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Jambyl": {
      "administered": 1263560,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Mangystau": {
      "administered": 428681,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "North Kazakhstan": {
      "administered": 617091,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Nur-Sultan": {
      "administered": 971869,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Pavlodar": {
      "administered": 722854,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Qaraghandy": {
      "administered": 1301875,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Qostanay": {
      "administered": 709165,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Qyzylorda": {
      "administered": 851975,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Shymkent": {
      "administered": 1193493,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Turkistan": {
      "administered": 2092948,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "West Kazakhstan": {
      "administered": 544346,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Kenya": {
    "All": {
      "administered": 17956919,
      "people_vaccinated": 8315517,
      "people_partially_vaccinated": 11711277,
      "country": "Kenya",
      "population": 49699862,
      "sq_km_area": 580367,
      "life_expectancy": 48,
      "elevation_in_meters": 762,
      "continent": "Africa",
      "abbreviation": "KE",
      "location": "Eastern Africa",
      "iso": 404,
      "capital_city": "Nairobi",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Kiribati": {
    "All": {
      "administered": 144216,
      "people_vaccinated": 58191,
      "people_partially_vaccinated": 79764,
      "country": "Kiribati",
      "population": 116398,
      "sq_km_area": 726,
      "life_expectancy": "59.8",
      "elevation_in_meters": null,
      "continent": "Oceania",
      "abbreviation": "KI",
      "location": "Micronesia",
      "iso": 296,
      "capital_city": "Bairiki",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Korea, South": {
    "All": {
      "administered": 124367750,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "country": "Korea, South",
      "population": 50982212,
      "sq_km_area": 99434,
      "life_expectancy": "74.4",
      "elevation_in_meters": 282,
      "continent": "Asia",
      "abbreviation": "KR",
      "location": "Eastern Asia",
      "iso": 410,
      "capital_city": "Seoul",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Kosovo": {
    "All": {
      "administered": 1827353,
      "people_vaccinated": 822431,
      "people_partially_vaccinated": 902786,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Kuwait": {
    "All": {
      "administered": 7980459,
      "people_vaccinated": 3298011,
      "people_partially_vaccinated": 3421205,
      "country": "Kuwait",
      "population": 4136528,
      "sq_km_area": 17818,
      "life_expectancy": "76.1",
      "elevation_in_meters": 108,
      "continent": "Asia",
      "abbreviation": "KW",
      "location": "Middle East",
      "iso": 414,
      "capital_city": "Kuwait",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Kyrgyzstan": {
    "All": {
      "administered": 3039644,
      "people_vaccinated": 1282349,
      "people_partially_vaccinated": 1536051,
      "country": "Kyrgyzstan",
      "population": 6045117,
      "sq_km_area": 199900,
      "life_expectancy": "63.4",
      "elevation_in_meters": "2,988",
      "continent": "Asia",
      "abbreviation": "KG",
      "location": "Southern and Central Asia",
      "iso": 417,
      "capital_city": "Bishkek",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Laos": {
    "All": {
      "administered": 10746013,
      "people_vaccinated": 4957803,
      "people_partially_vaccinated": 5788210,
      "country": "Laos",
      "population": 6858160,
      "sq_km_area": 236800,
      "life_expectancy": "53.1",
      "elevation_in_meters": 710,
      "continent": "Asia",
      "abbreviation": "LA",
      "location": "Southeast Asia",
      "iso": 418,
      "capital_city": "Vientiane",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Latvia": {
    "All": {
      "administered": 2886613,
      "people_vaccinated": 1304303,
      "people_partially_vaccinated": 1345028,
      "country": "Latvia",
      "population": 1949670,
      "sq_km_area": 64589,
      "life_expectancy": "68.4",
      "elevation_in_meters": 87,
      "continent": "Europe",
      "abbreviation": "LV",
      "location": "Baltic Countries",
      "iso": 428,
      "capital_city": "Riga",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Lesotho": {
    "All": {
      "administered": 933825,
      "people_vaccinated": 735610,
      "people_partially_vaccinated": 933825,
      "country": "Lesotho",
      "population": 2233339,
      "sq_km_area": 30355,
      "life_expectancy": "50.8",
      "elevation_in_meters": "2,161",
      "continent": "Africa",
      "abbreviation": "LS",
      "location": "Southern Africa",
      "iso": 426,
      "capital_city": "Maseru",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Liberia": {
    "All": {
      "administered": 2201300,
      "people_vaccinated": 1438154,
      "people_partially_vaccinated": 1751520,
      "country": "Liberia",
      "population": 4731906,
      "sq_km_area": 111369,
      "life_expectancy": 51,
      "elevation_in_meters": 243,
      "continent": "Africa",
      "abbreviation": "LR",
      "location": "Western Africa",
      "iso": 430,
      "capital_city": "Monrovia",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Libya": {
    "All": {
      "administered": 3454320,
      "people_vaccinated": 1140236,
      "people_partially_vaccinated": 2214303,
      "country": "Libya",
      "population": 5605000,
      "sq_km_area": 1759540,
      "life_expectancy": "75.5",
      "elevation_in_meters": null,
      "continent": "Africa",
      "abbreviation": "LY",
      "location": "Northern Africa",
      "iso": null,
      "capital_city": "Tripoli",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Liechtenstein": {
    "All": {
      "administered": 71104,
      "people_vaccinated": 26404,
      "people_partially_vaccinated": 26729,
      "country": "Liechtenstein",
      "population": 37922,
      "sq_km_area": 160,
      "life_expectancy": "78.8",
      "elevation_in_meters": null,
      "continent": "Europe",
      "abbreviation": "LI",
      "location": "Western Europe",
      "iso": 438,
      "capital_city": "Vaduz",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Lithuania": {
    "All": {
      "administered": 4481087,
      "people_vaccinated": 1875025,
      "people_partially_vaccinated": 1951023,
      "country": "Lithuania",
      "population": 2890297,
      "sq_km_area": 65301,
      "life_expectancy": "69.1",
      "elevation_in_meters": 110,
      "continent": "Europe",
      "abbreviation": "LT",
      "location": "Baltic Countries",
      "iso": 440,
      "capital_city": "Vilnius",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Alytus": {
      "administered": 211840,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Kaunas": {
      "administered": 980284,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Klaipeda": {
      "administered": 431963,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Marijampole": {
      "administered": 192731,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Panevezys": {
      "administered": 335201,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Siauliai": {
      "administered": 389831,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Taurage": {
      "administered": 122435,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Telsiai": {
      "administered": 164235,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Unknown": {
      "administered": 60853,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Utena": {
      "administered": 198948,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Vilnius": {
      "administered": 1453299,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Luxembourg": {
    "All": {
      "administered": 1290011,
      "people_vaccinated": 461665,
      "people_partially_vaccinated": 480752,
      "country": "Luxembourg",
      "population": 583455,
      "sq_km_area": 2586,
      "life_expectancy": "77.1",
      "elevation_in_meters": 325,
      "continent": "Europe",
      "abbreviation": "LU",
      "location": "Western Europe",
      "iso": 442,
      "capital_city": "Luxembourg [Luxemburg/L",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Madagascar": {
    "All": {
      "administered": 2369775,
      "people_vaccinated": 1156975,
      "people_partially_vaccinated": 1290584,
      "country": "Madagascar",
      "population": 25570895,
      "sq_km_area": 587041,
      "life_expectancy": 55,
      "elevation_in_meters": 615,
      "continent": "Africa",
      "abbreviation": "MG",
      "location": "Eastern Africa",
      "iso": 450,
      "capital_city": "Antananarivo",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Malawi": {
    "All": {
      "administered": 1993981,
      "people_vaccinated": 908688,
      "people_partially_vaccinated": 1596607,
      "country": "Malawi",
      "population": 18622104,
      "sq_km_area": 118484,
      "life_expectancy": "37.6",
      "elevation_in_meters": 779,
      "continent": "Africa",
      "abbreviation": "MW",
      "location": "Eastern Africa",
      "iso": 454,
      "capital_city": "Lilongwe",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Malaysia": {
    "All": {
      "administered": 70478577,
      "people_vaccinated": 26830790,
      "people_partially_vaccinated": 27811381,
      "country": "Malaysia",
      "population": 31624264,
      "sq_km_area": 329758,
      "life_expectancy": "70.8",
      "elevation_in_meters": 538,
      "continent": "Asia",
      "abbreviation": "MY",
      "location": "Southeast Asia",
      "iso": 458,
      "capital_city": "Kuala Lumpur",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Johor": {
      "administered": 8649312,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Kedah": {
      "administered": 4034684,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Kelantan": {
      "administered": 2769704,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Melaka": {
      "administered": 2083551,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Negeri Sembilan": {
      "administered": 2672043,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Pahang": {
      "administered": 3103391,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Perak": {
      "administered": 5089604,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Perlis": {
      "administered": 504363,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Pulau Pinang": {
      "administered": 4290270,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Sabah": {
      "administered": 5845590,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Sarawak": {
      "administered": 6321844,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Selangor": {
      "administered": 14238995,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Terengganu": {
      "administered": 2175138,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Unknown": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "W.P. Kuala Lumpur": {
      "administered": 8076810,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "W.P. Labuan": {
      "administered": 221661,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "W.P. Putrajaya": {
      "administered": 401617,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Maldives": {
    "All": {
      "administered": 941585,
      "people_vaccinated": 383925,
      "people_partially_vaccinated": 398579,
      "country": "Maldives",
      "population": 436330,
      "sq_km_area": 298,
      "life_expectancy": "62.2",
      "elevation_in_meters": "1.8",
      "continent": "Asia",
      "abbreviation": "MV",
      "location": "Southern and Central Asia",
      "iso": 462,
      "capital_city": "Male",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Mali": {
    "All": {
      "administered": 1993965,
      "people_vaccinated": 1075123,
      "people_partially_vaccinated": 1439740,
      "country": "Mali",
      "population": 18541980,
      "sq_km_area": 1240192,
      "life_expectancy": "46.7",
      "elevation_in_meters": 343,
      "continent": "Africa",
      "abbreviation": "ML",
      "location": "Western Africa",
      "iso": 466,
      "capital_city": "Bamako",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Malta": {
    "All": {
      "administered": 1281433,
      "people_vaccinated": 468638,
      "people_partially_vaccinated": 475759,
      "country": "Malta",
      "population": 430835,
      "sq_km_area": 316,
      "life_expectancy": "77.9",
      "elevation_in_meters": null,
      "continent": "Europe",
      "abbreviation": "MT",
      "location": "Southern Europe",
      "iso": 470,
      "capital_city": "Valletta",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Marshall Islands": {
    "All": {
      "administered": 67997,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "country": "Marshall Islands",
      "population": 53127,
      "sq_km_area": 181,
      "life_expectancy": "65.5",
      "elevation_in_meters": null,
      "continent": "Oceania",
      "abbreviation": "MH",
      "location": "Micronesia",
      "iso": 584,
      "capital_city": "Dalap-Uliga-Darrit",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Mauritania": {
    "All": {
      "administered": 2650000,
      "people_vaccinated": 1068169,
      "people_partially_vaccinated": 1567060,
      "country": "Mauritania",
      "population": 4420184,
      "sq_km_area": 1025520,
      "life_expectancy": "50.8",
      "elevation_in_meters": 276,
      "continent": "Africa",
      "abbreviation": "MR",
      "location": "Western Africa",
      "iso": 478,
      "capital_city": "Nouakchott",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Mauritius": {
    "All": {
      "administered": 2698115,
      "people_vaccinated": 963452,
      "people_partially_vaccinated": 1000474,
      "country": "Mauritius",
      "population": 1265138,
      "sq_km_area": 2040,
      "life_expectancy": 71,
      "elevation_in_meters": null,
      "continent": "Africa",
      "abbreviation": "MU",
      "location": "Eastern Africa",
      "iso": 480,
      "capital_city": "Port-Louis",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Mexico": {
    "All": {
      "administered": 201861103,
      "people_vaccinated": 79945002,
      "people_partially_vaccinated": 85904997,
      "country": "Mexico",
      "population": 129163276,
      "sq_km_area": 1958201,
      "life_expectancy": "71.5",
      "elevation_in_meters": "1,111",
      "continent": "North America",
      "abbreviation": "MX",
      "location": "Central America",
      "iso": 484,
      "capital_city": "Ciudad de M",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Micronesia": {
    "All": {
      "administered": 129369,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Moldova": {
    "All": {
      "administered": 2174088,
      "people_vaccinated": 1060470,
      "people_partially_vaccinated": 1083286,
      "country": "Moldova",
      "population": 4051212,
      "sq_km_area": 33851,
      "life_expectancy": "64.5",
      "elevation_in_meters": 139,
      "continent": "Europe",
      "abbreviation": "MD",
      "location": "Eastern Europe",
      "iso": 498,
      "capital_city": "Chisinau",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Monaco": {
    "All": {
      "administered": 65140,
      "people_vaccinated": 25667,
      "people_partially_vaccinated": 28875,
      "country": "Monaco",
      "population": 38695,
      "sq_km_area": 1.5,
      "life_expectancy": "78.8",
      "elevation_in_meters": null,
      "continent": "Europe",
      "abbreviation": "MC",
      "location": "Western Europe",
      "iso": 492,
      "capital_city": "Monaco-Ville",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Mongolia": {
    "All": {
      "administered": 5612884,
      "people_vaccinated": 2175617,
      "people_partially_vaccinated": 2272965,
      "country": "Mongolia",
      "population": 3075647,
      "sq_km_area": 1566500,
      "life_expectancy": "67.3",
      "elevation_in_meters": "1,528",
      "continent": "Asia",
      "abbreviation": "MN",
      "location": "Eastern Asia",
      "iso": 496,
      "capital_city": "Ulan Bator",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Montenegro": {
    "All": {
      "administered": 672644,
      "people_vaccinated": 282892,
      "people_partially_vaccinated": 290808,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Morocco": {
    "All": {
      "administered": 54473305,
      "people_vaccinated": 23386446,
      "people_partially_vaccinated": 24907350,
      "country": "Morocco",
      "population": 35739580,
      "sq_km_area": 446550,
      "life_expectancy": "69.1",
      "elevation_in_meters": 909,
      "continent": "Africa",
      "abbreviation": "MA",
      "location": "Northern Africa",
      "iso": 504,
      "capital_city": "Rabat",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Mozambique": {
    "All": {
      "administered": 31616078,
      "people_vaccinated": 13891137,
      "people_partially_vaccinated": 14816217,
      "country": "Mozambique",
      "population": 29668834,
      "sq_km_area": 801590,
      "life_expectancy": "37.5",
      "elevation_in_meters": 345,
      "continent": "Africa",
      "abbreviation": "MZ",
      "location": "Eastern Africa",
      "iso": 508,
      "capital_city": "Maputo",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Namibia": {
    "All": {
      "administered": 834756,
      "people_vaccinated": 408202,
      "people_partially_vaccinated": 479078,
      "country": "Namibia",
      "population": 2533794,
      "sq_km_area": 824292,
      "life_expectancy": "42.5",
      "elevation_in_meters": "1,141",
      "continent": "Africa",
      "abbreviation": "NA",
      "location": "Southern Africa",
      "iso": 516,
      "capital_city": "Windhoek",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Netherlands": {
    "All": {
      "administered": 36126361,
      "people_vaccinated": 12404222,
      "people_partially_vaccinated": 13464173,
      "country": "Netherlands",
      "population": 17035938,
      "sq_km_area": 41526,
      "life_expectancy": "78.3",
      "elevation_in_meters": 30,
      "continent": "Europe",
      "abbreviation": "NL",
      "location": "Western Europe",
      "iso": 528,
      "capital_city": "Amsterdam",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Aruba": {
      "administered": 170575,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Bonaire, Sint Eustatius and Saba": {
      "administered": 55886,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Curacao": {
      "administered": 251635,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Sint Maarten": {
      "administered": 62043,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "New Zealand": {
    "All": {
      "administered": 11059064,
      "people_vaccinated": 4097843,
      "people_partially_vaccinated": 4288882,
      "country": "New Zealand",
      "population": 4705818,
      "sq_km_area": 270534,
      "life_expectancy": "77.8",
      "elevation_in_meters": 388,
      "continent": "Oceania",
      "abbreviation": "NZ",
      "location": "Australia and New Zealand",
      "iso": 554,
      "capital_city": "Wellington",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Cook Islands": {
      "administered": 39667,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Nicaragua": {
    "All": {
      "administered": 10404774,
      "people_vaccinated": 4690076,
      "people_partially_vaccinated": 5714698,
      "country": "Nicaragua",
      "population": 6217581,
      "sq_km_area": 130000,
      "life_expectancy": "68.7",
      "elevation_in_meters": 298,
      "continent": "North America",
      "abbreviation": "NI",
      "location": "Central America",
      "iso": 558,
      "capital_city": "Managua",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Niger": {
    "All": {
      "administered": 3726602,
      "people_vaccinated": 1549279,
      "people_partially_vaccinated": 2190790,
      "country": "Niger",
      "population": 21477348,
      "sq_km_area": 1267000,
      "life_expectancy": "41.3",
      "elevation_in_meters": 474,
      "continent": "Africa",
      "abbreviation": "NE",
      "location": "Western Africa",
      "iso": 562,
      "capital_city": "Niamey",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Nigeria": {
    "All": {
      "administered": 41091354,
      "people_vaccinated": 15931011,
      "people_partially_vaccinated": 27401621,
      "country": "Nigeria",
      "population": 190886311,
      "sq_km_area": 923768,
      "life_expectancy": "51.6",
      "elevation_in_meters": 380,
      "continent": "Africa",
      "abbreviation": "NG",
      "location": "Western Africa",
      "iso": 566,
      "capital_city": "Abuja",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "North Macedonia": {
    "All": {
      "administered": 1847640,
      "people_vaccinated": 836507,
      "people_partially_vaccinated": 853321,
      "country": "North Macedonia",
      "population": 2024000,
      "sq_km_area": 25713,
      "life_expectancy": "73.8",
      "elevation_in_meters": 741,
      "continent": "Europe",
      "abbreviation": "MK",
      "location": "Southern Europe",
      "iso": 807,
      "capital_city": "Skopje",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Norway": {
    "All": {
      "administered": 11304977,
      "people_vaccinated": 4034258,
      "people_partially_vaccinated": 4335859,
      "country": "Norway",
      "population": 5305383,
      "sq_km_area": 323877,
      "life_expectancy": "78.7",
      "elevation_in_meters": 460,
      "continent": "Europe",
      "abbreviation": "NO",
      "location": "Nordic Countries",
      "iso": 578,
      "capital_city": "Oslo",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Oman": {
    "All": {
      "administered": 7030077,
      "people_vaccinated": 3027855,
      "people_partially_vaccinated": 3259190,
      "country": "Oman",
      "population": 4636262,
      "sq_km_area": 309500,
      "life_expectancy": "71.8",
      "elevation_in_meters": 310,
      "continent": "Asia",
      "abbreviation": "OM",
      "location": "Middle East",
      "iso": 512,
      "capital_city": "Masqat",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Pakistan": {
    "All": {
      "administered": 252931485,
      "people_vaccinated": 122215848,
      "people_partially_vaccinated": 134504257,
      "country": "Pakistan",
      "population": 197015955,
      "sq_km_area": 796095,
      "life_expectancy": "61.1",
      "elevation_in_meters": 900,
      "continent": "Asia",
      "abbreviation": "PK",
      "location": "Southern and Central Asia",
      "iso": 586,
      "capital_city": "Islamabad",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Palau": {
    "All": {
      "administered": 44526,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "country": "Palau",
      "population": 21729,
      "sq_km_area": 459,
      "life_expectancy": "68.6",
      "elevation_in_meters": null,
      "continent": "Oceania",
      "abbreviation": "PW",
      "location": "Micronesia",
      "iso": 585,
      "capital_city": "Koror",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Panama": {
    "All": {
      "administered": 8079415,
      "people_vaccinated": 3079475,
      "people_partially_vaccinated": 3466298,
      "country": "Panama",
      "population": 4098587,
      "sq_km_area": 75517,
      "life_expectancy": "75.5",
      "elevation_in_meters": 360,
      "continent": "North America",
      "abbreviation": "PA",
      "location": "Central America",
      "iso": 591,
      "capital_city": "Ciudad de Panam",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Papua New Guinea": {
    "All": {
      "administered": 586000,
      "people_vaccinated": 263313,
      "people_partially_vaccinated": 322687,
      "country": "Papua New Guinea",
      "population": 8251162,
      "sq_km_area": 462840,
      "life_expectancy": "63.1",
      "elevation_in_meters": 667,
      "continent": "Oceania",
      "abbreviation": "PG",
      "location": "Melanesia",
      "iso": 598,
      "capital_city": "Port Moresby",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Paraguay": {
    "All": {
      "administered": 8647379,
      "people_vaccinated": 3446930,
      "people_partially_vaccinated": 3881480,
      "country": "Paraguay",
      "population": 6811297,
      "sq_km_area": 406752,
      "life_expectancy": "73.7",
      "elevation_in_meters": 178,
      "continent": "South America",
      "abbreviation": "PY",
      "location": "South America",
      "iso": 600,
      "capital_city": "Asunci",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Peru": {
    "All": {
      "administered": 70962769,
      "people_vaccinated": 27045315,
      "people_partially_vaccinated": 29213941,
      "country": "Peru",
      "population": 32165485,
      "sq_km_area": 1285216,
      "life_expectancy": 70,
      "elevation_in_meters": "1,555",
      "continent": "South America",
      "abbreviation": "PE",
      "location": "South America",
      "iso": 604,
      "capital_city": "Lima",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Philippines": {
    "All": {
      "administered": 146869397,
      "people_vaccinated": 67911464,
      "people_partially_vaccinated": 70173137,
      "country": "Philippines",
      "population": 104918090,
      "sq_km_area": 300000,
      "life_expectancy": "67.5",
      "elevation_in_meters": 442,
      "continent": "Asia",
      "abbreviation": "PH",
      "location": "Southeast Asia",
      "iso": 608,
      "capital_city": "Manila",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Poland": {
    "All": {
      "administered": 54345090,
      "people_vaccinated": 22461537,
      "people_partially_vaccinated": 22681933,
      "country": "Poland",
      "population": 38170712,
      "sq_km_area": 323250,
      "life_expectancy": "73.2",
      "elevation_in_meters": 173,
      "continent": "Europe",
      "abbreviation": "PL",
      "location": "Eastern Europe",
      "iso": 616,
      "capital_city": "Warszawa",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Dolnoslaskie": {
      "administered": 4352833,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Kujawsko-Pomorskie": {
      "administered": 2940272,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Lodzkie": {
      "administered": 3540517,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Lubelskie": {
      "administered": 2495303,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Lubuskie": {
      "administered": 1513923,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Malopolskie": {
      "administered": 4544900,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Mazowieckie": {
      "administered": 8635083,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Opolskie": {
      "administered": 1266926,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Podkarpackie": {
      "administered": 2220990,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Podlaskie": {
      "administered": 1518270,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Pomorskie": {
      "administered": 3610783,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Slaskie": {
      "administered": 6418906,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Swietokrzyskie": {
      "administered": 1538905,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Unknown": {
      "administered": 15,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Warminsko-mazurskie": {
      "administered": 1888911,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Wielkopolskie": {
      "administered": 5329355,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Zachodniopomorskie": {
      "administered": 2529205,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Portugal": {
    "All": {
      "administered": 23821358,
      "people_vaccinated": 9415073,
      "people_partially_vaccinated": 9696928,
      "country": "Portugal",
      "population": 10329506,
      "sq_km_area": 91982,
      "life_expectancy": "75.8",
      "elevation_in_meters": 372,
      "continent": "Europe",
      "abbreviation": "PT",
      "location": "Southern Europe",
      "iso": 620,
      "capital_city": "Lisboa",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Qatar": {
    "All": {
      "administered": 6785998,
      "people_vaccinated": 2611100,
      "people_partially_vaccinated": 2611100,
      "country": "Qatar",
      "population": 2639211,
      "sq_km_area": 11000,
      "life_expectancy": "72.4",
      "elevation_in_meters": 28,
      "continent": "Asia",
      "abbreviation": "QA",
      "location": "Middle East",
      "iso": 634,
      "capital_city": "Doha",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Romania": {
    "All": {
      "administered": 16787622,
      "people_vaccinated": 8100942,
      "people_partially_vaccinated": 8169248,
      "country": "Romania",
      "population": 19679306,
      "sq_km_area": 238391,
      "life_expectancy": "69.9",
      "elevation_in_meters": 414,
      "continent": "Europe",
      "abbreviation": "RO",
      "location": "Eastern Europe",
      "iso": 642,
      "capital_city": "Bucuresti",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Russia": {
    "All": {
      "administered": 166534236,
      "people_vaccinated": 73643909,
      "people_partially_vaccinated": 80924592,
      "country": "Russia",
      "population": 143989754,
      "sq_km_area": 17075400,
      "life_expectancy": "67.2",
      "elevation_in_meters": null,
      "continent": "Europe",
      "abbreviation": "RU",
      "location": "Eastern Europe",
      "iso": null,
      "capital_city": "Moscow",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Adygea Republic": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Altai Krai": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Amur Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Arkhangelsk Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Astrakhan Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Bashkortostan Republic": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Belgorod Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Bryansk Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Buryatia Republic": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Chechen Republic": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Chelyabinsk Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Chukotka Autonomous Okrug": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Chuvashia Republic": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Ingushetia Republic": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Irkutsk Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Ivanovo Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Jewish Autonomous Okrug": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Kabardino-Balkarian Republic": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Kaliningrad Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Kalmykia Republic": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Kaluga Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Karachay-Cherkess Republic": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Karelia Republic": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Kemerovo Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Khabarovsk Krai": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Khakassia Republic": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Khanty-Mansi Autonomous Okrug": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Kirov Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Komi Republic": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Kostroma Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Krasnodar Krai": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Krasnoyarsk Krai": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Kurgan Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Kursk Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Leningrad Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Lipetsk Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Magadan Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Mari El Republic": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Mordovia Republic": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Moscow": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Moscow Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Murmansk Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Nenets Autonomous Okrug": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Nizhny Novgorod Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Novosibirsk Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Omsk Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Orel Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Orenburg Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Penza Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Perm Krai": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Primorsky Krai": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Pskov Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Rostov Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Ryazan Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Saint Petersburg": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Sakha (Yakutiya) Republic": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Sakhalin Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Samara Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Saratov Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Smolensk Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Sverdlovsk Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Tambov Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Tatarstan Republic": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Tomsk Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Tula Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Tver Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Tyumen Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Tyva Republic": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Udmurt Republic": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Ulyanovsk Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Unknown": {
      "administered": 166184558,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Vladimir Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Volgograd Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Vologda Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Voronezh Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Yamalo-Nenets Autonomous Okrug": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Yaroslavl Oblast": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Zabaykalsky Krai": {
      "administered": 0,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Rwanda": {
    "All": {
      "administered": 20141669,
      "people_vaccinated": 8405309,
      "people_partially_vaccinated": 9005283,
      "country": "Rwanda",
      "population": 12208407,
      "sq_km_area": 26338,
      "life_expectancy": "39.3",
      "elevation_in_meters": "1,598",
      "continent": "Africa",
      "abbreviation": "RW",
      "location": "Eastern Africa",
      "iso": 646,
      "capital_city": "Kigali",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Saint Kitts and Nevis": {
    "All": {
      "administered": 60467,
      "people_vaccinated": 26294,
      "people_partially_vaccinated": 31162,
      "country": "Saint Kitts and Nevis",
      "population": 55345,
      "sq_km_area": 261,
      "life_expectancy": "70.7",
      "elevation_in_meters": null,
      "continent": "North America",
      "abbreviation": "KN",
      "location": "Caribbean",
      "iso": 659,
      "capital_city": "Basseterre",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Saint Lucia": {
    "All": {
      "administered": 119786,
      "people_vaccinated": 53583,
      "people_partially_vaccinated": 58917,
      "country": "Saint Lucia",
      "population": 178844,
      "sq_km_area": 622,
      "life_expectancy": "72.3",
      "elevation_in_meters": null,
      "continent": "North America",
      "abbreviation": "LC",
      "location": "Caribbean",
      "iso": 662,
      "capital_city": "Castries",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Saint Vincent and the Grenadines": {
    "All": {
      "administered": 70310,
      "people_vaccinated": 30432,
      "people_partially_vaccinated": 36255,
      "country": "Saint Vincent and the Grenadines",
      "population": 109897,
      "sq_km_area": 388,
      "life_expectancy": "72.3",
      "elevation_in_meters": null,
      "continent": "North America",
      "abbreviation": "VC",
      "location": "Caribbean",
      "iso": 670,
      "capital_city": "Kingstown",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Samoa": {
    "All": {
      "administered": 412127,
      "people_vaccinated": 176005,
      "people_partially_vaccinated": 227491,
      "country": "Samoa",
      "population": 196440,
      "sq_km_area": 2831,
      "life_expectancy": "69.2",
      "elevation_in_meters": null,
      "continent": "Oceania",
      "abbreviation": "WS",
      "location": "Polynesia",
      "iso": 882,
      "capital_city": "Apia",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "San Marino": {
    "All": {
      "administered": 70704,
      "people_vaccinated": 23624,
      "people_partially_vaccinated": 26347,
      "country": "San Marino",
      "population": 33400,
      "sq_km_area": 61,
      "life_expectancy": "81.1",
      "elevation_in_meters": null,
      "continent": "Europe",
      "abbreviation": "SM",
      "location": "Southern Europe",
      "iso": 674,
      "capital_city": "San Marino",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Sao Tome and Principe": {
    "All": {
      "administered": 208657,
      "people_vaccinated": 86914,
      "people_partially_vaccinated": 113708,
      "country": "Sao Tome and Principe",
      "population": 204327,
      "sq_km_area": 964,
      "life_expectancy": "65.3",
      "elevation_in_meters": null,
      "continent": "Africa",
      "abbreviation": "ST",
      "location": "Central Africa",
      "iso": 678,
      "capital_city": "S",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Saudi Arabia": {
    "All": {
      "administered": 64714795,
      "people_vaccinated": 24801324,
      "people_partially_vaccinated": 26458997,
      "country": "Saudi Arabia",
      "population": 32938213,
      "sq_km_area": 2149690,
      "life_expectancy": "67.8",
      "elevation_in_meters": 665,
      "continent": "Asia",
      "abbreviation": "SA",
      "location": "Middle East",
      "iso": 682,
      "capital_city": "Riyadh",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Senegal": {
    "All": {
      "administered": 2469499,
      "people_vaccinated": 1045680,
      "people_partially_vaccinated": 1465788,
      "country": "Senegal",
      "population": 15850567,
      "sq_km_area": 196722,
      "life_expectancy": "62.2",
      "elevation_in_meters": 69,
      "continent": "Africa",
      "abbreviation": "SN",
      "location": "Western Africa",
      "iso": 686,
      "capital_city": "Dakar",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Serbia": {
    "All": {
      "administered": 8494958,
      "people_vaccinated": 3269374,
      "people_partially_vaccinated": 3347209,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Seychelles": {
    "All": {
      "administered": 201121,
      "people_vaccinated": 80290,
      "people_partially_vaccinated": 84327,
      "country": "Seychelles",
      "population": 94737,
      "sq_km_area": 455,
      "life_expectancy": "70.4",
      "elevation_in_meters": null,
      "continent": "Africa",
      "abbreviation": "SC",
      "location": "Eastern Africa",
      "iso": 690,
      "capital_city": "Victoria",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Sierra Leone": {
    "All": {
      "administered": 2868978,
      "people_vaccinated": 1315830,
      "people_partially_vaccinated": 1987563,
      "country": "Sierra Leone",
      "population": 7557212,
      "sq_km_area": 71740,
      "life_expectancy": "45.3",
      "elevation_in_meters": 279,
      "continent": "Africa",
      "abbreviation": "SL",
      "location": "Western Africa",
      "iso": 694,
      "capital_city": "Freetown",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Singapore": {
    "All": {
      "administered": 14027362,
      "people_vaccinated": 4984296,
      "people_partially_vaccinated": 5013834,
      "country": "Singapore",
      "population": 5708844,
      "sq_km_area": 618,
      "life_expectancy": "80.1",
      "elevation_in_meters": null,
      "continent": "Asia",
      "abbreviation": "SG",
      "location": "Southeast Asia",
      "iso": 702,
      "capital_city": "Singapore",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Slovakia": {
    "All": {
      "administered": 7069763,
      "people_vaccinated": 2766376,
      "people_partially_vaccinated": 2821364,
      "country": "Slovakia",
      "population": 5447662,
      "sq_km_area": 49012,
      "life_expectancy": "73.7",
      "elevation_in_meters": 458,
      "continent": "Europe",
      "abbreviation": "SK",
      "location": "Eastern Europe",
      "iso": 703,
      "capital_city": "Bratislava",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Slovenia": {
    "All": {
      "administered": 3138171,
      "people_vaccinated": 1221476,
      "people_partially_vaccinated": 1265337,
      "country": "Slovenia",
      "population": 2079976,
      "sq_km_area": 20256,
      "life_expectancy": "74.9",
      "elevation_in_meters": 492,
      "continent": "Europe",
      "abbreviation": "SI",
      "location": "Southern Europe",
      "iso": 705,
      "capital_city": "Ljubljana",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Gorenjska": {
      "administered": 316582,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Goriska": {
      "administered": 182162,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Jugovzhodna Slovenija": {
      "administered": 205282,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Koroska": {
      "administered": 110646,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Obalno-kraska": {
      "administered": 166648,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Osrednjeslovenska": {
      "administered": 860879,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Podravska": {
      "administered": 460345,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Pomurska": {
      "administered": 172981,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Posavska": {
      "administered": 106135,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Primorsko-notranjska": {
      "administered": 80915,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Savinjska": {
      "administered": 373221,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Unknown": {
      "administered": 12712,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Zasavska": {
      "administered": 89663,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Solomon Islands": {
    "All": {
      "administered": 434012,
      "people_vaccinated": 148371,
      "people_partially_vaccinated": 283298,
      "country": "Solomon Islands",
      "population": 611343,
      "sq_km_area": 28896,
      "life_expectancy": "71.3",
      "elevation_in_meters": null,
      "continent": "Oceania",
      "abbreviation": "SB",
      "location": "Melanesia",
      "iso": 90,
      "capital_city": "Honiara",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Somalia": {
    "All": {
      "administered": 2677716,
      "people_vaccinated": 1385138,
      "people_partially_vaccinated": 2200129,
      "country": "Somalia",
      "population": 14742523,
      "sq_km_area": 637657,
      "life_expectancy": "46.2",
      "elevation_in_meters": 410,
      "continent": "Africa",
      "abbreviation": "SO",
      "location": "Eastern Africa",
      "iso": 706,
      "capital_city": "Mogadishu",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "South Africa": {
    "All": {
      "administered": 35243240,
      "people_vaccinated": 18451136,
      "people_partially_vaccinated": 21408366,
      "country": "South Africa",
      "population": 56717156,
      "sq_km_area": 1221037,
      "life_expectancy": "51.1",
      "elevation_in_meters": "1,034",
      "continent": "Africa",
      "abbreviation": "ZA",
      "location": "Southern Africa",
      "iso": 710,
      "capital_city": "Pretoria",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "South Sudan": {
    "All": {
      "administered": 711247,
      "people_vaccinated": 619944,
      "people_partially_vaccinated": 663451,
      "country": "South Sudan",
      "population": 12575714,
      "sq_km_area": 619745,
      "life_expectancy": null,
      "elevation_in_meters": null,
      "continent": "Africa",
      "abbreviation": "SS",
      "location": "Eastern Africa",
      "iso": 728,
      "capital_city": "Juba",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Spain": {
    "All": {
      "administered": 101296643,
      "people_vaccinated": 40439425,
      "people_partially_vaccinated": 41209244,
      "country": "Spain",
      "population": 46354321,
      "sq_km_area": 505992,
      "life_expectancy": "78.8",
      "elevation_in_meters": 660,
      "continent": "Europe",
      "abbreviation": "ES",
      "location": "Southern Europe",
      "iso": 724,
      "capital_city": "Madrid",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Andalusia": {
      "administered": 17240809,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Aragon": {
      "administered": 2644039,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Asturias": {
      "administered": 2289485,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Baleares": {
      "administered": 2039682,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "C. Valenciana": {
      "administered": 9825026,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Canarias": {
      "administered": 4153573,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Cantabria": {
      "administered": 1264845,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Castilla - La Mancha": {
      "administered": 3984818,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Castilla y Leon": {
      "administered": 5302962,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Catalonia": {
      "administered": 14162170,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Ceuta": {
      "administered": 149357,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Extremadura": {
      "administered": 2325495,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Galicia": {
      "administered": 6115320,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "La Rioja": {
      "administered": 640986,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Madrid": {
      "administered": 13178549,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Melilla": {
      "administered": 139579,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Murcia": {
      "administered": 2811098,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Navarra": {
      "administered": 1315843,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Pais Vasco": {
      "administered": 4408388,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Unknown": {
      "administered": 218646,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Sri Lanka": {
    "All": {
      "administered": 39503105,
      "people_vaccinated": 14456721,
      "people_partially_vaccinated": 17064210,
      "country": "Sri Lanka",
      "population": 20876917,
      "life_expectancy": null,
      "elevation_in_meters": null,
      "location": null,
      "iso": null,
      "capital_city": null,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Sudan": {
    "All": {
      "administered": 7096087,
      "people_vaccinated": 3631390,
      "people_partially_vaccinated": 5929766,
      "country": "Sudan",
      "population": 40533330,
      "sq_km_area": 1886068,
      "life_expectancy": "56.6",
      "elevation_in_meters": 568,
      "continent": "Africa",
      "abbreviation": "SD",
      "location": "Northern Africa",
      "iso": 729,
      "capital_city": "Khartum",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Suriname": {
    "All": {
      "administered": 553668,
      "people_vaccinated": 237596,
      "people_partially_vaccinated": 267593,
      "country": "Suriname",
      "population": 563402,
      "sq_km_area": 163265,
      "life_expectancy": "71.4",
      "elevation_in_meters": 246,
      "continent": "South America",
      "abbreviation": "SR",
      "location": "South America",
      "iso": 740,
      "capital_city": "Paramaribo",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Sweden": {
    "All": {
      "administered": 22072138,
      "people_vaccinated": 7631111,
      "people_partially_vaccinated": 7826928,
      "country": "Sweden",
      "population": 9910701,
      "sq_km_area": 449964,
      "life_expectancy": "79.6",
      "elevation_in_meters": 320,
      "continent": "Europe",
      "abbreviation": "SE",
      "location": "Nordic Countries",
      "iso": 752,
      "capital_city": "Stockholm",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Blekinge": {
      "administered": 360037,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Dalarna": {
      "administered": 652065,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Gavleborg": {
      "administered": 638329,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Gotland": {
      "administered": 143700,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Halland": {
      "administered": 749229,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Jamtland Harjedalen": {
      "administered": 294080,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Jonkoping": {
      "administered": 793002,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Kalmar": {
      "administered": 567439,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Kronoberg": {
      "administered": 417567,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Norrbotten": {
      "administered": 581149,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Orebro": {
      "administered": 678645,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Ostergotland": {
      "administered": 1050188,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Skane": {
      "administered": 2771409,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Sormland": {
      "administered": 644593,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Stockholm": {
      "administered": 4749076,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Uppsala": {
      "administered": 866120,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Varmland": {
      "administered": 665799,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Vasterbotten": {
      "administered": 631856,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Vasternorrland": {
      "administered": 557859,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Vastmanland": {
      "administered": 595513,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Vastra Gotaland": {
      "administered": 3580966,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Switzerland": {
    "All": {
      "administered": 15691555,
      "people_vaccinated": 5996300,
      "people_partially_vaccinated": 6082264,
      "country": "Switzerland",
      "population": 8476005,
      "sq_km_area": 41284,
      "life_expectancy": "79.6",
      "elevation_in_meters": "1,350",
      "continent": "Europe",
      "abbreviation": "CH",
      "location": "Western Europe",
      "iso": 756,
      "capital_city": "Bern",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Aargau": {
      "administered": 1247744,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Appenzell Ausserrhoden": {
      "administered": 92479,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Appenzell Innerrhoden": {
      "administered": 23736,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Basel-Landschaft": {
      "administered": 541588,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Basel-Stadt": {
      "administered": 422237,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Berne": {
      "administered": 1979449,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Fribourg": {
      "administered": 500109,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Geneva": {
      "administered": 963062,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Glarus": {
      "administered": 64432,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Grisons": {
      "administered": 365915,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Jura": {
      "administered": 121229,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Lucerne": {
      "administered": 735878,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Neuchatel": {
      "administered": 311737,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Nidwalden": {
      "administered": 75485,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Obwalden": {
      "administered": 54477,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Schaffhausen": {
      "administered": 159348,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Schwyz": {
      "administered": 243948,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Solothurn": {
      "administered": 489673,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "St. Gallen": {
      "administered": 829571,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Thurgau": {
      "administered": 449206,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Ticino": {
      "administered": 674762,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Unknown": {
      "administered": 15209,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Uri": {
      "administered": 62104,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Valais": {
      "administered": 591496,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Vaud": {
      "administered": 1464824,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Zug": {
      "administered": 244483,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Zurich": {
      "administered": 2967374,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Syria": {
    "All": {
      "administered": 3696273,
      "people_vaccinated": 1530672,
      "people_partially_vaccinated": 2467704,
      "country": "Syria",
      "population": 18269868,
      "sq_km_area": 185180,
      "life_expectancy": "68.5",
      "elevation_in_meters": 514,
      "continent": "Asia",
      "abbreviation": "SY",
      "location": "Middle East",
      "iso": 760,
      "capital_city": "Damascus",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Taiwan*": {
    "All": {
      "administered": 53284732,
      "people_vaccinated": 18752383,
      "people_partially_vaccinated": 19884741,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Tajikistan": {
    "All": {
      "administered": 12271999,
      "people_vaccinated": 4914275,
      "people_partially_vaccinated": 5166745,
      "country": "Tajikistan",
      "population": 8921343,
      "sq_km_area": 143100,
      "life_expectancy": "64.1",
      "elevation_in_meters": "3,186",
      "continent": "Asia",
      "abbreviation": "TJ",
      "location": "Southern and Central Asia",
      "iso": 762,
      "capital_city": "Dushanbe",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Tanzania": {
    "All": {
      "administered": 7280582,
      "people_vaccinated": 3467885,
      "people_partially_vaccinated": 6483895,
      "country": "Tanzania",
      "population": 57310019,
      "sq_km_area": 883749,
      "life_expectancy": "52.3",
      "elevation_in_meters": "1,018",
      "continent": "Africa",
      "abbreviation": "TZ",
      "location": "Eastern Africa",
      "iso": 834,
      "capital_city": "Dodoma",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Thailand": {
    "All": {
      "administered": 134653094,
      "people_vaccinated": 51577950,
      "people_partially_vaccinated": 56234269,
      "country": "Thailand",
      "population": 69037513,
      "sq_km_area": 513115,
      "life_expectancy": "68.6",
      "elevation_in_meters": 287,
      "continent": "Asia",
      "abbreviation": "TH",
      "location": "Southeast Asia",
      "iso": 764,
      "capital_city": "Bangkok",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Timor-Leste": {
    "All": {
      "administered": 1496002,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Togo": {
    "All": {
      "administered": 3290821,
      "people_vaccinated": 1557538,
      "people_partially_vaccinated": 2037429,
      "country": "Togo",
      "population": 7797694,
      "sq_km_area": 56785,
      "life_expectancy": "54.7",
      "elevation_in_meters": 236,
      "continent": "Africa",
      "abbreviation": "TG",
      "location": "Western Africa",
      "iso": 768,
      "capital_city": "Lom",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Trinidad and Tobago": {
    "All": {
      "administered": 1554544,
      "people_vaccinated": 711698,
      "people_partially_vaccinated": 747863,
      "country": "Trinidad and Tobago",
      "population": 1369125,
      "sq_km_area": 5130,
      "life_expectancy": 68,
      "elevation_in_meters": 83,
      "continent": "North America",
      "abbreviation": "TT",
      "location": "Caribbean",
      "iso": 780,
      "capital_city": "Port-of-Spain",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Tunisia": {
    "All": {
      "administered": 13133590,
      "people_vaccinated": 6367441,
      "people_partially_vaccinated": 7225007,
      "country": "Tunisia",
      "population": 11532127,
      "sq_km_area": 163610,
      "life_expectancy": "73.7",
      "elevation_in_meters": 246,
      "continent": "Africa",
      "abbreviation": "TN",
      "location": "Northern Africa",
      "iso": 788,
      "capital_city": "Tunis",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Turkey": {
    "All": {
      "administered": 147576861,
      "people_vaccinated": 53044519,
      "people_partially_vaccinated": 57825933,
      "country": "Turkey",
      "population": 80745020,
      "sq_km_area": 774815,
      "life_expectancy": 71,
      "elevation_in_meters": "1,132",
      "continent": "Asia",
      "abbreviation": "TR",
      "location": "Middle East",
      "iso": 792,
      "capital_city": "Ankara",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "US": {
    "All": {
      "administered": 579685594,
      "people_vaccinated": 220223617,
      "people_partially_vaccinated": 258229583,
      "country": "US",
      "population": 324459463,
      "sq_km_area": 9363520,
      "life_expectancy": "77.1",
      "elevation_in_meters": 760,
      "continent": "North America",
      "abbreviation": "US",
      "location": "North America",
      "iso": 840,
      "capital_city": "Washington",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "US (Aggregate)": {
    "All": {
      "administered": 577469829,
      "people_vaccinated": 220223617,
      "people_partially_vaccinated": 258229583,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Uganda": {
    "All": {
      "administered": 20899440,
      "people_vaccinated": 10568519,
      "people_partially_vaccinated": 15686085,
      "country": "Uganda",
      "population": 42862958,
      "sq_km_area": 241038,
      "life_expectancy": "42.9",
      "elevation_in_meters": null,
      "continent": "Africa",
      "abbreviation": "UG",
      "location": "Eastern Africa",
      "iso": 800,
      "capital_city": "Kampala",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "United Arab Emirates": {
    "All": {
      "administered": 24783091,
      "people_vaccinated": 9672839,
      "people_partially_vaccinated": 9890428,
      "country": "United Arab Emirates",
      "population": 9400145,
      "sq_km_area": 83600,
      "life_expectancy": "74.1",
      "elevation_in_meters": 149,
      "continent": "Asia",
      "abbreviation": "AE",
      "location": "Middle East",
      "iso": 784,
      "capital_city": "Abu Dhabi",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "United Kingdom": {
    "All": {
      "administered": 143928741,
      "people_vaccinated": 49780389,
      "people_partially_vaccinated": 53264512,
      "country": "United Kingdom",
      "population": 66181585,
      "sq_km_area": 242900,
      "life_expectancy": "77.7",
      "elevation_in_meters": 162,
      "continent": "Europe",
      "abbreviation": "GB",
      "location": "British Isles",
      "iso": 826,
      "capital_city": "London",
      "updated": "2022/05/11 00:00:00+00"
    },
    "Anguilla": {
      "administered": 23378,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Bermuda": {
      "administered": 131441,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "British Virgin Islands": {
      "administered": 40872,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Cayman Islands": {
      "administered": 143196,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Channel Islands": {
      "administered": 367460,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "England": {
      "administered": 119494847,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Falkland Islands (Malvinas)": {
      "administered": 4407,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Gibraltar": {
      "administered": 119855,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Isle of Man": {
      "administered": 189896,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Montserrat": {
      "administered": 4255,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Northern Ireland": {
      "administered": 3849794,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Saint Helena, Ascension and Tristan da Cunha": {
      "administered": 7892,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Scotland": {
      "administered": 12237459,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Turks and Caicos Islands": {
      "administered": 68800,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    },
    "Wales": {
      "administered": 6993313,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Uruguay": {
    "All": {
      "administered": 8226731,
      "people_vaccinated": 2865710,
      "people_partially_vaccinated": 2985524,
      "country": "Uruguay",
      "population": 3456750,
      "sq_km_area": 175016,
      "life_expectancy": "75.2",
      "elevation_in_meters": 109,
      "continent": "South America",
      "abbreviation": "UY",
      "location": "South America",
      "iso": 858,
      "capital_city": "Montevideo",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Uzbekistan": {
    "All": {
      "administered": 48286000,
      "people_vaccinated": 14551774,
      "people_partially_vaccinated": 19169443,
      "country": "Uzbekistan",
      "population": 31910641,
      "sq_km_area": 447400,
      "life_expectancy": "63.7",
      "elevation_in_meters": null,
      "continent": "Asia",
      "abbreviation": "UZ",
      "location": "Southern and Central Asia",
      "iso": 860,
      "capital_city": "Toskent",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Vanuatu": {
    "All": {
      "administered": 301000,
      "people_vaccinated": 118158,
      "people_partially_vaccinated": 172232,
      "country": "Vanuatu",
      "population": 276244,
      "sq_km_area": 12189,
      "life_expectancy": "60.6",
      "elevation_in_meters": null,
      "continent": "Oceania",
      "abbreviation": "VU",
      "location": "Melanesia",
      "iso": 548,
      "capital_city": "Port-Vila",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Venezuela": {
    "All": {
      "administered": 37860994,
      "people_vaccinated": 14287370,
      "people_partially_vaccinated": 22157232,
      "country": "Venezuela",
      "population": 31977065,
      "sq_km_area": 912050,
      "life_expectancy": "73.1",
      "elevation_in_meters": 450,
      "continent": "South America",
      "abbreviation": "VE",
      "location": "South America",
      "iso": 862,
      "capital_city": "Caracas",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Vietnam": {
    "All": {
      "administered": 214532764,
      "people_vaccinated": 77754108,
      "people_partially_vaccinated": 79947189,
      "country": "Vietnam",
      "population": 95540800,
      "sq_km_area": 331689,
      "life_expectancy": "69.3",
      "elevation_in_meters": 398,
      "continent": "Asia",
      "abbreviation": "VN",
      "location": "Southeast Asia",
      "iso": 704,
      "capital_city": "Hanoi",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "West Bank and Gaza": {
    "All": {
      "administered": 3718981,
      "people_vaccinated": 0,
      "people_partially_vaccinated": 0,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "World": {
    "All": {
      "administered": 11377680771,
      "people_vaccinated": 4470560454,
      "people_partially_vaccinated": 4929173818,
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Yemen": {
    "All": {
      "administered": 821853,
      "people_vaccinated": 418785,
      "people_partially_vaccinated": 656957,
      "country": "Yemen",
      "population": 28250420,
      "sq_km_area": 527968,
      "life_expectancy": "59.8",
      "elevation_in_meters": 999,
      "continent": "Asia",
      "abbreviation": "YE",
      "location": "Middle East",
      "iso": 887,
      "capital_city": "Sanaa",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Zambia": {
    "All": {
      "administered": 3478542,
      "people_vaccinated": 2490313,
      "people_partially_vaccinated": 3240892,
      "country": "Zambia",
      "population": 17094130,
      "sq_km_area": 752618,
      "life_expectancy": "37.2",
      "elevation_in_meters": "1,138",
      "continent": "Africa",
      "abbreviation": "ZM",
      "location": "Eastern Africa",
      "iso": 894,
      "capital_city": "Lusaka",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Zimbabwe": {
    "All": {
      "administered": 10739386,
      "people_vaccinated": 3941327,
      "people_partially_vaccinated": 5953536,
      "country": "Zimbabwe",
      "population": 16529904,
      "sq_km_area": 390757,
      "life_expectancy": "37.8",
      "elevation_in_meters": 961,
      "continent": "Africa",
      "abbreviation": "ZW",
      "location": "Eastern Africa",
      "iso": 716,
      "capital_city": "Harare",
      "updated": "2022/05/11 00:00:00+00"
    }
  },
  "Global": {
    "All": {
      "population": 7444509223,
      "administered": 14058705875,
      "people_vaccinated": 4477410879,
      "people_partially_vaccinated": 4939025203
    }
  }
}    
"""