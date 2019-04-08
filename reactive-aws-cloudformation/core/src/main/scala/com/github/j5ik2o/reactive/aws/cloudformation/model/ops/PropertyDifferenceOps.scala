// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class PropertyDifferenceBuilderOps(val self: PropertyDifference.Builder) extends AnyVal {

  final def propertyPathAsScala(value: Option[String]): PropertyDifference.Builder = {
    value.fold(self) { v =>
      self.propertyPath(v)
    }
  }

  final def expectedValueAsScala(value: Option[String]): PropertyDifference.Builder = {
    value.fold(self) { v =>
      self.expectedValue(v)
    }
  }

  final def actualValueAsScala(value: Option[String]): PropertyDifference.Builder = {
    value.fold(self) { v =>
      self.actualValue(v)
    }
  }

  final def differenceTypeAsScala(value: Option[DifferenceType]): PropertyDifference.Builder = {
    value.fold(self) { v =>
      self.differenceType(v)
    }
  }

}

final class PropertyDifferenceOps(val self: PropertyDifference) extends AnyVal {

  final def propertyPathAsScala: Option[String] = Option(self.propertyPath)

  final def expectedValueAsScala: Option[String] = Option(self.expectedValue)

  final def actualValueAsScala: Option[String] = Option(self.actualValue)

  final def differenceTypeAsScala: Option[DifferenceType] = Option(self.differenceType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPropertyDifferenceOps {

  implicit def toPropertyDifferenceBuilderOps(v: PropertyDifference.Builder): PropertyDifferenceBuilderOps =
    new PropertyDifferenceBuilderOps(v)

  implicit def toPropertyDifferenceOps(v: PropertyDifference): PropertyDifferenceOps = new PropertyDifferenceOps(v)

}
