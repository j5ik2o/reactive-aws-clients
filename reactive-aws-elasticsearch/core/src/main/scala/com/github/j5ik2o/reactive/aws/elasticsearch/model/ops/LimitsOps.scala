// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class LimitsBuilderOps(val self: Limits.Builder) extends AnyVal {

  final def withStorageTypesAsScala(value: Option[Seq[StorageType]]): Limits.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.storageTypes(v.asJava)
    } // Seq[StorageType]
  }

  final def withInstanceLimitsAsScala(value: Option[InstanceLimits]): Limits.Builder = {
    value.fold(self) { v =>
      self.instanceLimits(v)
    }
  } // InstanceLimits

  final def withAdditionalLimitsAsScala(value: Option[Seq[AdditionalLimit]]): Limits.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.additionalLimits(v.asJava)
    } // Seq[AdditionalLimit]
  }

}

final class LimitsOps(val self: Limits) extends AnyVal {

  final def storageTypesAsScala: Option[Seq[StorageType]] = Option(self.storageTypes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[StorageType]

  final def instanceLimitsAsScala: Option[InstanceLimits] = Option(self.instanceLimits) // InstanceLimits

  final def additionalLimitsAsScala: Option[Seq[AdditionalLimit]] = Option(self.additionalLimits).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[AdditionalLimit]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLimitsOps {

  implicit def toLimitsBuilderOps(v: Limits.Builder): LimitsBuilderOps = new LimitsBuilderOps(v)

  implicit def toLimitsOps(v: Limits): LimitsOps = new LimitsOps(v)

}
