// Display-only tags for KidZ Jade Tiers.
// These tags do NOT control mining. Silent Gear incorrect_for_* tags remain the authority.

ServerEvents.tags('block', event => {
  event.add('kidz:needs_tier_1_tool', [
    '#minecraft:coal_ores',
    '#c:ores/coal',
    '#minecraft:copper_ores',
    '#c:ores/copper'
  ])

  event.add('kidz:needs_tier_2_tool', [
    '#minecraft:iron_ores',
    '#c:ores/iron'
  ])

  event.add('kidz:needs_tier_3_tool', [
    'minecraft:andesite'
  ])

  event.add('kidz:needs_tier_4_tool', [
    '#c:ores/zinc'
  ])

  event.add('kidz:needs_tier_5_tool', [
    '#minecraft:gold_ores',
    '#c:ores/gold'
  ])

  event.add('kidz:needs_tier_6_tool', [
    'minecraft:redstone_ore',
    'minecraft:deepslate_redstone_ore',
    'minecraft:redstone_block',
    '#c:ores/redstone',
    '#c:storage_blocks/redstone'
  ])

  event.add('kidz:needs_tier_7_tool', [
    '#minecraft:lapis_ores',
    '#c:ores/lapis',
    '#c:storage_blocks/lapis'
  ])

  event.add('kidz:needs_tier_10_tool', [
    '#c:ores/osmium',
    '#c:storage_blocks/osmium',
    '#c:storage_blocks/raw_osmium'
  ])

  event.add('kidz:needs_tier_11_tool', [
    '#c:ores/lead',
    '#c:storage_blocks/lead',
    '#c:storage_blocks/raw_lead'
  ])

  event.add('kidz:needs_tier_12_tool', [
    '#c:ores/tin',
    '#c:storage_blocks/tin',
    '#c:storage_blocks/raw_tin',
    'minecraft:obsidian',
    'minecraft:crying_obsidian',
    'minecraft:amethyst_block',
    'minecraft:budding_amethyst',
    'minecraft:amethyst_cluster',
    'minecraft:large_amethyst_bud',
    'minecraft:medium_amethyst_bud',
    'minecraft:small_amethyst_bud'
  ])

  event.add('kidz:needs_tier_13_tool', [
    'ae2:sky_stone_block',
    '#c:ores/certus_quartz',
    'ae2:quartz_cluster',
    'ae2:small_quartz_bud',
    'ae2:medium_quartz_bud',
    'ae2:large_quartz_bud',
    'ae2:flawed_budding_quartz',
    'ae2:flawless_budding_quartz',
    'ae2:chipped_budding_quartz',
    'ae2:damaged_budding_quartz'
  ])

  event.add('kidz:needs_tier_14_tool', [
    '#minecraft:diamond_ores',
    '#c:ores/diamond',
    '#c:storage_blocks/diamond',
    '#c:ores/fluorite',
    '#c:storage_blocks/fluorite'
  ])

  event.add('kidz:needs_tier_15_tool', [
    '#minecraft:emerald_ores',
    '#c:ores/emerald',
    '#c:storage_blocks/emerald',
    'minecraft:nether_quartz_ore'
  ])

  event.add('kidz:needs_tier_16_tool', [
    'minecraft:ancient_debris',
    'minecraft:nether_gold_ore'
  ])

  event.add('kidz:needs_tier_17_tool', [
    '#c:ores/uranium',
    '#c:storage_blocks/uranium',
    '#c:storage_blocks/raw_uranium',
    'stellaris:mercury_uranium_ore'
  ])

  event.add('kidz:needs_tier_18_tool', [
    '#c:ores/yellorite',
    'bigreactors:yellorite_ore',
    'bigreactors:deepslate_yellorite_ore',
    '#c:storage_blocks/yellorium',
    '#c:storage_blocks/raw_yellorium',
    'bigreactors:raw_yellorium_block'
  ])

  event.add('kidz:needs_tier_19_tool', [
    'bigreactors:anglesite_ore',
    'silentgear:azure_silver_ore'
  ])

  event.add('kidz:needs_tier_20_tool', [
    'bigreactors:benitoite_ore',
    'silentgear:bort_ore',
    'silentgear:deepslate_bort_ore'
  ])

  event.add('kidz:needs_tier_21_tool', [
    'bigreactors:magentite_block',
    '#c:storage_blocks/magentite'
  ])

  event.add('kidz:needs_tier_22_tool', [
    'silentgear:crimson_iron_ore',
    'silentgear:blackstone_crimson_iron_ore'
  ])

  event.add('kidz:needs_tier_23_tool', [
    'stellaris:moon_desh_ore',
    'stellaris:raw_desh_block',
    '#c:storage_blocks/raw_desh'
  ])
})
