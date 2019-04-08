// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class PropertyDifferenceBuilderOps(val self: PropertyDifference.Builder) extends AnyVal {

  final def propertyPathAsScala(value: Option[String]): PropertyDifference.Builder = {
    value.fold(self) { v =>
      self.propertyPath(v)
    }
  } // String

  final def expectedValueAsScala(value: Option[String]): PropertyDifference.Builder = {
    value.fold(self) { v =>
      self.expectedValue(v)
    }
  } // String

  final def actualValueAsScala(value: Option[String]): PropertyDifference.Builder = {
    value.fold(self) { v =>
      self.actualValue(v)
    }
  } // String

  final def differenceTypeAsScala(value: Option[DifferenceType]): PropertyDifference.Builder = {
    value.fold(self) { v =>
      self.differenceType(v)
    }
  } // DifferenceType

}

final class PropertyDifferenceOps(val self: PropertyDifference) extends AnyVal {

  final def propertyPathAsScala: Option[String] = Option(self.propertyPath) // String

  final def expectedValueAsScala: Option[String] = Option(self.expectedValue) // String

  final def actualValueAsScala: Option[String] = Option(self.actualValue) // String

  final def differenceTypeAsScala: Option[DifferenceType] = Option(self.differenceType) // DifferenceType

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPropertyDifferenceOps {

  implicit def toPropertyDifferenceBuilderOps(v: PropertyDifference.Builder): PropertyDifferenceBuilderOps =
    new PropertyDifferenceBuilderOps(v)

  implicit def toPropertyDifferenceOps(v: PropertyDifference): PropertyDifferenceOps = new PropertyDifferenceOps(v)

}
