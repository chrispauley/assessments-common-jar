//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.17 at 03:34:40 PM EST 
//


package org.hros.common.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanguageCodeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageCodeList"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="en-US"/&gt;
 *     &lt;enumeration value="en-CA"/&gt;
 *     &lt;enumeration value="aa-ET"/&gt;
 *     &lt;enumeration value="ab-GE"/&gt;
 *     &lt;enumeration value="af-ZA"/&gt;
 *     &lt;enumeration value="am-ET"/&gt;
 *     &lt;enumeration value="ar-SA"/&gt;
 *     &lt;enumeration value="as-IN"/&gt;
 *     &lt;enumeration value="ay-BO"/&gt;
 *     &lt;enumeration value="az-AZ"/&gt;
 *     &lt;enumeration value="ba-RU"/&gt;
 *     &lt;enumeration value="be-BY"/&gt;
 *     &lt;enumeration value="bg-BG"/&gt;
 *     &lt;enumeration value="bh-IN"/&gt;
 *     &lt;enumeration value="bi-VU"/&gt;
 *     &lt;enumeration value="bn-BD"/&gt;
 *     &lt;enumeration value="bo-BT"/&gt;
 *     &lt;enumeration value="br-FR"/&gt;
 *     &lt;enumeration value="ca-ES"/&gt;
 *     &lt;enumeration value="co-FR"/&gt;
 *     &lt;enumeration value="cs-CZ"/&gt;
 *     &lt;enumeration value="cy-GB"/&gt;
 *     &lt;enumeration value="da-DE"/&gt;
 *     &lt;enumeration value="de-DE"/&gt;
 *     &lt;enumeration value="dz-BT"/&gt;
 *     &lt;enumeration value="el-GR"/&gt;
 *     &lt;enumeration value="es-ES"/&gt;
 *     &lt;enumeration value="et-EE"/&gt;
 *     &lt;enumeration value="eu-ES"/&gt;
 *     &lt;enumeration value="fa-AF"/&gt;
 *     &lt;enumeration value="fi-FI"/&gt;
 *     &lt;enumeration value="fj-FJ"/&gt;
 *     &lt;enumeration value="fo-FO"/&gt;
 *     &lt;enumeration value="fr-CA"/&gt;
 *     &lt;enumeration value="fr-FR"/&gt;
 *     &lt;enumeration value="fy-NL"/&gt;
 *     &lt;enumeration value="ga-IE"/&gt;
 *     &lt;enumeration value="gd-GB"/&gt;
 *     &lt;enumeration value="gl-ES"/&gt;
 *     &lt;enumeration value="gn-PY"/&gt;
 *     &lt;enumeration value="gu-IN"/&gt;
 *     &lt;enumeration value="ha-NG"/&gt;
 *     &lt;enumeration value="hi-IN"/&gt;
 *     &lt;enumeration value="hr-HR"/&gt;
 *     &lt;enumeration value="hu-HU"/&gt;
 *     &lt;enumeration value="hy-AM"/&gt;
 *     &lt;enumeration value="ik-GL"/&gt;
 *     &lt;enumeration value="in-ID"/&gt;
 *     &lt;enumeration value="is-IS"/&gt;
 *     &lt;enumeration value="it-IT"/&gt;
 *     &lt;enumeration value="iw-IL"/&gt;
 *     &lt;enumeration value="ja-JP"/&gt;
 *     &lt;enumeration value="ji-IL"/&gt;
 *     &lt;enumeration value="jw-ID"/&gt;
 *     &lt;enumeration value="ka-GE"/&gt;
 *     &lt;enumeration value="kk-KZ"/&gt;
 *     &lt;enumeration value="kl-GL"/&gt;
 *     &lt;enumeration value="km-KH"/&gt;
 *     &lt;enumeration value="kn-IN"/&gt;
 *     &lt;enumeration value="ko-KP"/&gt;
 *     &lt;enumeration value="ko-KR"/&gt;
 *     &lt;enumeration value="ks-IN"/&gt;
 *     &lt;enumeration value="ku-IQ"/&gt;
 *     &lt;enumeration value="ky-CN"/&gt;
 *     &lt;enumeration value="la-VA"/&gt;
 *     &lt;enumeration value="ln-CD"/&gt;
 *     &lt;enumeration value="lo-LA"/&gt;
 *     &lt;enumeration value="lt-LT"/&gt;
 *     &lt;enumeration value="lv-LV"/&gt;
 *     &lt;enumeration value="mg-MG"/&gt;
 *     &lt;enumeration value="mi-NZ"/&gt;
 *     &lt;enumeration value="mk-MK"/&gt;
 *     &lt;enumeration value="ml-IN"/&gt;
 *     &lt;enumeration value="mn-MN"/&gt;
 *     &lt;enumeration value="mo-MO"/&gt;
 *     &lt;enumeration value="mr-IN"/&gt;
 *     &lt;enumeration value="ms-MY"/&gt;
 *     &lt;enumeration value="mt-MH"/&gt;
 *     &lt;enumeration value="my-MM"/&gt;
 *     &lt;enumeration value="na-NR"/&gt;
 *     &lt;enumeration value="ne-NP"/&gt;
 *     &lt;enumeration value="nl-NL"/&gt;
 *     &lt;enumeration value="no-NO"/&gt;
 *     &lt;enumeration value="oc-FR"/&gt;
 *     &lt;enumeration value="om-ET"/&gt;
 *     &lt;enumeration value="or-IN"/&gt;
 *     &lt;enumeration value="pa-IN"/&gt;
 *     &lt;enumeration value="pl-PL"/&gt;
 *     &lt;enumeration value="ps-PK"/&gt;
 *     &lt;enumeration value="pt-PT"/&gt;
 *     &lt;enumeration value="qu-PE"/&gt;
 *     &lt;enumeration value="rm-CH"/&gt;
 *     &lt;enumeration value="rn-BI"/&gt;
 *     &lt;enumeration value="ro-RO"/&gt;
 *     &lt;enumeration value="ru-RU"/&gt;
 *     &lt;enumeration value="rw-RW"/&gt;
 *     &lt;enumeration value="sa-IN"/&gt;
 *     &lt;enumeration value="sd-PK"/&gt;
 *     &lt;enumeration value="sg-CF"/&gt;
 *     &lt;enumeration value="sh-HR"/&gt;
 *     &lt;enumeration value="si-LK"/&gt;
 *     &lt;enumeration value="sk-SK"/&gt;
 *     &lt;enumeration value="sl-SI"/&gt;
 *     &lt;enumeration value="sm-WS"/&gt;
 *     &lt;enumeration value="sn-ZW"/&gt;
 *     &lt;enumeration value="so-SO"/&gt;
 *     &lt;enumeration value="sq-AL"/&gt;
 *     &lt;enumeration value="sr-CS"/&gt;
 *     &lt;enumeration value="ss-ZA"/&gt;
 *     &lt;enumeration value="st-ZA"/&gt;
 *     &lt;enumeration value="su-SD"/&gt;
 *     &lt;enumeration value="sv-SE"/&gt;
 *     &lt;enumeration value="sw-TL"/&gt;
 *     &lt;enumeration value="ta-IN"/&gt;
 *     &lt;enumeration value="te-IN"/&gt;
 *     &lt;enumeration value="tg-TJ"/&gt;
 *     &lt;enumeration value="th-TH"/&gt;
 *     &lt;enumeration value="ti-ET"/&gt;
 *     &lt;enumeration value="tk-TM"/&gt;
 *     &lt;enumeration value="tl-PH"/&gt;
 *     &lt;enumeration value="tn-ZA"/&gt;
 *     &lt;enumeration value="to-TO"/&gt;
 *     &lt;enumeration value="tr-TR"/&gt;
 *     &lt;enumeration value="ts-ZA"/&gt;
 *     &lt;enumeration value="tt-RU"/&gt;
 *     &lt;enumeration value="tw-GH"/&gt;
 *     &lt;enumeration value="uk-UA"/&gt;
 *     &lt;enumeration value="ur-PK"/&gt;
 *     &lt;enumeration value="uz-UZ"/&gt;
 *     &lt;enumeration value="vi-VN"/&gt;
 *     &lt;enumeration value="wo-SN"/&gt;
 *     &lt;enumeration value="xh-ZA"/&gt;
 *     &lt;enumeration value="yo-NG"/&gt;
 *     &lt;enumeration value="zh-CN"/&gt;
 *     &lt;enumeration value="zu-ZA"/&gt;
 *     &lt;enumeration value="aa"/&gt;
 *     &lt;enumeration value="ab"/&gt;
 *     &lt;enumeration value="af"/&gt;
 *     &lt;enumeration value="am"/&gt;
 *     &lt;enumeration value="ar"/&gt;
 *     &lt;enumeration value="as"/&gt;
 *     &lt;enumeration value="ay"/&gt;
 *     &lt;enumeration value="az"/&gt;
 *     &lt;enumeration value="ba"/&gt;
 *     &lt;enumeration value="be"/&gt;
 *     &lt;enumeration value="bg"/&gt;
 *     &lt;enumeration value="bh"/&gt;
 *     &lt;enumeration value="bi"/&gt;
 *     &lt;enumeration value="bn"/&gt;
 *     &lt;enumeration value="bo"/&gt;
 *     &lt;enumeration value="br"/&gt;
 *     &lt;enumeration value="ca"/&gt;
 *     &lt;enumeration value="co"/&gt;
 *     &lt;enumeration value="cs"/&gt;
 *     &lt;enumeration value="cy"/&gt;
 *     &lt;enumeration value="da"/&gt;
 *     &lt;enumeration value="de"/&gt;
 *     &lt;enumeration value="dz"/&gt;
 *     &lt;enumeration value="el"/&gt;
 *     &lt;enumeration value="en"/&gt;
 *     &lt;enumeration value="es"/&gt;
 *     &lt;enumeration value="et"/&gt;
 *     &lt;enumeration value="eu"/&gt;
 *     &lt;enumeration value="fa"/&gt;
 *     &lt;enumeration value="fi"/&gt;
 *     &lt;enumeration value="fj"/&gt;
 *     &lt;enumeration value="fo"/&gt;
 *     &lt;enumeration value="fr"/&gt;
 *     &lt;enumeration value="fy"/&gt;
 *     &lt;enumeration value="ga"/&gt;
 *     &lt;enumeration value="gd"/&gt;
 *     &lt;enumeration value="gl"/&gt;
 *     &lt;enumeration value="gn"/&gt;
 *     &lt;enumeration value="gu"/&gt;
 *     &lt;enumeration value="ha"/&gt;
 *     &lt;enumeration value="hi"/&gt;
 *     &lt;enumeration value="hr"/&gt;
 *     &lt;enumeration value="hu"/&gt;
 *     &lt;enumeration value="hy"/&gt;
 *     &lt;enumeration value="ik"/&gt;
 *     &lt;enumeration value="in"/&gt;
 *     &lt;enumeration value="is"/&gt;
 *     &lt;enumeration value="it"/&gt;
 *     &lt;enumeration value="iw"/&gt;
 *     &lt;enumeration value="ja"/&gt;
 *     &lt;enumeration value="ji"/&gt;
 *     &lt;enumeration value="jw"/&gt;
 *     &lt;enumeration value="ka"/&gt;
 *     &lt;enumeration value="kk"/&gt;
 *     &lt;enumeration value="kl"/&gt;
 *     &lt;enumeration value="km"/&gt;
 *     &lt;enumeration value="kn"/&gt;
 *     &lt;enumeration value="ko"/&gt;
 *     &lt;enumeration value="ks"/&gt;
 *     &lt;enumeration value="ku"/&gt;
 *     &lt;enumeration value="ky"/&gt;
 *     &lt;enumeration value="la"/&gt;
 *     &lt;enumeration value="ln"/&gt;
 *     &lt;enumeration value="lo"/&gt;
 *     &lt;enumeration value="lt"/&gt;
 *     &lt;enumeration value="lv"/&gt;
 *     &lt;enumeration value="mg"/&gt;
 *     &lt;enumeration value="mi"/&gt;
 *     &lt;enumeration value="mk"/&gt;
 *     &lt;enumeration value="ml"/&gt;
 *     &lt;enumeration value="mn"/&gt;
 *     &lt;enumeration value="mo"/&gt;
 *     &lt;enumeration value="mr"/&gt;
 *     &lt;enumeration value="ms"/&gt;
 *     &lt;enumeration value="mt"/&gt;
 *     &lt;enumeration value="my"/&gt;
 *     &lt;enumeration value="na"/&gt;
 *     &lt;enumeration value="ne"/&gt;
 *     &lt;enumeration value="nl"/&gt;
 *     &lt;enumeration value="no"/&gt;
 *     &lt;enumeration value="oc"/&gt;
 *     &lt;enumeration value="om"/&gt;
 *     &lt;enumeration value="or"/&gt;
 *     &lt;enumeration value="pa"/&gt;
 *     &lt;enumeration value="pl"/&gt;
 *     &lt;enumeration value="ps"/&gt;
 *     &lt;enumeration value="pt"/&gt;
 *     &lt;enumeration value="qu"/&gt;
 *     &lt;enumeration value="rm"/&gt;
 *     &lt;enumeration value="rn"/&gt;
 *     &lt;enumeration value="ro"/&gt;
 *     &lt;enumeration value="ru"/&gt;
 *     &lt;enumeration value="rw"/&gt;
 *     &lt;enumeration value="sa"/&gt;
 *     &lt;enumeration value="sd"/&gt;
 *     &lt;enumeration value="sg"/&gt;
 *     &lt;enumeration value="sh"/&gt;
 *     &lt;enumeration value="si"/&gt;
 *     &lt;enumeration value="sk"/&gt;
 *     &lt;enumeration value="sl"/&gt;
 *     &lt;enumeration value="sm"/&gt;
 *     &lt;enumeration value="sn"/&gt;
 *     &lt;enumeration value="so"/&gt;
 *     &lt;enumeration value="sq"/&gt;
 *     &lt;enumeration value="sr"/&gt;
 *     &lt;enumeration value="ss"/&gt;
 *     &lt;enumeration value="st"/&gt;
 *     &lt;enumeration value="su"/&gt;
 *     &lt;enumeration value="sv"/&gt;
 *     &lt;enumeration value="sw"/&gt;
 *     &lt;enumeration value="ta"/&gt;
 *     &lt;enumeration value="te"/&gt;
 *     &lt;enumeration value="tg"/&gt;
 *     &lt;enumeration value="th"/&gt;
 *     &lt;enumeration value="ti"/&gt;
 *     &lt;enumeration value="tk"/&gt;
 *     &lt;enumeration value="tl"/&gt;
 *     &lt;enumeration value="tn"/&gt;
 *     &lt;enumeration value="to"/&gt;
 *     &lt;enumeration value="tr"/&gt;
 *     &lt;enumeration value="ts"/&gt;
 *     &lt;enumeration value="tt"/&gt;
 *     &lt;enumeration value="tw"/&gt;
 *     &lt;enumeration value="uk"/&gt;
 *     &lt;enumeration value="ur"/&gt;
 *     &lt;enumeration value="uz"/&gt;
 *     &lt;enumeration value="vi"/&gt;
 *     &lt;enumeration value="wo"/&gt;
 *     &lt;enumeration value="xh"/&gt;
 *     &lt;enumeration value="yo"/&gt;
 *     &lt;enumeration value="zh"/&gt;
 *     &lt;enumeration value="zu"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LanguageCodeList")
