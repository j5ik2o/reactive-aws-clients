// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ProvisionedConcurrencyConfigListItemBuilderOps(val self: ProvisionedConcurrencyConfigListItem.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionArnAsScala(value: Option[String]): ProvisionedConcurrencyConfigListItem.Builder = {
    value.fold(self) { v =>
      self.functionArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestedProvisionedConcurrentExecutionsAsScala(
      value: Option[Int]
  ): ProvisionedConcurrencyConfigListItem.Builder = {
    value.fold(self) { v =>
      self.requestedProvisionedConcurrentExecutions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availableProvisionedConcurrentExecutionsAsScala(
      value: Option[Int]
  ): ProvisionedConcurrencyConfigListItem.Builder = {
    value.fold(self) { v =>
      self.availableProvisionedConcurrentExecutions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allocatedProvisionedConcurrentExecutionsAsScala(
      value: Option[Int]
  ): ProvisionedConcurrencyConfigListItem.Builder = {
    value.fold(self) { v =>
      self.allocatedProvisionedConcurrentExecutions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(
      value: Option[ProvisionedConcurrencyStatusEnum]
  ): ProvisionedConcurrencyConfigListItem.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusReasonAsScala(value: Option[String]): ProvisionedConcurrencyConfigListItem.Builder = {
    value.fold(self) { v =>
      self.statusReason(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala(value: Option[String]): ProvisionedConcurrencyConfigListItem.Builder = {
    value.fold(self) { v =>
      self.lastModified(v)
    }
  }

}

final class ProvisionedConcurrencyConfigListItemOps(val self: ProvisionedConcurrencyConfigListItem) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionArnAsScala: Option[String] = Option(self.functionArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestedProvisionedConcurrentExecutionsAsScala: Option[Int] =
    Option(self.requestedProvisionedConcurrentExecutions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def availableProvisionedConcurrentExecutionsAsScala: Option[Int] =
    Option(self.availableProvisionedConcurrentExecutions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allocatedProvisionedConcurrentExecutionsAsScala: Option[Int] =
    Option(self.allocatedProvisionedConcurrentExecutions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ProvisionedConcurrencyStatusEnum] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusReasonAsScala: Option[String] = Option(self.statusReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastModifiedAsScala: Option[String] = Option(self.lastModified)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToProvisionedConcurrencyConfigListItemOps {

  implicit def toProvisionedConcurrencyConfigListItemBuilderOps(
      v: ProvisionedConcurrencyConfigListItem.Builder
  ): ProvisionedConcurrencyConfigListItemBuilderOps = new ProvisionedConcurrencyConfigListItemBuilderOps(v)

  implicit def toProvisionedConcurrencyConfigListItemOps(
      v: ProvisionedConcurrencyConfigListItem
  ): ProvisionedConcurrencyConfigListItemOps = new ProvisionedConcurrencyConfigListItemOps(v)

}
