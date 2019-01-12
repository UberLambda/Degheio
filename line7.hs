import System.Process

main = do putStrLn "But suddenly, a spooky SPECTRE appeared."
          system "csc Line8.cs"
          system "mono Line8.exe" -- FIXME What if .NET [core]?
