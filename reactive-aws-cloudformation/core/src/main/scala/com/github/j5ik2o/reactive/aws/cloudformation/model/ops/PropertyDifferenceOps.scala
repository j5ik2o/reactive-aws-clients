// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class PropertyDifferenceBuilderOps(val self: PropertyDifference.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def propertyPathAsScala(value: Option[String]): PropertyDifference.Builder = {
    value.fold(self) { v =>
      self.propertyPath(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expectedValueAsScala(value: Option[String]): PropertyDifference.Builder = {
    value.fold(self) { v =>
      self.expectedValue(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actualValueAsScala(value: Option[String]): PropertyDifference.Builder = {
    value.fold(self) { v =>
      self.actualValue(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def differenceTypeAsScala(value: Option[DifferenceType]): PropertyDifference.Builder = {
    value.fold(self) { v =>
      self.differenceType(v)
    }
  }

}

final class PropertyDifferenceOps(val self: PropertyDifference) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def propertyPathAsScala: Option[String] = Option(self.propertyPath)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expectedValueAsScala: Option[String] = Option(self.expectedValue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actualValueAsScala: Option[String] = Option(self.actualValue)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def differenceTypeAsScala: Option[DifferenceType] = Option(self.differenceType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPropertyDifferenceOps {

  implicit def toPropertyDifferenceBuilderOps(v: PropertyDifference.Builder): PropertyDifferenceBuilderOps =
    new PropertyDifferenceBuilderOps(v)

  implicit def toPropertyDifferenceOps(v: PropertyDifference): PropertyDifferenceOps = new PropertyDifferenceOps(v)

}
