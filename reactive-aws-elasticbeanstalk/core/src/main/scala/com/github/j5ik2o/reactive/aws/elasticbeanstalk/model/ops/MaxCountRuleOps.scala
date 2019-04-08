// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class MaxCountRuleBuilderOps(val self: MaxCountRule.Builder) extends AnyVal {

  final def enabledAsScala(value: Option[Boolean]): MaxCountRule.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  }

  final def maxCountAsScala(value: Option[Int]): MaxCountRule.Builder = {
    value.fold(self) { v =>
      self.maxCount(v)
    }
  }

  final def deleteSourceFromS3AsScala(value: Option[Boolean]): MaxCountRule.Builder = {
    value.fold(self) { v =>
      self.deleteSourceFromS3(v)
    }
  }

}

final class MaxCountRuleOps(val self: MaxCountRule) extends AnyVal {

  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

  final def maxCountAsScala: Option[Int] = Option(self.maxCount)

  final def deleteSourceFromS3AsScala: Option[Boolean] = Option(self.deleteSourceFromS3)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMaxCountRuleOps {

  implicit def toMaxCountRuleBuilderOps(v: MaxCountRule.Builder): MaxCountRuleBuilderOps = new MaxCountRuleBuilderOps(v)

  implicit def toMaxCountRuleOps(v: MaxCountRule): MaxCountRuleOps = new MaxCountRuleOps(v)

}
