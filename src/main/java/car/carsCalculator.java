//package samochody;
//
//public class carsCalculator {
//
//
//
//
//    public static int calculateValue(Marka marka, Skrzynia skrzynia, RodzajPaliwa rodzajPaliwa, Kolor kolor, StandardWyposazenia standardWyposazenia) {
//        if (marka == Marka.ALFA_ROMEO) {
//            if (skrzynia == Skrzynia.AUTOMATYCZNA) {
//                if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.VIP) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.VIP.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return 3000 + Marka.ALFA_ROMEO.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc();
//                        }
//                    }
//                } else if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.VIP) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.VIP.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return 3000 + Marka.ALFA_ROMEO.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZERWONY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc();
//                        }
//                    }
//                }
//            } else if (skrzynia == Skrzynia.MANUALNA) {
//                if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.ALFA_ROMEO.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.VIP) {
//                            return Marka.ALFA_ROMEO.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.VIP.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.ALFA_ROMEO.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return 3000 + Marka.ALFA_ROMEO.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.ALFA_ROMEO.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.ALFA_ROMEO.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.ALFA_ROMEO.getWartosc() + RodzajPaliwa.DIESEL.getWartosc();
//                        }
//                    }
//                } else if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.VIP) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.VIP.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return 3000 + Marka.ALFA_ROMEO.getWartosc() + Kolor.CZERWONY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.ALFA_ROMEO.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.ALFA_ROMEO.getWartosc();
//                        }
//                    }
//                }
//            }
//
//        } else if (marka == Marka.AUDI) {
//            if (skrzynia == Skrzynia.AUTOMATYCZNA) {
//                if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.AUDI.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.VIP) {
//                            return Marka.AUDI.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.VIP.getWartosc();
//                        }
//                    }
//                }
//            } else if (skrzynia == Skrzynia.MANUALNA) {
//                if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.AUDI.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.VIP) {
//                            return Marka.AUDI.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.VIP.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return 3000 + Marka.AUDI.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.AUDI.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        }
//                    }
//                } else if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.AUDI.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.VIP) {
//                            return Marka.AUDI.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.VIP.getWartosc();
//                        } else if (kolor == Kolor.CZERWONY) {
//                            if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                                return 3000 + Marka.AUDI.getWartosc() + Kolor.CZERWONY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                            } else if (kolor == Kolor.BIALY) {
//                                if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                                    return Marka.AUDI.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                                }
//                            }
//                        }
//                    }
//                }
//
//            }
//        } else if (marka == Marka.BMW) {
//            if (skrzynia == Skrzynia.AUTOMATYCZNA) {
//                if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.BMW.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.VIP) {
//                            return Marka.BMW.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.VIP.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.BMW.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return 3000 + Marka.BMW.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.BMW.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.BMW.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.BMW.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc();
//                        }
//                    }
//                } else if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.BMW.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.VIP) {
//                            return Marka.BMW.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.VIP.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.BMW.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return 3000 + Marka.BMW.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZERWONY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.BMW.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.BMW.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.BMW.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc();
//                        }
//                    }
//                }
//            } else if (skrzynia == Skrzynia.MANUALNA) {
//                if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.BMW.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.VIP) {
//                            return Marka.BMW.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.VIP.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.BMW.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return 3000 + Marka.BMW.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.BMW.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.BMW.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.BMW.getWartosc() + RodzajPaliwa.DIESEL.getWartosc();
//                        }
//                    }
//                } else if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.BMW.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.VIP) {
//                            return Marka.BMW.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.VIP.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.BMW.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return 3000 + Marka.BMW.getWartosc() + Kolor.CZERWONY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.BMW.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.BMW.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.BMW.getWartosc();
//                        }
//                    }
//                }
//            }
//
//        } else if (marka == Marka.CITROEN) {
//            if (skrzynia == Skrzynia.AUTOMATYCZNA) {
//                if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.CITROEN.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.VIP) {
//                            return Marka.CITROEN.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.VIP.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.CITROEN.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return 3000 + Marka.CITROEN.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.CITROEN.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.CITROEN.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.CITROEN.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc();
//                        }
//                    }
//                } else if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.CITROEN.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.VIP) {
//                            return Marka.CITROEN.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.VIP.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.CITROEN.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return 3000 + Marka.CITROEN.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZERWONY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.CITROEN.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.CITROEN.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.CITROEN.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc();
//                        }
//                    }
//                }
//            } else if (skrzynia == Skrzynia.MANUALNA) {
//                if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.CITROEN.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.VIP) {
//                            return Marka.CITROEN.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.VIP.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.CITROEN.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return 3000 + Marka.CITROEN.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.CITROEN.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.CITROEN.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.CITROEN.getWartosc() + RodzajPaliwa.DIESEL.getWartosc();
//                        }
//                    }
//                } else if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.CITROEN.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.VIP) {
//                            return Marka.CITROEN.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.VIP.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.CITROEN.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return 3000 + Marka.CITROEN.getWartosc() + Kolor.CZERWONY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.CITROEN.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.CITROEN.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.CITROEN.getWartosc();
//                        }
//                    }
//                }
//            }
//        } else if (marka == Marka.FIAT) {
//            if (skrzynia == Skrzynia.AUTOMATYCZNA) {
//                if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.VIP) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.VIP.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return 3000 + Marka.ALFA_ROMEO.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZERWONY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.ALFA_ROMEO.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc();
//                        }
//                    }
//                } else if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    System.out.println("Nie ma fiata w wersji Diesel");
//                }
//            }
//        } else if (skrzynia == Skrzynia.MANUALNA) {
//            if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                if (kolor == Kolor.CZARNY) {
//                    if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                        return Marka.ALFA_ROMEO.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                    } else if (standardWyposazenia == StandardWyposazenia.VIP) {
//                        return Marka.ALFA_ROMEO.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.VIP.getWartosc();
//                    } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                        return Marka.ALFA_ROMEO.getWartosc() + Kolor.CZARNY.getWartosc();
//                    }
//                } else if (kolor == Kolor.CZERWONY) {
//                    if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                        return 3000 + Marka.ALFA_ROMEO.getWartosc() + Kolor.CZERWONY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                    } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                        return Marka.ALFA_ROMEO.getWartosc() + Kolor.CZERWONY.getWartosc();
//                    }
//                } else if (kolor == Kolor.BIALY) {
//                    if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                        return Marka.ALFA_ROMEO.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                    } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                        return Marka.ALFA_ROMEO.getWartosc();
//                    }
//                }
//            } else if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                System.out.println("Nie ma fiata w wersji Diesel");
//            }
//
//        } else if (marka == Marka.SKODA) {
//            if (skrzynia == Skrzynia.AUTOMATYCZNA) {
//                if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.SKODA.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.VIP) {
//                            return Marka.SKODA.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.VIP.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.SKODA.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return 3000 + Marka.SKODA.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.SKODA.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.SKODA.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.SKODA.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc();
//                        }
//                    }
//                } else if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.SKODA.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.VIP) {
//                            return Marka.SKODA.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.VIP.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.SKODA.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return 3000 + Marka.SKODA.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZERWONY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.SKODA.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.SKODA.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.SKODA.getWartosc() + Skrzynia.AUTOMATYCZNA.getWartosc();
//                        }
//                    }
//                }
//            } else if (skrzynia == Skrzynia.MANUALNA) {
//                if (rodzajPaliwa == RodzajPaliwa.DIESEL) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.SKODA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.VIP) {
//                            return Marka.SKODA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.VIP.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.SKODA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return 3000 + Marka.SKODA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.SKODA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.SKODA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.SKODA.getWartosc() + RodzajPaliwa.DIESEL.getWartosc();
//                        }
//                    }
//                } else if (rodzajPaliwa == RodzajPaliwa.BENZYNA) {
//                    if (kolor == Kolor.CZARNY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.SKODA.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.VIP) {
//                            return Marka.SKODA.getWartosc() + Kolor.CZARNY.getWartosc() + StandardWyposazenia.VIP.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.SKODA.getWartosc() + Kolor.CZARNY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.CZERWONY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return 3000 + Marka.SKODA.getWartosc() + Kolor.CZERWONY.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.SKODA.getWartosc() + Kolor.CZERWONY.getWartosc();
//                        }
//                    } else if (kolor == Kolor.BIALY) {
//                        if (standardWyposazenia == StandardWyposazenia.PREMIUM) {
//                            return Marka.SKODA.getWartosc() + StandardWyposazenia.PREMIUM.getWartosc();
//                        } else if (standardWyposazenia == StandardWyposazenia.BASIC) {
//                            return Marka.SKODA.getWartosc();
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
