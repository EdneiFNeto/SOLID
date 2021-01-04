package model

enum class Cargo {
    ASISTENTE {
        override fun proximoCargo(): Cargo {
            return ANALISTA
        }
    },
    ANALISTA {
        override fun proximoCargo(): Cargo {
            return ESPECIALISTA
        }
    },
    ESPECIALISTA {
        override fun proximoCargo(): Cargo {
            return GERENTE
        }
    },
    GERENTE {
        override fun proximoCargo(): Cargo {
            return GERENTE
        }
    };

    abstract fun proximoCargo(): Cargo
}