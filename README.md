# ClearFluids

A simple Fabric mod that makes water and lava crystal clear. Compatible with Sodium!

## Features

- Makes water 85% transparent (configurable in code)
- Makes lava semi-transparent so you can see through it
- Works with Sodium and other rendering mods
- Client-side only - safe for servers

## Installation

1. Install [Fabric Loader](https://fabricmc.net/)
2. Install [Fabric API](https://modrinth.com/mod/fabric-api)
3. Drop `clearfluids-1.0.0.jar` into your `mods` folder

## Building from source

```bash
cd ClearFluids
./gradlew build
```

The built jar will be in `build/libs/`

## Configuration

To adjust transparency, edit `FluidRendererMixin.java`:

```java
float newAlpha = 0.15f;  // 0.0 = invisible, 1.0 = opaque
```

## Compatibility

- Minecraft 1.20.4
- Fabric Loader 0.15+
- Sodium ✓
- Iris ✓

## License

MIT
