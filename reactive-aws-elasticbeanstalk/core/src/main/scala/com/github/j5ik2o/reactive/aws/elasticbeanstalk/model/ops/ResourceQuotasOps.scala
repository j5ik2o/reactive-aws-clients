// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ResourceQuotasBuilderOps(val self: ResourceQuotas.Builder) extends AnyVal {

  final def applicationQuotaAsScala(value: Option[ResourceQuota]): ResourceQuotas.Builder = {
    value.fold(self) { v =>
      self.applicationQuota(v)
    }
  }

  final def applicationVersionQuotaAsScala(value: Option[ResourceQuota]): ResourceQuotas.Builder = {
    value.fold(self) { v =>
      self.applicationVersionQuota(v)
    }
  }

  final def environmentQuotaAsScala(value: Option[ResourceQuota]): ResourceQuotas.Builder = {
    value.fold(self) { v =>
      self.environmentQuota(v)
    }
  }

  final def configurationTemplateQuotaAsScala(value: Option[ResourceQuota]): ResourceQuotas.Builder = {
    value.fold(self) { v =>
      self.configurationTemplateQuota(v)
    }
  }

  final def customPlatformQuotaAsScala(value: Option[ResourceQuota]): ResourceQuotas.Builder = {
    value.fold(self) { v =>
      self.customPlatformQuota(v)
    }
  }

}

final class ResourceQuotasOps(val self: ResourceQuotas) extends AnyVal {

  final def applicationQuotaAsScala: Option[ResourceQuota] = Option(self.applicationQuota)

  final def applicationVersionQuotaAsScala: Option[ResourceQuota] = Option(self.applicationVersionQuota)

  final def environmentQuotaAsScala: Option[ResourceQuota] = Option(self.environmentQuota)

  final def configurationTemplateQuotaAsScala: Option[ResourceQuota] = Option(self.configurationTemplateQuota)

  final def customPlatformQuotaAsScala: Option[ResourceQuota] = Option(self.customPlatformQuota)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResourceQuotasOps {

  implicit def toResourceQuotasBuilderOps(v: ResourceQuotas.Builder): ResourceQuotasBuilderOps =
    new ResourceQuotasBuilderOps(v)

  implicit def toResourceQuotasOps(v: ResourceQuotas): ResourceQuotasOps = new ResourceQuotasOps(v)

}
