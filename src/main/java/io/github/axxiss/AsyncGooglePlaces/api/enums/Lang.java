package io.github.axxiss.AsyncGooglePlaces.api.enums;

/**
 * List of supported languages and their codes.
 *
 * @author Alexis Mas <alexis @ holla.com>
 * @see <a href="https://spreadsheets.google.com/pub?key=p9pdwsai2hDMsLkXsoM05KQ&gid=1">Current language list</a>
 */
public enum Lang {
    ARABIC("ar"),
    BASQUE("eu"),
    BULGARIAN("bg"),
    BENGALI("bn"),
    CATALAN("ca"),
    CZECH("cs"),
    DANISH("da"),
    GERMAN("de"),
    GREEK("el"),
    ENGLISH("en"),
    ENGLISH_AUSTRALIAN("en-AU"),
    ENGLISH_GREAT_BRITAIN("en-GB"),
    SPANISH("es"),
    FARSI("fa"),
    FINNISH("fi"),
    FILIPINO("fil"),
    FRENCH("fr"),
    GALICIAN("gl"),
    GUJARATI("gu"),
    HINDI("hi"),
    ROATIAN("hr"),
    HUNGARIAN("hu"),
    INDONESIAN("id"),
    ITALIAN("it"),
    HEBREW("iw"),
    JAPANESE("ja"),
    KANNADA("kn"),
    KOREAN("ko"),
    LITHUANIAN("lt"),
    LATVIAN("lv"),
    MALAYALAM("ml"),
    MARATHI("mr"),
    DUTCH("nl"),
    NORWEGIAN_NYNORSK("nn"),
    NORWEGIAN("no"),
    ORIYA("or"),
    POLISH("pl"),
    PORTUGUESE("pt"),
    PORTUGUESE_BRAZIL("pt-BR"),
    PORTUGUESE_PORTUGAL("pt-PT"),
    ROMANSCH("rm"),
    ROMANIAN("ro"),
    RUSSIAN("ru"),
    SLOVAK("sk"),
    SLOVENIAN("sl"),
    SERBIAN("sr"),
    SWEDISH("sv"),
    TAGALOG("tl"),
    TAMIL("ta"),
    TELUGU("te"),
    THAI("th"),
    TURKISH("tr"),
    UKRAINIAN("uk"),
    VIETNAMESE("vi"),
    CHINESE_SIMPLIFIED("zh-CN"),
    CHINESE_TRADITIONAL("zh-TW");

    Lang(String value) {
        mValue = value;
    }

    private String mValue;

    public String getValue() {
        return mValue;
    }

}
