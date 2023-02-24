package de.rpicloud.ipv64net

enum class LaunchScreens {
    LOGIN , MAIN, BIOMETRIC
}

enum class StatusType(val type: StatusTypeClass) {
    Active(StatusTypeClass(1, "Aktiv", R.drawable.round_check_circle_outline_24, R.color.ipv64_error_green)),
    Pause(StatusTypeClass(2, "Pause", R.drawable.round_pause_circle_outline_24, R.color.ipv64_teal)),
    Warning(StatusTypeClass(3, "Warnung", R.drawable.round_report_problem_24, R.color.ipv64_error_orange)),
    Alarm(StatusTypeClass(4, "Alarm",  R.drawable.round_notifications_active_24, R.color.ipv64_red))
}

enum class ConsumptionType(val CType: Int) {
    Gas(1),
    Strom(2),
    Kaltwasser(3),
    Warmwasser(4),
    Muell(5);
}

enum class ConsumptionUnit(val Unit: String) {
    KubikUnit("m³"),
    StromUnit("kWh"),
    MuellUnit("x" );
}