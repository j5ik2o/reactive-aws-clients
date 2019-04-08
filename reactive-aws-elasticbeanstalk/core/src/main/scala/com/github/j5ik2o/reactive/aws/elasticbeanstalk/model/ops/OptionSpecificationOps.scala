// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class OptionSpecificationBuilderOps(val self: OptionSpecification.Builder) extends AnyVal {

  final def resourceNameAsScala(value: Option[String]): OptionSpecification.Builder = {
    value.fold(self) { v =>
      self.resourceName(v)
    }
  } // String

  final def namespaceAsScala(value: Option[String]): OptionSpecification.Builder = {
    value.fold(self) { v =>
      self.namespace(v)
    }
  } // String

  final def optionNameAsScala(value: Option[String]): OptionSpecification.Builder = {
    value.fold(self) { v =>
      self.optionName(v)
    }
  } // String

}

final class OptionSpecificationOps(val self: OptionSpecification) extends AnyVal {

  final def resourceNameAsScala: Option[String] = Option(self.resourceName) // String

  final def namespaceAsScala: Option[String] = Option(self.namespace) // String

  final def optionNameAsScala: Option[String] = Option(self.optionName) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOptionSpecificationOps {

  implicit def toOptionSpecificationBuilderOps(v: OptionSpecification.Builder): OptionSpecificationBuilderOps =
    new OptionSpecificationBuilderOps(v)

  implicit def toOptionSpecificationOps(v: OptionSpecification): OptionSpecificationOps = new OptionSpecificationOps(v)

}
