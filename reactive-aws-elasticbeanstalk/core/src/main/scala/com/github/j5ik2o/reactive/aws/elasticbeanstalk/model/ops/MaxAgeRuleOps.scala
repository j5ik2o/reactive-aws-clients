// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class MaxAgeRuleBuilderOps(val self: MaxAgeRule.Builder) extends AnyVal {

  final def enabledAsScala(value: Option[Boolean]): MaxAgeRule.Builder = {
    value.fold(self) { v =>
      self.enabled(v)
    }
  } // Boolean

  final def maxAgeInDaysAsScala(value: Option[Int]): MaxAgeRule.Builder = {
    value.fold(self) { v =>
      self.maxAgeInDays(v)
    }
  } // Int

  final def deleteSourceFromS3AsScala(value: Option[Boolean]): MaxAgeRule.Builder = {
    value.fold(self) { v =>
      self.deleteSourceFromS3(v)
    }
  } // Boolean

}

final class MaxAgeRuleOps(val self: MaxAgeRule) extends AnyVal {

  final def enabledAsScala: Option[Boolean] = Option(self.enabled) // Boolean

  final def maxAgeInDaysAsScala: Option[Int] = Option(self.maxAgeInDays) // Int

  final def deleteSourceFromS3AsScala: Option[Boolean] = Option(self.deleteSourceFromS3) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMaxAgeRuleOps {

  implicit def toMaxAgeRuleBuilderOps(v: MaxAgeRule.Builder): MaxAgeRuleBuilderOps = new MaxAgeRuleBuilderOps(v)

  implicit def toMaxAgeRuleOps(v: MaxAgeRule): MaxAgeRuleOps = new MaxAgeRuleOps(v)

}
