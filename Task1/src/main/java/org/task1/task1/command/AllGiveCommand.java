package org.task1.task1.command;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


public class AllGiveCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {


        if (!(sender instanceof Player player)) return true;

        ItemStack itemInHand = player.getInventory().getItemInMainHand();
        String itemName = itemInHand.getData().getItemType().name();        //손에 있는 아이템 이름 가져오기//
        if (itemInHand != null && itemInHand.getType() != Material.AIR) {

            for (Player target : Bukkit.getOnlinePlayers()) {
                target.getInventory().addItem(itemInHand.clone());      // 손에 있는 아이템 복사
                target.sendMessage(player.getName() + "로 부터 " + itemName + "를 받았습니다");
            }
                player.sendMessage("아이템을 모든 플레이어에게 지급하였습니다.");


            } else {
                player.sendMessage("메인 손에 아이템을 들고 있지 않습니다.");
            }
        return false;


    }
}