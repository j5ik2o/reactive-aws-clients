// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class StorageTypeBuilderOps(val self: StorageType.Builder) extends AnyVal {

  final def withStorageTypeNameAsScala(value: Option[String]): StorageType.Builder = {
    value.fold(self) { v =>
      self.storageTypeName(v)
    }
  } // String

  final def withStorageSubTypeNameAsScala(value: Option[String]): StorageType.Builder = {
    value.fold(self) { v =>
      self.storageSubTypeName(v)
    }
  } // String

  final def withStorageTypeLimitsAsScala(value: Option[Seq[StorageTypeLimit]]): StorageType.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.storageTypeLimits(v.asJava)
    } // Seq[StorageTypeLimit]
  }

}

final class StorageTypeOps(val self: StorageType) extends AnyVal {

  final def storageTypeNameAsScala: Option[String] = Option(self.storageTypeName) // String

  final def storageSubTypeNameAsScala: Option[String] = Option(self.storageSubTypeName) // String

  final def storageTypeLimitsAsScala: Option[Seq[StorageTypeLimit]] = Option(self.storageTypeLimits).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[StorageTypeLimit]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStorageTypeOps {

  implicit def toStorageTypeBuilderOps(v: StorageType.Builder): StorageTypeBuilderOps = new StorageTypeBuilderOps(v)

  implicit def toStorageTypeOps(v: StorageType): StorageTypeOps = new StorageTypeOps(v)

}
