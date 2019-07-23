// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class StorageTypeBuilderOps(val self: StorageType.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageTypeNameAsScala(value: Option[String]): StorageType.Builder = {
    value.fold(self) { v =>
      self.storageTypeName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageSubTypeNameAsScala(value: Option[String]): StorageType.Builder = {
    value.fold(self) { v =>
      self.storageSubTypeName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageTypeLimitsAsScala(value: Option[Seq[StorageTypeLimit]]): StorageType.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.storageTypeLimits(v.asJava)
    }
  }

}

final class StorageTypeOps(val self: StorageType) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageTypeNameAsScala: Option[String] = Option(self.storageTypeName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageSubTypeNameAsScala: Option[String] = Option(self.storageSubTypeName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def storageTypeLimitsAsScala: Option[Seq[StorageTypeLimit]] = Option(self.storageTypeLimits).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStorageTypeOps {

  implicit def toStorageTypeBuilderOps(v: StorageType.Builder): StorageTypeBuilderOps = new StorageTypeBuilderOps(v)

  implicit def toStorageTypeOps(v: StorageType): StorageTypeOps = new StorageTypeOps(v)

}
