# Instructions

1. Create a new branch.
2. Write your code, in various commits so we can see your development timeline. We won't be looking at the time each task took you. We're much more interested in your train of thought!
3. When finished, create a pull request.
4. Let us know when we may start reviewing your code.

## Exercise

You will have to build an app that displays a list of recipes. Each recipe from this list should be clickable. When clicked, the recipe should open a detail page with all relevant information. 

You are free to add any cool features (other than the ones mentioned below) as long as they are relevant to the content.


#### First screen: List of recipes

* The list of recipes should be loaded from the [recipes.json](app/src/main/assets/recipes.json) file. You can either store the JSON file in the project and read it in runtime, or make an HTTP request to get the raw file from github.
* The image of each recipe should also be displayed in the list.

#### Second screen: Detail page of a recipe

* A recipe can be favorited or unfavorited.
* You are recommended to save the favoriting status of each recipe (if a user chooses to favorite or unfavorite) either by using SharedPreferences or some kind of offline storage.

#### Third screen: Log in

* A user should be able to enter a valid email and password to proceed.
* The email and password can be hardcoded in the app as there is no server/API for this test.
* You can either have this screen as the start-up screen in the app, or have an option from the list of recipes screen to open this screen.

 

## Requirements

* The app should be implemented in Kotlin (preferred) or Java
* The app needs to support API level 19 and onwards
* All labels, variable names, and identifiers of any kind must be in English
* Adding a description of your solution (in the PR or in the readme file) would help us to review your code faster
* Don't use app development frameworks (like cordova or others), but feel free to use any third party libs that might save you time
* Write necessary unit tests (You can use Kotlin or Java)


##### Bonus points
- UI tests (You can use Kotlin or Java)


Good luck, and have fun!
