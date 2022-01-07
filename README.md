# LifeStealRefabricated
A simple lifesteal fabric mod made for fabric servers. Made for 1.18.1, but you can take the source and port it to other version :)

## How to use
- Download mod jar from releases
- Put it into the mods folder in your server directory
- Start the server
- Profit

## Download
Go to [releases](https://github.com/SansSerif1/LifeStealRefabricated/releases) and download the latest jar file.

## Config? Settings?
This mod has its own config, but it is not meant to be edited. The mod saves there player health, so it wont reset on server restart.\
This a pretty lightweight and easy to use mod, so it has no settings. People can have as many hp as minecraft allows and when someone goes to zero, it stops at 1 hearth (so they can atleast live and not get banned immediatelly)

## How it works
Everything this mod does is only sending /attribute commands to console (so it can change player maxHealth), when a entity killed entity event is fired (only if both entities are players)

## Why
Why not. I really like this idea to be able to steal hp, but I found only some lifesteal mod only as spigot plugin, or for fabric, but with some random dependency. (this uses only fabric api)
