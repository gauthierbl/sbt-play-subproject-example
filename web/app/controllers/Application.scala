package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(App.Core.smallHello("Web!"))
  }
}