// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class LimitsBuilderOps(val self: Limits.Builder) extends AnyVal {

  final def storageTypesAsScala(value: Option[Seq[StorageType]]): Limits.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.storageTypes(v.asJava)
    }
  }

  final def instanceLimitsAsScala(value: Option[InstanceLimits]): Limits.Builder = {
    value.fold(self) { v =>
      self.instanceLimits(v)
    }
  }

  final def additionalLimitsAsScala(value: Option[Seq[AdditionalLimit]]): Limits.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.additionalLimits(v.asJava)
    }
  }

}

final class LimitsOps(val self: Limits) extends AnyVal {

  final def storageTypesAsScala: Option[Seq[StorageType]] = Option(self.storageTypes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def instanceLimitsAsScala: Option[InstanceLimits] = Option(self.instanceLimits)

  final def additionalLimitsAsScala: Option[Seq[AdditionalLimit]] = Option(self.additionalLimits).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLimitsOps {

  implicit def toLimitsBuilderOps(v: Limits.Builder): LimitsBuilderOps = new LimitsBuilderOps(v)

  implicit def toLimitsOps(v: Limits): LimitsOps = new LimitsOps(v)

}
