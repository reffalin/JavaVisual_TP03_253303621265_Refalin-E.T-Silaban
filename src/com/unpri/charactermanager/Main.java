package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        // Membuat tiga karakter
        Character character1 = new Character(
            "Arthur", CharacterType.WARRIOR, 1, 100, 10
        );

        Character character2 = new Character(
            "Merlin", CharacterType.MAGE, 2, 200, 20
        );

        Character character3 = new Character(
            "Robin", CharacterType.ARCHER, 3, 300, 30
        );

        System.out.println("=== CHARACTER MANAGER ===");
        System.out.println(character1);
        System.out.println(character2);
        System.out.println(character3);

        // Demo level up
        System.out.println("\n=== LEVEL UP ===");
        character1.setLevel(2);
        System.out.println(character1);

        // Mini-Challenge: mana dan isAlive()
        Character character4 = new Character(
            "Luna", CharacterType.HEALER, 1, 100, 10
        );

        character4.setMana(50);

        System.out.println("\n=== MINI CHALLENGE ===");
        System.out.println(character4);
        System.out.println(
            "Apakah " + character4.getName() +
            " masih hidup? " + character4.isAlive()
        );

        // Demo validasi mana
        System.out.println("\n=== VALIDASI MANA ===");

        try {
            character4.setMana(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Validasi berhasil: " + e.getMessage());
        }
    }
}