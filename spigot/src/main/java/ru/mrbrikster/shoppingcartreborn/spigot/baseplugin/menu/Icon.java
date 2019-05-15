package ru.mrbrikster.shoppingcartreborn.spigot.baseplugin.menu;

import lombok.*;
import org.bukkit.Material;

import java.util.List;

@Builder
public class Icon {

    @Getter @Setter @NonNull private Material type;
    @Getter @Setter @NonNull private String name;
    @Getter @Setter @Builder.Default private boolean enchant;
    @Getter @Setter @Singular("lore") private List<String> lore;
    @Getter @Setter @Builder.Default private ClickIconAction.ClickHandler handler;

}