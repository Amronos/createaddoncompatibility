# Create: Addon Compatibility

## Features

### Blocks/Items

The following blocks/items have been unified to work in all the processes and recipes present in the relevant mods.

Mods take priority as defined in the configuration section below, items from lower priority mods are hidden in JEI/REI/EMI.

- **Coal Coke Dust** - [Immersive Engineering](https://modrinth.com/mod/immersiveengineering), [TFMG](https://modrinth.com/mod/create-tfmg)
- **All Copycat Blocks** - [Create: Copycats+](https://modrinth.com/mod/copycats), [Create: Connected](https://modrinth.com/mod/create-connected), [CD&D](https://modrinth.com/mod/create-dreams-and-desires)
- **Plastic Sheet** - [Pneumaticcraft](https://modrinth.com/mod/pneumaticcraft-repressurized), [TFMG](https://modrinth.com/mod/create-tfmg)
- **Six Way Gearbox** - [Create: Connected](https://modrinth.com/mod/create-connected), [Create Utilities](https://modrinth.com/mod/create-utilities)

### Fluids

The following fluids have been unified to work in all the processes and recipes present in the relevant mods.

- **Crude Oil** - [Ad Astra](https://modrinth.com/mod/ad-astra), [CDG](https://modrinth.com/mod/create-diesel-generators), [C:L&W](https://modrinth.com/mod/create-love-war), [Destroy](https://modrinth.com/mod/destroy), [Pneumaticcraft](https://modrinth.com/mod/pneumaticcraft-repressurized), [TFMG](https://modrinth.com/mod/create-tfmg)
- **Fuels** - [Ad Astra](https://modrinth.com/mod/ad-astra), [CC&A](https://modrinth.com/mod/createaddition), [CDG](https://modrinth.com/mod/create-diesel-generators), [CSnR](https://modrinth.com/mod/create-steam-n-rails), [Destroy](https://modrinth.com/mod/destroy), [Create Garnished](https://modrinth.com/mod/create-garnished), [Pneumaticcraft](https://modrinth.com/mod/pneumaticcraft-repressurized), [TFMG](https://modrinth.com/mod/create-tfmg)
  - Compatibility for fuels from other mods working in Ad Astra rockets can be disabled by enabling a datapack included in the mod.
  - Currently only TFMG's fuels work in its generators as TFMG does not have support for custom fuel types.(_A work-around could be found._)
- **Kerosene, Molten/Liquid Plastic, Lubricant/Lubrication Oil** - [Pneumaticcraft](https://modrinth.com/mod/pneumaticcraft-repressurized), [TFMG](https://modrinth.com/mod/create-tfmg)

## Installation

The mod is currently only available for 1.20.1 and 1.21.1 (neo)forge. Fabric/Quilt versions will come soon.

[Almost Unified](https://modrinth.com/mod/almost-unified) and [Create](https://modrinth.com/mod/create) are required to be installed.

## Compatibility Configuration

To change which mod has the priority in compatibility, modify the `modPriorities` in `config/almostunified/unify.json`, for more info look at [this](https://github.com/AlmostReliable/almostunified/wiki/Unification-Config).

The default priority order from highest to lowest is

```
pneumaticcraft
copycats
create_connected
create_dd
tfmg
```

<br>

There are datapacks present in the mod which allow you to change certain things about compatibility between different mods.

They can be enabled during world creation or by using the `/datapack enable` command.

## Suggestions / More Compatibility Features

I do have more compatibility features planned, but if you have any ideas, feel free to create an issue on GitHub or tell me in the Discord server.

## Credits

Thanks to:

1. The creators of the various mods for which compatibility has been added in this mod.
2. The AlmostReliable team for making Almost Unified, without which this mod would have been very difficult to make.
