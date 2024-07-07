#version 150

in vec4 Position;
in vec2 TexCoord0;
uniform mat4 ProjMat;
out vec2 TexCoord;

void main() {
    TexCoord = TexCoord0;
    gl_Position = ProjMat * Position;
}
