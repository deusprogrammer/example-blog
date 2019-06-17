# Prerequisites

- Install brew for Mac (https://www.howtogeek.com/211541/homebrew-for-os-x-easily-installs-desktop-apps-and-terminal-utilities/)
- Install git for Mac (https://www.atlassian.com/git/tutorials/install-git)
- Install Node.js and npm (https://treehouse.github.io/installation-guides/mac/node-mac.html)
- Install Docker and docker-compose (https://docs.docker.com/docker-for-mac/install/)
- Install a Java IDE (preferably IntelliJ Community edition)
- Install Visual Studio Code

# Setup Instructions

Run the included setup.sh to build the backend and install dependencies for the ui project.

    ./setup.sh

If the shell scripts don't run, you might need to give it execute permissions.

    chmod u+x setup.sh build.sh run.sh

Each time you make changes to the backend you will need to run the build.sh script.

    ./build.sh

Finally when you want to run everything together, you can run the ./run.sh script.

    ./run.sh

# Assignment

## Requirements

Using the provided starter apps: 

- Create a RESTful Web Service that can: 
    - store, delete, and present data about blogs
    - store, delete, and present comments on each blog
    - store, delete, authenticate, and present the users who create these blogs and comments
- Create a responsive front end that consumes the afore mentioned REST service and presents a user interface that can:
    - create, edit, and authenticate users
    - create, delete, and edit blogs
    - create, delete, and edit comments on each blog

## REST Service Endpoints

### /v1/blogs?user={username}

This endpoint exposes a list of all blogs.  It can be filtered with the optional user query param to return only blogs owned by that user.

#### Supported Methods:

- GET: Gets a list of blogs (optionally filtered by user).
- POST: Creates a blog.

### /v1/blogs/{blogId}

This endpoint exposes a specific blog.

#### Supported Methods:

- GET: Gets a blog specified by blog id.
- DELETE: Deletes a blog specified by blog id.
- PUT: Updates a blog specified by blog id.

### /v1/users

This endpoint exposes a list of all users.

#### Supported Methods:

- GET: Gets all users.
- POST: Creates a user.

### /v1/users/{username}

This endpoint exposes a specific user

#### Supported Methods:

- GET: Gets a user specified by username.
- DELETE: Deletes a user specified by username.
- PUT: Updates a user specified by username.

### /v1/users/token

Authenticates a user

#### Supported Methods:

- POST: Authenticates a user and returns a token for said user (this doesn't need to really do anything as we aren't really going to secure anything in this assignment)