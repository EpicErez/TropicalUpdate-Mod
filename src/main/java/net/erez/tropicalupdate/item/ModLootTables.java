//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.erez.tropicalupdate.item;

import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.Set;
import net.minecraft.util.Identifier;

public class ModLootTables {
    private static final Set<Identifier> LOOT_TABLES = Sets.newHashSet();
    private static final Set<Identifier> LOOT_TABLES_READ_ONLY;
    public static final Identifier EMPTY;
    public static final Identifier SUNKEN_CHAMBER_CHEST;

    public ModLootTables() {
    }

    private static Identifier register(String id) {
        return registerLootTable(new Identifier(id));
    }

    private static Identifier registerLootTable(Identifier id) {
        if (LOOT_TABLES.add(id)) {
            return id;
        } else {
            throw new IllegalArgumentException("tropicalupdate" + id + " is already a registered built-in loot table");
        }
    }

    public static Set<Identifier> getAll() {
        return LOOT_TABLES_READ_ONLY;
    }

    static {
        LOOT_TABLES_READ_ONLY = Collections.unmodifiableSet(LOOT_TABLES);
        EMPTY = new Identifier("empty");
        SUNKEN_CHAMBER_CHEST = register("chests/sunken_chamber_chest");
    }
}