@XmlEnum
public enum LanguageCodeList {

    @XmlEnumValue("en-US")
    EN_US("en-US"),
    @XmlEnumValue("en-CA")
    EN_CA("en-CA"),
    @XmlEnumValue("aa-ET")
    AA_ET("aa-ET"),
    @XmlEnumValue("ab-GE")
    AB_GE("ab-GE"),
    @XmlEnumValue("af-ZA")
    AF_ZA("af-ZA"),
    @XmlEnumValue("am-ET")
    AM_ET("am-ET"),
    @XmlEnumValue("ar-SA")
    AR_SA("ar-SA"),
    @XmlEnumValue("as-IN")
    AS_IN("as-IN"),
    @XmlEnumValue("ay-BO")
    AY_BO("ay-BO"),
    @XmlEnumValue("az-AZ")
    AZ_AZ("az-AZ"),
    @XmlEnumValue("ba-RU")
    BA_RU("ba-RU"),
    @XmlEnumValue("be-BY")
    BE_BY("be-BY"),
    @XmlEnumValue("bg-BG")
    BG_BG("bg-BG"),
    @XmlEnumValue("bh-IN")
    BH_IN("bh-IN"),
    @XmlEnumValue("bi-VU")
    BI_VU("bi-VU"),
    @XmlEnumValue("bn-BD")
    BN_BD("bn-BD"),
    @XmlEnumValue("bo-BT")
    BO_BT("bo-BT"),
    @XmlEnumValue("br-FR")
    BR_FR("br-FR"),
    @XmlEnumValue("ca-ES")
    CA_ES("ca-ES"),
    @XmlEnumValue("co-FR")
    CO_FR("co-FR"),
    @XmlEnumValue("cs-CZ")
    CS_CZ("cs-CZ"),
    @XmlEnumValue("cy-GB")
    CY_GB("cy-GB"),
    @XmlEnumValue("da-DE")
    DA_DE("da-DE"),
    @XmlEnumValue("de-DE")
    DE_DE("de-DE"),
    @XmlEnumValue("dz-BT")
    DZ_BT("dz-BT"),
    @XmlEnumValue("el-GR")
    EL_GR("el-GR"),
    @XmlEnumValue("es-ES")
    ES_ES("es-ES"),
    @XmlEnumValue("et-EE")
    ET_EE("et-EE"),
    @XmlEnumValue("eu-ES")
    EU_ES("eu-ES"),
    @XmlEnumValue("fa-AF")
    FA_AF("fa-AF"),
    @XmlEnumValue("fi-FI")
    FI_FI("fi-FI"),
    @XmlEnumValue("fj-FJ")
    FJ_FJ("fj-FJ"),
    @XmlEnumValue("fo-FO")
    FO_FO("fo-FO"),
    @XmlEnumValue("fr-CA")
    FR_CA("fr-CA"),
    @XmlEnumValue("fr-FR")
    FR_FR("fr-FR"),
    @XmlEnumValue("fy-NL")
    FY_NL("fy-NL"),
    @XmlEnumValue("ga-IE")
    GA_IE("ga-IE"),
    @XmlEnumValue("gd-GB")
    GD_GB("gd-GB"),
    @XmlEnumValue("gl-ES")
    GL_ES("gl-ES"),
    @XmlEnumValue("gn-PY")
    GN_PY("gn-PY"),
    @XmlEnumValue("gu-IN")
    GU_IN("gu-IN"),
    @XmlEnumValue("ha-NG")
    HA_NG("ha-NG"),
    @XmlEnumValue("hi-IN")
    HI_IN("hi-IN"),
    @XmlEnumValue("hr-HR")
    HR_HR("hr-HR"),
    @XmlEnumValue("hu-HU")
    HU_HU("hu-HU"),
    @XmlEnumValue("hy-AM")
    HY_AM("hy-AM"),
    @XmlEnumValue("ik-GL")
    IK_GL("ik-GL"),
    @XmlEnumValue("in-ID")
    IN_ID("in-ID"),
    @XmlEnumValue("is-IS")
    IS_IS("is-IS"),
    @XmlEnumValue("it-IT")
    IT_IT("it-IT"),
    @XmlEnumValue("iw-IL")
    IW_IL("iw-IL"),
    @XmlEnumValue("ja-JP")
    JA_JP("ja-JP"),
    @XmlEnumValue("ji-IL")
    JI_IL("ji-IL"),
    @XmlEnumValue("jw-ID")
    JW_ID("jw-ID"),
    @XmlEnumValue("ka-GE")
    KA_GE("ka-GE"),
    @XmlEnumValue("kk-KZ")
    KK_KZ("kk-KZ"),
    @XmlEnumValue("kl-GL")
    KL_GL("kl-GL"),
    @XmlEnumValue("km-KH")
    KM_KH("km-KH"),
    @XmlEnumValue("kn-IN")
    KN_IN("kn-IN"),
    @XmlEnumValue("ko-KP")
    KO_KP("ko-KP"),
    @XmlEnumValue("ko-KR")
    KO_KR("ko-KR"),
    @XmlEnumValue("ks-IN")
    KS_IN("ks-IN"),
    @XmlEnumValue("ku-IQ")
    KU_IQ("ku-IQ"),
    @XmlEnumValue("ky-CN")
    KY_CN("ky-CN"),
    @XmlEnumValue("la-VA")
    LA_VA("la-VA"),
    @XmlEnumValue("ln-CD")
    LN_CD("ln-CD"),
    @XmlEnumValue("lo-LA")
    LO_LA("lo-LA"),
    @XmlEnumValue("lt-LT")
    LT_LT("lt-LT"),
    @XmlEnumValue("lv-LV")
    LV_LV("lv-LV"),
    @XmlEnumValue("mg-MG")
    MG_MG("mg-MG"),
    @XmlEnumValue("mi-NZ")
    MI_NZ("mi-NZ"),
    @XmlEnumValue("mk-MK")
    MK_MK("mk-MK"),
    @XmlEnumValue("ml-IN")
    ML_IN("ml-IN"),
    @XmlEnumValue("mn-MN")
    MN_MN("mn-MN"),
    @XmlEnumValue("mo-MO")
    MO_MO("mo-MO"),
    @XmlEnumValue("mr-IN")
    MR_IN("mr-IN"),
    @XmlEnumValue("ms-MY")
    MS_MY("ms-MY"),
    @XmlEnumValue("mt-MH")
    MT_MH("mt-MH"),
    @XmlEnumValue("my-MM")
    MY_MM("my-MM"),
    @XmlEnumValue("na-NR")
    NA_NR("na-NR"),
    @XmlEnumValue("ne-NP")
    NE_NP("ne-NP"),
    @XmlEnumValue("nl-NL")
    NL_NL("nl-NL"),
    @XmlEnumValue("no-NO")
    NO_NO("no-NO"),
    @XmlEnumValue("oc-FR")
    OC_FR("oc-FR"),
    @XmlEnumValue("om-ET")
    OM_ET("om-ET"),
    @XmlEnumValue("or-IN")
    OR_IN("or-IN"),
    @XmlEnumValue("pa-IN")
    PA_IN("pa-IN"),
    @XmlEnumValue("pl-PL")
    PL_PL("pl-PL"),
    @XmlEnumValue("ps-PK")
    PS_PK("ps-PK"),
    @XmlEnumValue("pt-PT")
    PT_PT("pt-PT"),
    @XmlEnumValue("qu-PE")
    QU_PE("qu-PE"),
    @XmlEnumValue("rm-CH")
    RM_CH("rm-CH"),
    @XmlEnumValue("rn-BI")
    RN_BI("rn-BI"),
    @XmlEnumValue("ro-RO")
    RO_RO("ro-RO"),
    @XmlEnumValue("ru-RU")
    RU_RU("ru-RU"),
    @XmlEnumValue("rw-RW")
    RW_RW("rw-RW"),
    @XmlEnumValue("sa-IN")
    SA_IN("sa-IN"),
    @XmlEnumValue("sd-PK")
    SD_PK("sd-PK"),
    @XmlEnumValue("sg-CF")
    SG_CF("sg-CF"),
    @XmlEnumValue("sh-HR")
    SH_HR("sh-HR"),
    @XmlEnumValue("si-LK")
    SI_LK("si-LK"),
    @XmlEnumValue("sk-SK")
    SK_SK("sk-SK"),
    @XmlEnumValue("sl-SI")
    SL_SI("sl-SI"),
    @XmlEnumValue("sm-WS")
    SM_WS("sm-WS"),
    @XmlEnumValue("sn-ZW")
    SN_ZW("sn-ZW"),
    @XmlEnumValue("so-SO")
    SO_SO("so-SO"),
    @XmlEnumValue("sq-AL")
    SQ_AL("sq-AL"),
    @XmlEnumValue("sr-CS")
    SR_CS("sr-CS"),
    @XmlEnumValue("ss-ZA")
    SS_ZA("ss-ZA"),
    @XmlEnumValue("st-ZA")
    ST_ZA("st-ZA"),
    @XmlEnumValue("su-SD")
    SU_SD("su-SD"),
    @XmlEnumValue("sv-SE")
    SV_SE("sv-SE"),
    @XmlEnumValue("sw-TL")
    SW_TL("sw-TL"),
    @XmlEnumValue("ta-IN")
    TA_IN("ta-IN"),
    @XmlEnumValue("te-IN")
    TE_IN("te-IN"),
    @XmlEnumValue("tg-TJ")
    TG_TJ("tg-TJ"),
    @XmlEnumValue("th-TH")
    TH_TH("th-TH"),
    @XmlEnumValue("ti-ET")
    TI_ET("ti-ET"),
    @XmlEnumValue("tk-TM")
    TK_TM("tk-TM"),
    @XmlEnumValue("tl-PH")
    TL_PH("tl-PH"),
    @XmlEnumValue("tn-ZA")
    TN_ZA("tn-ZA"),
    @XmlEnumValue("to-TO")
    TO_TO("to-TO"),
    @XmlEnumValue("tr-TR")
    TR_TR("tr-TR"),
    @XmlEnumValue("ts-ZA")
    TS_ZA("ts-ZA"),
    @XmlEnumValue("tt-RU")
    TT_RU("tt-RU"),
    @XmlEnumValue("tw-GH")
    TW_GH("tw-GH"),
    @XmlEnumValue("uk-UA")
    UK_UA("uk-UA"),
    @XmlEnumValue("ur-PK")
    UR_PK("ur-PK"),
    @XmlEnumValue("uz-UZ")
    UZ_UZ("uz-UZ"),
    @XmlEnumValue("vi-VN")
    VI_VN("vi-VN"),
    @XmlEnumValue("wo-SN")
    WO_SN("wo-SN"),
    @XmlEnumValue("xh-ZA")
    XH_ZA("xh-ZA"),
    @XmlEnumValue("yo-NG")
    YO_NG("yo-NG"),
    @XmlEnumValue("zh-CN")
    ZH_CN("zh-CN"),
    @XmlEnumValue("zu-ZA")
    ZU_ZA("zu-ZA"),
    @XmlEnumValue("aa")
    AA("aa"),
    @XmlEnumValue("ab")
    AB("ab"),
    @XmlEnumValue("af")
    AF("af"),
    @XmlEnumValue("am")
    AM("am"),
    @XmlEnumValue("ar")
    AR("ar"),
    @XmlEnumValue("as")
    AS("as"),
    @XmlEnumValue("ay")
    AY("ay"),
    @XmlEnumValue("az")
    AZ("az"),
    @XmlEnumValue("ba")
    BA("ba"),
    @XmlEnumValue("be")
    BE("be"),
    @XmlEnumValue("bg")
    BG("bg"),
    @XmlEnumValue("bh")
    BH("bh"),
    @XmlEnumValue("bi")
    BI("bi"),
    @XmlEnumValue("bn")
    BN("bn"),
    @XmlEnumValue("bo")
    BO("bo"),
    @XmlEnumValue("br")
    BR("br"),
    @XmlEnumValue("ca")
    CA("ca"),
    @XmlEnumValue("co")
    CO("co"),
    @XmlEnumValue("cs")
    CS("cs"),
    @XmlEnumValue("cy")
    CY("cy"),
    @XmlEnumValue("da")
    DA("da"),
    @XmlEnumValue("de")
    DE("de"),
    @XmlEnumValue("dz")
    DZ("dz"),
    @XmlEnumValue("el")
    EL("el"),
    @XmlEnumValue("en")
    EN("en"),
    @XmlEnumValue("es")
    ES("es"),
    @XmlEnumValue("et")
    ET("et"),
    @XmlEnumValue("eu")
    EU("eu"),
    @XmlEnumValue("fa")
    FA("fa"),
    @XmlEnumValue("fi")
    FI("fi"),
    @XmlEnumValue("fj")
    FJ("fj"),
    @XmlEnumValue("fo")
    FO("fo"),
    @XmlEnumValue("fr")
    FR("fr"),
    @XmlEnumValue("fy")
    FY("fy"),
    @XmlEnumValue("ga")
    GA("ga"),
    @XmlEnumValue("gd")
    GD("gd"),
    @XmlEnumValue("gl")
    GL("gl"),
    @XmlEnumValue("gn")
    GN("gn"),
    @XmlEnumValue("gu")
    GU("gu"),
    @XmlEnumValue("ha")
    HA("ha"),
    @XmlEnumValue("hi")
    HI("hi"),
    @XmlEnumValue("hr")
    HR("hr"),
    @XmlEnumValue("hu")
    HU("hu"),
    @XmlEnumValue("hy")
    HY("hy"),
    @XmlEnumValue("ik")
    IK("ik"),
    @XmlEnumValue("in")
    IN("in"),
    @XmlEnumValue("is")
    IS("is"),
    @XmlEnumValue("it")
    IT("it"),
    @XmlEnumValue("iw")
    IW("iw"),
    @XmlEnumValue("ja")
    JA("ja"),
    @XmlEnumValue("ji")
    JI("ji"),
    @XmlEnumValue("jw")
    JW("jw"),
    @XmlEnumValue("ka")
    KA("ka"),
    @XmlEnumValue("kk")
    KK("kk"),
    @XmlEnumValue("kl")
    KL("kl"),
    @XmlEnumValue("km")
    KM("km"),
    @XmlEnumValue("kn")
    KN("kn"),
    @XmlEnumValue("ko")
    KO("ko"),
    @XmlEnumValue("ks")
    KS("ks"),
    @XmlEnumValue("ku")
    KU("ku"),
    @XmlEnumValue("ky")
    KY("ky"),
    @XmlEnumValue("la")
    LA("la"),
    @XmlEnumValue("ln")
    LN("ln"),
    @XmlEnumValue("lo")
    LO("lo"),
    @XmlEnumValue("lt")
    LT("lt"),
    @XmlEnumValue("lv")
    LV("lv"),
    @XmlEnumValue("mg")
    MG("mg"),
    @XmlEnumValue("mi")
    MI("mi"),
    @XmlEnumValue("mk")
    MK("mk"),
    @XmlEnumValue("ml")
    ML("ml"),
    @XmlEnumValue("mn")
    MN("mn"),
    @XmlEnumValue("mo")
    MO("mo"),
    @XmlEnumValue("mr")
    MR("mr"),
    @XmlEnumValue("ms")
    MS("ms"),
    @XmlEnumValue("mt")
    MT("mt"),
    @XmlEnumValue("my")
    MY("my"),
    @XmlEnumValue("na")
    NA("na"),
    @XmlEnumValue("ne")
    NE("ne"),
    @XmlEnumValue("nl")
    NL("nl"),
    @XmlEnumValue("no")
    NO("no"),
    @XmlEnumValue("oc")
    OC("oc"),
    @XmlEnumValue("om")
    OM("om"),
    @XmlEnumValue("or")
    OR("or"),
    @XmlEnumValue("pa")
    PA("pa"),
    @XmlEnumValue("pl")
    PL("pl"),
    @XmlEnumValue("ps")
    PS("ps"),
    @XmlEnumValue("pt")
    PT("pt"),
    @XmlEnumValue("qu")
    QU("qu"),
    @XmlEnumValue("rm")
    RM("rm"),
    @XmlEnumValue("rn")
    RN("rn"),
    @XmlEnumValue("ro")
    RO("ro"),
    @XmlEnumValue("ru")
    RU("ru"),
    @XmlEnumValue("rw")
    RW("rw"),
    @XmlEnumValue("sa")
    SA("sa"),
    @XmlEnumValue("sd")
    SD("sd"),
    @XmlEnumValue("sg")
    SG("sg"),
    @XmlEnumValue("sh")
    SH("sh"),
    @XmlEnumValue("si")
    SI("si"),
    @XmlEnumValue("sk")
    SK("sk"),
    @XmlEnumValue("sl")
    SL("sl"),
    @XmlEnumValue("sm")
    SM("sm"),
    @XmlEnumValue("sn")
    SN("sn"),
    @XmlEnumValue("so")
    SO("so"),
    @XmlEnumValue("sq")
    SQ("sq"),
    @XmlEnumValue("sr")
    SR("sr"),
    @XmlEnumValue("ss")
    SS("ss"),
    @XmlEnumValue("st")
    ST("st"),
    @XmlEnumValue("su")
    SU("su"),
    @XmlEnumValue("sv")
    SV("sv"),
    @XmlEnumValue("sw")
    SW("sw"),
    @XmlEnumValue("ta")
    TA("ta"),
    @XmlEnumValue("te")
    TE("te"),
    @XmlEnumValue("tg")
    TG("tg"),
    @XmlEnumValue("th")
    TH("th"),
    @XmlEnumValue("ti")
    TI("ti"),
    @XmlEnumValue("tk")
    TK("tk"),
    @XmlEnumValue("tl")
    TL("tl"),
    @XmlEnumValue("tn")
    TN("tn"),
    @XmlEnumValue("to")
    TO("to"),
    @XmlEnumValue("tr")
    TR("tr"),
    @XmlEnumValue("ts")
    TS("ts"),
    @XmlEnumValue("tt")
    TT("tt"),
    @XmlEnumValue("tw")
    TW("tw"),
    @XmlEnumValue("uk")
    UK("uk"),
    @XmlEnumValue("ur")
    UR("ur"),
    @XmlEnumValue("uz")
    UZ("uz"),
    @XmlEnumValue("vi")
    VI("vi"),
    @XmlEnumValue("wo")
    WO("wo"),
    @XmlEnumValue("xh")
    XH("xh"),
    @XmlEnumValue("yo")
    YO("yo"),
    @XmlEnumValue("zh")
    ZH("zh"),
    @XmlEnumValue("zu")
    ZU("zu");
    private final String value;

    LanguageCodeList(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageCodeList fromValue(String v) {
        for (LanguageCodeList c: LanguageCodeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
