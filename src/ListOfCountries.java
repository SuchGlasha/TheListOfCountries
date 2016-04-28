package ru.miet.mp34.popova;

import java.util.ArrayList;


public class ListOfCountries {

    public ArrayList<Country> list = new ArrayList<Country>();

    public ArrayList<Country> getCountriesByLetter(char L)
    {
        ArrayList<Country> smallList = new ArrayList<Country>();
        for(Country item : list)
        {
            if(item.code.charAt(0) == L)
            {
                smallList.add(item);
            }
        }
        return smallList;
    }

    ListOfCountries()
    {
        list.add(new Country("Afghanistan", "AF"));
        list.add(new Country("Åland Islands", "AX"));
        list.add(new Country("Albania", "AL"));
        list.add(new Country("Algeria", "DZ"));
        list.add(new Country("American Samoa", "AS"));
        list.add(new Country("AndorrA", "AD"));
        list.add(new Country("Angola", "AO"));
        list.add(new Country("Anguilla", "AI"));
        list.add(new Country("Antarctica", "AQ"));
        list.add(new Country("Antigua and Barbuda", "AG"));
        list.add(new Country("Argentina", "AR"));
        list.add(new Country("Armenia", "AM"));
        list.add(new Country("Aruba", "AW"));
        list.add(new Country("Australia", "AU"));
        list.add(new Country("Austria", "AT"));
        list.add(new Country("Azerbaijan", "AZ"));
        list.add(new Country("Bahamas", "BS"));
        list.add(new Country("Bahrain", "BH"));
        list.add(new Country("Bangladesh", "BD"));
        list.add(new Country("Barbados", "BB"));
        list.add(new Country("Belarus", "BY"));
        list.add(new Country("Belgium", "BE"));
        list.add(new Country("Belize", "BZ"));
        list.add(new Country("Benin", "BJ"));
        list.add(new Country("Bermuda", "BM"));
        list.add(new Country("Bhutan", "BT"));
        list.add(new Country("Bolivia", "BO"));
        list.add(new Country("Bosnia and Herzegovina", "BA"));
        list.add(new Country("Botswana", "BW"));
        list.add(new Country("Bouvet Island", "BV"));
        list.add(new Country("Brazil", "BR"));
        list.add(new Country("British Indian Ocean Territory", "IO"));
        list.add(new Country("Brunei Darussalam", "BN"));
        list.add(new Country("Bulgaria", "BG"));
        list.add(new Country("Burkina Faso", "BF"));
        list.add(new Country("Burundi", "BI"));
        list.add(new Country("Cambodia", "KH"));
        list.add(new Country("Cameroon", "CM"));
        list.add(new Country("Canada", "CA"));
        list.add(new Country("Cape Verde", "CV"));
        list.add(new Country("Cayman Islands", "KY"));
        list.add(new Country("Central African Republic", "CF"));
        list.add(new Country("Chad", "TD"));
        list.add(new Country("Chile", "CL"));
        list.add(new Country("China", "CN"));
        list.add(new Country("Christmas Island", "CX"));
        list.add(new Country("Cocos (Keeling)) Islands", "CC"));
        list.add(new Country("Colombia", "CO"));
        list.add(new Country("Comoros", "KM"));
        list.add(new Country("Congo", "CG"));
        list.add(new Country("Congo, The Democratic Republic of the", "CD"));
        list.add(new Country("Cook Islands", "CK"));
        list.add(new Country("Costa Rica", "CR"));
        list.add(new Country("Cote D\"Ivoire", "CI"));
        list.add(new Country("Croatia", "HR"));
        list.add(new Country("Cuba", "CU"));
        list.add(new Country("Cyprus", "CY"));
        list.add(new Country("Czech Republic", "CZ"));
        list.add(new Country("Denmark", "DK"));
        list.add(new Country("Djibouti", "DJ"));
        list.add(new Country("Dominica", "DM"));
        list.add(new Country("Dominican Republic", "DO"));
        list.add(new Country("Ecuador", "EC"));
        list.add(new Country("Egypt", "EG"));
        list.add(new Country("El Salvador", "SV"));
        list.add(new Country("Equatorial Guinea", "GQ"));
        list.add(new Country("Eritrea", "ER"));
        list.add(new Country("Estonia", "EE"));
        list.add(new Country("Ethiopia", "ET"));
        list.add(new Country("Falkland Islands (Malvinas))", "FK"));
        list.add(new Country("Faroe Islands", "FO"));
        list.add(new Country("Fiji", "FJ"));
        list.add(new Country("Finland", "FI"));
        list.add(new Country("France", "FR"));
        list.add(new Country("French Guiana", "GF"));
        list.add(new Country("French Polynesia", "PF"));
        list.add(new Country("French Southern Territories", "TF"));
        list.add(new Country("Gabon", "GA"));
        list.add(new Country("Gambia", "GM"));
        list.add(new Country("Georgia", "GE"));
        list.add(new Country("Germany", "DE"));
        list.add(new Country("Ghana", "GH"));
        list.add(new Country("Gibraltar", "GI"));
        list.add(new Country("Greece", "GR"));
        list.add(new Country("Greenland", "GL"));
        list.add(new Country("Grenada", "GD"));
        list.add(new Country("Guadeloupe", "GP"));
        list.add(new Country("Guam", "GU"));
        list.add(new Country("Guatemala", "GT"));
        list.add(new Country("Guernsey", "GG"));
        list.add(new Country("Guinea", "GN"));
        list.add(new Country("Guinea-Bissau", "GW"));
        list.add(new Country("Guyana", "GY"));
        list.add(new Country("Haiti", "HT"));
        list.add(new Country("Heard Island and Mcdonald Islands", "HM"));
        list.add(new Country("Holy See (Vatican City State))", "VA"));
        list.add(new Country("Honduras", "HN"));
        list.add(new Country("Hong Kong", "HK"));
        list.add(new Country("Hungary", "HU"));
        list.add(new Country("Iceland", "IS"));
        list.add(new Country("India", "IN"));
        list.add(new Country("Indonesia", "ID"));
        list.add(new Country("Iran, Islamic Republic Of", "IR"));
        list.add(new Country("Iraq", "IQ"));
        list.add(new Country("Ireland", "IE"));
        list.add(new Country("Isle of Man", "IM"));
        list.add(new Country("Israel", "IL"));
        list.add(new Country("Italy", "IT"));
        list.add(new Country("Jamaica", "JM"));
        list.add(new Country("Japan", "JP"));
        list.add(new Country("Jersey", "JE"));
        list.add(new Country("Jordan", "JO"));
        list.add(new Country("Kazakhstan", "KZ"));
        list.add(new Country("Kenya", "KE"));
        list.add(new Country("Kiribati", "KI"));
        list.add(new Country("Korea, Democratic People\"S Republic of", "KP"));
        list.add(new Country("Korea, Republic of", "KR"));
        list.add(new Country("Kuwait", "KW"));
        list.add(new Country("Kyrgyzstan", "KG"));
        list.add(new Country("Lao People\"S Democratic Republic", "LA"));
        list.add(new Country("Latvia", "LV"));
        list.add(new Country("Lebanon", "LB"));
        list.add(new Country("Lesotho", "LS"));
        list.add(new Country("Liberia", "LR"));
        list.add(new Country("Libyan Arab Jamahiriya", "LY"));
        list.add(new Country("Liechtenstein", "LI"));
        list.add(new Country("Lithuania", "LT"));
        list.add(new Country("Luxembourg", "LU"));
        list.add(new Country("Macao", "MO"));
        list.add(new Country("Macedonia, The Former Yugoslav Republic of", "MK"));
        list.add(new Country("Madagascar", "MG"));
        list.add(new Country("Malawi", "MW"));
        list.add(new Country("Malaysia", "MY"));
        list.add(new Country("Maldives", "MV"));
        list.add(new Country("Mali", "ML"));
        list.add(new Country("Malta", "MT"));
        list.add(new Country("Marshall Islands", "MH"));
        list.add(new Country("Martinique", "MQ"));
        list.add(new Country("Mauritania", "MR"));
        list.add(new Country("Mauritius", "MU"));
        list.add(new Country("Mayotte", "YT"));
        list.add(new Country("Mexico", "MX"));
        list.add(new Country("Micronesia, Federated States of", "FM"));
        list.add(new Country("Moldova, Republic of", "MD"));
        list.add(new Country("Monaco", "MC"));
        list.add(new Country("Mongolia", "MN"));
        list.add(new Country("Montserrat", "MS"));
        list.add(new Country("Morocco", "MA"));
        list.add(new Country("Mozambique", "MZ"));
        list.add(new Country("Myanmar", "MM"));
        list.add(new Country("Namibia", "NA"));
        list.add(new Country("Nauru", "NR"));
        list.add(new Country("Nepal", "NP"));
        list.add(new Country("Netherlands", "NL"));
        list.add(new Country("Netherlands Antilles", "AN"));
        list.add(new Country("New Caledonia", "NC"));
        list.add(new Country("New Zealand", "NZ"));
        list.add(new Country("Nicaragua", "NI"));
        list.add(new Country("Niger", "NE"));
        list.add(new Country("Nigeria", "NG"));
        list.add(new Country("Niue", "NU"));
        list.add(new Country("Norfolk Island", "NF"));
        list.add(new Country("Northern Mariana Islands", "MP"));
        list.add(new Country("Norway", "NO"));
        list.add(new Country("Oman", "OM"));
        list.add(new Country("Pakistan", "PK"));
        list.add(new Country("Palau", "PW"));
        list.add(new Country("Palestinian Territory, Occupied", "PS"));
        list.add(new Country("Panama", "PA"));
        list.add(new Country("Papua New Guinea", "PG"));
        list.add(new Country("Paraguay", "PY"));
        list.add(new Country("Peru", "PE"));
        list.add(new Country("Philippines", "PH"));
        list.add(new Country("Pitcairn", "PN"));
        list.add(new Country("Poland", "PL"));
        list.add(new Country("Portugal", "PT"));
        list.add(new Country("Puerto Rico", "PR"));
        list.add(new Country("Qatar", "QA"));
        list.add(new Country("Reunion", "RE"));
        list.add(new Country("Romania", "RO"));
        list.add(new Country("Russian Federation", "RU"));
        list.add(new Country("RWANDA", "RW"));
        list.add(new Country("Saint Helena", "SH"));
        list.add(new Country("Saint Kitts and Nevis", "KN"));
        list.add(new Country("Saint Lucia", "LC"));
        list.add(new Country("Saint Pierre and Miquelon", "PM"));
        list.add(new Country("Saint Vincent and the Grenadines", "VC"));
        list.add(new Country("Samoa", "WS"));
        list.add(new Country("San Marino", "SM"));
        list.add(new Country("Sao Tome and Principe", "ST"));
        list.add(new Country("Saudi Arabia", "SA"));
        list.add(new Country("Senegal", "SN"));
        list.add(new Country("Serbia and Montenegro", "CS"));
        list.add(new Country("Seychelles", "SC"));
        list.add(new Country("Sierra Leone", "SL"));
        list.add(new Country("Singapore", "SG"));
        list.add(new Country("Slovakia", "SK"));
        list.add(new Country("Slovenia", "SI"));
        list.add(new Country("Solomon Islands", "SB"));
        list.add(new Country("Somalia", "SO"));
        list.add(new Country("South Africa", "ZA"));
        list.add(new Country("South Georgia and the South Sandwich Islands", "GS"));
        list.add(new Country("Spain", "ES"));
        list.add(new Country("Sri Lanka", "LK"));
        list.add(new Country("Sudan", "SD"));
        list.add(new Country("Suriname", "SR"));
        list.add(new Country("Svalbard and Jan Mayen", "SJ"));
        list.add(new Country("Swaziland", "SZ"));
        list.add(new Country("Sweden", "SE"));
        list.add(new Country("Switzerland", "CH"));
        list.add(new Country("Syrian Arab Republic", "SY"));
        list.add(new Country("Taiwan, Province of China", "TW"));
        list.add(new Country("Tajikistan", "TJ"));
        list.add(new Country("Tanzania, United Republic of", "TZ"));
        list.add(new Country("Thailand", "TH"));
        list.add(new Country("Timor-Leste", "TL"));
        list.add(new Country("Togo", "TG"));
        list.add(new Country("Tokelau", "TK"));
        list.add(new Country("Tonga", "TO"));
        list.add(new Country("Trinidad and Tobago", "TT"));
        list.add(new Country("Tunisia", "TN"));
        list.add(new Country("Turkey", "TR"));
        list.add(new Country("Turkmenistan", "TM"));
        list.add(new Country("Turks and Caicos Islands", "TC"));
        list.add(new Country("Tuvalu", "TV"));
        list.add(new Country("Uganda", "UG"));
        list.add(new Country("Ukraine", "UA"));
        list.add(new Country("United Arab Emirates", "AE"));
        list.add(new Country("United Kingdom", "GB"));
        list.add(new Country("United States", "US"));
        list.add(new Country("United States Minor Outlying Islands", "UM"));
        list.add(new Country("Uruguay", "UY"));
        list.add(new Country("Uzbekistan", "UZ"));
        list.add(new Country("Vanuatu", "VU"));
        list.add(new Country("Venezuela", "VE"));
        list.add(new Country("Viet Nam", "VN"));
        list.add(new Country("Virgin Islands, British", "VG"));
        list.add(new Country("Virgin Islands, U.S.", "VI"));
        list.add(new Country("Wallis and Futuna", "WF"));
        list.add(new Country("Western Sahara", "EH"));
        list.add(new Country("Yemen", "YE"));
        list.add(new Country("Zambia", "ZM"));
        list.add(new Country("Zimbabwe", "ZW"));
    }

}
