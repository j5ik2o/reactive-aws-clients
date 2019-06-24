// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class MaxAgeRuleBuilderOps(val self: MaxAgeRule.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala(value: Option[Boolean]): MaxAgeRule.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxAgeInDaysAsScala(value: Option[Int]): MaxAgeRule.Builder = {
    value.fold(self) { v =>
      self.maxAgeInDays(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteSourceFromS3AsScala(value: Option[Boolean]): MaxAgeRule.Builder = {
    value.fold(self) { v =>
      self.deleteSourceFromS3(v)
    }
  }

}

final class MaxAgeRuleOps(val self: MaxAgeRule) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enabledAsScala: Option[Boolean] = Option(self.enabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxAgeInDaysAsScala: Option[Int] = Option(self.maxAgeInDays)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteSourceFromS3AsScala: Option[Boolean] = Option(self.deleteSourceFromS3)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMaxAgeRuleOps {

  implicit def toMaxAgeRuleBuilderOps(v: MaxAgeRule.Builder): MaxAgeRuleBuilderOps = new MaxAgeRuleBuilderOps(v)

  implicit def toMaxAgeRuleOps(v: MaxAgeRule): MaxAgeRuleOps = new MaxAgeRuleOps(v)

}
