//package samochody;
//
//public class carsCalculator {
//
//
//
//
//    public static int calculateValue(Brand marka, GearBoxType skrzynia, RodzajPaliwa rodzajPaliwa, Kolor kolor, EquipmentStandard standardWyposazenia) {
//        if (marka == Brand.ALFA_ROMEO) {
//            if (skrzynia == GearBoxType.AUTOMATYCZNA) {
//                if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.ALFA_ROMEO.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.VIP) {
//                            return Brand.ALFA_ROMEO.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.VIP.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.ALFA_ROMEO.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return 3000 + Brand.ALFA_ROMEO.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.ALFA_ROMEO.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.ALFA_ROMEO.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.ALFA_ROMEO.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc();
//                        }
//                    }
//                } else if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.ALFA_ROMEO.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.VIP) {
//                            return Brand.ALFA_ROMEO.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.VIP.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.ALFA_ROMEO.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return 3000 + Brand.ALFA_ROMEO.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZERWONY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.ALFA_ROMEO.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.ALFA_ROMEO.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.ALFA_ROMEO.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc();
//                        }
//                    }
//                }
//            } else if (skrzynia == GearBoxType.MANUALNA) {
//                if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.ALFA_ROMEO.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.VIP) {
//                            return Brand.ALFA_ROMEO.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.VIP.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.ALFA_ROMEO.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return 3000 + Brand.ALFA_ROMEO.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.ALFA_ROMEO.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.ALFA_ROMEO.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.ALFA_ROMEO.getWartosc() + RodzajPaliwa.DIESEL.getWartosc();
//                        }
//                    }
//                } else if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.ALFA_ROMEO.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.VIP) {
//                            return Brand.ALFA_ROMEO.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.VIP.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.ALFA_ROMEO.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return 3000 + Brand.ALFA_ROMEO.getWartosc() + Kolor.CZERWONY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.ALFA_ROMEO.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.ALFA_ROMEO.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.ALFA_ROMEO.getWartosc();
//                        }
//                    }
//                }
//            }
//
//        } else if (marka == Brand.AUDI) {
//            if (skrzynia == GearBoxType.AUTOMATYCZNA) {
//                if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.AUDI.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.VIP) {
//                            return Brand.AUDI.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.VIP.getWartosc();
//                        }
//                    }
//                }
//            } else if (skrzynia == GearBoxType.MANUALNA) {
//                if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.AUDI.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.VIP) {
//                            return Brand.AUDI.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.VIP.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return 3000 + Brand.AUDI.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.AUDI.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        }
//                    }
//                } else if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.AUDI.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.VIP) {
//                            return Brand.AUDI.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.VIP.getWartosc();
//                        } else if (kolor == Kolor.CZERWONY) {
//                            if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                                return 3000 + Brand.AUDI.getWartosc() + Kolor.CZERWONY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                            } else if (kolor == Kolor.BIALY) {
//                                if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                                    return Brand.AUDI.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                                }
//                            }
//                        }
//                    }
//                }
//
//            }
//        } else if (marka == Brand.BMW) {
//            if (skrzynia == GearBoxType.AUTOMATYCZNA) {
//                if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.BMW.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.VIP) {
//                            return Brand.BMW.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.VIP.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.BMW.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return 3000 + Brand.BMW.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.BMW.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.BMW.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.BMW.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc();
//                        }
//                    }
//                } else if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.BMW.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.VIP) {
//                            return Brand.BMW.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.VIP.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.BMW.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return 3000 + Brand.BMW.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZERWONY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.BMW.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.BMW.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.BMW.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc();
//                        }
//                    }
//                }
//            } else if (skrzynia == GearBoxType.MANUALNA) {
//                if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.BMW.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.VIP) {
//                            return Brand.BMW.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.VIP.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.BMW.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return 3000 + Brand.BMW.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.BMW.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.BMW.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.BMW.getWartosc() + RodzajPaliwa.DIESEL.getWartosc();
//                        }
//                    }
//                } else if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.BMW.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.VIP) {
//                            return Brand.BMW.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.VIP.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.BMW.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return 3000 + Brand.BMW.getWartosc() + Kolor.CZERWONY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.BMW.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.BMW.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.BMW.getWartosc();
//                        }
//                    }
//                }
//            }
//
//        } else if (marka == Brand.CITROEN) {
//            if (skrzynia == GearBoxType.AUTOMATYCZNA) {
//                if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.CITROEN.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.VIP) {
//                            return Brand.CITROEN.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.VIP.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.CITROEN.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return 3000 + Brand.CITROEN.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.CITROEN.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.CITROEN.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.CITROEN.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc();
//                        }
//                    }
//                } else if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.CITROEN.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.VIP) {
//                            return Brand.CITROEN.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.VIP.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.CITROEN.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return 3000 + Brand.CITROEN.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZERWONY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.CITROEN.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.CITROEN.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.CITROEN.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc();
//                        }
//                    }
//                }
//            } else if (skrzynia == GearBoxType.MANUALNA) {
//                if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.CITROEN.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.VIP) {
//                            return Brand.CITROEN.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.VIP.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.CITROEN.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return 3000 + Brand.CITROEN.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.CITROEN.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.CITROEN.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.CITROEN.getWartosc() + RodzajPaliwa.DIESEL.getWartosc();
//                        }
//                    }
//                } else if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.CITROEN.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.VIP) {
//                            return Brand.CITROEN.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.VIP.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.CITROEN.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return 3000 + Brand.CITROEN.getWartosc() + Kolor.CZERWONY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.CITROEN.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.CITROEN.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.CITROEN.getWartosc();
//                        }
//                    }
//                }
//            }
//        } else if (marka == Brand.FIAT) {
//            if (skrzynia == GearBoxType.AUTOMATYCZNA) {
//                if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.ALFA_ROMEO.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.VIP) {
//                            return Brand.ALFA_ROMEO.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.VIP.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.ALFA_ROMEO.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return 3000 + Brand.ALFA_ROMEO.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZERWONY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.ALFA_ROMEO.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.ALFA_ROMEO.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.ALFA_ROMEO.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc();
//                        }
//                    }
//                } else if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    System.out.println("Nie ma fiata w wersji Diesel");
//                }
//            }
//        } else if (skrzynia == GearBoxType.MANUALNA) {
//            if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                if (kolor == Kolor.CZARNY) {
//                    if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                        return Brand.ALFA_ROMEO.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                    } else if (standardWyposazenia == EquipmentStandard.VIP) {
//                        return Brand.ALFA_ROMEO.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.VIP.getWartosc();
//                    } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                        return Brand.ALFA_ROMEO.getWartosc() + Kolor.CZARNY.getWartosc();
//                    }
//                } else if (kolor == Kolor.CZERWONY) {
//                    if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                        return 3000 + Brand.ALFA_ROMEO.getWartosc() + Kolor.CZERWONY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                    } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                        return Brand.ALFA_ROMEO.getWartosc() + Kolor.CZERWONY.getWartosc();
//                    }
//                } else if (kolor == Kolor.BIALY) {
//                    if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                        return Brand.ALFA_ROMEO.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                    } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                        return Brand.ALFA_ROMEO.getWartosc();
//                    }
//                }
//            } else if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                System.out.println("Nie ma fiata w wersji Diesel");
//            }
//
//        } else if (marka == Brand.SKODA) {
//            if (skrzynia == GearBoxType.AUTOMATYCZNA) {
//                if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.SKODA.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.VIP) {
//                            return Brand.SKODA.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.VIP.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.SKODA.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return 3000 + Brand.SKODA.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.SKODA.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.SKODA.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.SKODA.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc();
//                        }
//                    }
//                } else if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.SKODA.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.VIP) {
//                            return Brand.SKODA.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.VIP.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.SKODA.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return 3000 + Brand.SKODA.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZERWONY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.SKODA.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.SKODA.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.SKODA.getWartosc() + GearBoxType.AUTOMATYCZNA.getWartosc();
//                        }
//                    }
//                }
//            } else if (skrzynia == GearBoxType.MANUALNA) {
//                if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.SKODA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.VIP) {
//                            return Brand.SKODA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.VIP.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.SKODA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return 3000 + Brand.SKODA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.SKODA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.SKODA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.SKODA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc();
//                        }
//                    }
//                } else if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.SKODA.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.VIP) {
//                            return Brand.SKODA.getWartosc() + Kolor.CZARNY.getWartosc() + EquipmentStandard.VIP.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.SKODA.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return 3000 + Brand.SKODA.getWartosc() + Kolor.CZERWONY.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.SKODA.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == EquipmentStandard.PREMIUM) {
//                            return Brand.SKODA.getWartosc() + EquipmentStandard.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == EquipmentStandard.BASIC) {
//                            return Brand.SKODA.getWartosc();
//                        }
//                    }
//                }
//            }
//        }
//    } else {
//        System.out.println("Nie ma takiej marki");
//    }
//}
//
//
//
