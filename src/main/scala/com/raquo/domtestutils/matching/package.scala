package com.raquo.domtestutils

import org.scalajs.dom

package object matching {

  type Rule = ExpectedNode => Unit

  type MaybeError = Option[String]

  type ErrorList = List[String]

  type Check = dom.Node => MaybeError
}
