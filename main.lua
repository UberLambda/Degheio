function love.load()
    font = love.graphics.newFont(32)

    particle_img = love.graphics.newImage("particle.png")
    particles = love.graphics.newParticleSystem(particle_img, 100)
    particles:setParticleLifetime(0.5, 2)
    particleDX = -50
    particleDY = 100
    particles:setLinearAcceleration(-10, -10, particleDX, particleDY)
    particles:setColors(255, 255, 40,  255,
                        255, 255, 200, 0)

    globalTime = 0.0
    oldMX = love.mouse.getX()
    oldMY = love.mouse.getY()
end

function love.update(dt)
    particles:update(dt)
    globalTime = globalTime + dt
    timeFac = math.sin(globalTime * 0.2)
end

function love.draw()
    particles:emit(200)

    local w = love.graphics.getWidth()
    local h = love.graphics.getHeight()

    local mX = love.mouse.getX()
    local mY = love.mouse.getY()
    local mDX = (mX - oldMX) / (w / 2)
    local mDY = (mY - oldMY) / (h / 2)
    particleDX = particleDX * mDX
    particleDX = particleDX * mDY
    oldMX = mX
    oldMY = mY

    local colorFac = (timeFac + 1.0) * 0.4
    love.graphics.setBackgroundColor(0.4, 0.6, 0.8 * colorFac)

    particles:setLinearAcceleration(-10, -10, -100, 50)
    love.graphics.draw(particles, mX, mY)

    local textX = 15 + timeFac * 100
    local textY = h / 2 + timeFac * 50
    love.graphics.setFont(font)
    love.graphics.print("He found his new home.", textX, textY)
end


