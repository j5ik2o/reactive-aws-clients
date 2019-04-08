// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ApplicationVersionLifecycleConfigBuilderOps(val self: ApplicationVersionLifecycleConfig.Builder)
    extends AnyVal {

  final def maxCountRuleAsScala(value: Option[MaxCountRule]): ApplicationVersionLifecycleConfig.Builder = {
    value.fold(self) { v =>
      self.maxCountRule(v)
    }
  } // MaxCountRule

  final def maxAgeRuleAsScala(value: Option[MaxAgeRule]): ApplicationVersionLifecycleConfig.Builder = {
    value.fold(self) { v =>
      self.maxAgeRule(v)
    }
  } // MaxAgeRule

}

final class ApplicationVersionLifecycleConfigOps(val self: ApplicationVersionLifecycleConfig) extends AnyVal {

  final def maxCountRuleAsScala: Option[MaxCountRule] = Option(self.maxCountRule) // MaxCountRule

  final def maxAgeRuleAsScala: Option[MaxAgeRule] = Option(self.maxAgeRule) // MaxAgeRule

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToApplicationVersionLifecycleConfigOps {

  implicit def toApplicationVersionLifecycleConfigBuilderOps(
      v: ApplicationVersionLifecycleConfig.Builder
  ): ApplicationVersionLifecycleConfigBuilderOps = new ApplicationVersionLifecycleConfigBuilderOps(v)

  implicit def toApplicationVersionLifecycleConfigOps(
      v: ApplicationVersionLifecycleConfig
  ): ApplicationVersionLifecycleConfigOps = new ApplicationVersionLifecycleConfigOps(v)

}
