// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class StorageTypeLimitBuilderOps(val self: StorageTypeLimit.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitNameAsScala(value: Option[String]): StorageTypeLimit.Builder = {
    value.fold(self) { v =>
      self.limitName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitValuesAsScala(value: Option[Seq[String]]): StorageTypeLimit.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.limitValues(v.asJava)
    }
  }

}

final class StorageTypeLimitOps(val self: StorageTypeLimit) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitNameAsScala: Option[String] = Option(self.limitName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def limitValuesAsScala: Option[Seq[String]] = Option(self.limitValues).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStorageTypeLimitOps {

  implicit def toStorageTypeLimitBuilderOps(v: StorageTypeLimit.Builder): StorageTypeLimitBuilderOps =
    new StorageTypeLimitBuilderOps(v)

  implicit def toStorageTypeLimitOps(v: StorageTypeLimit): StorageTypeLimitOps = new StorageTypeLimitOps(v)

}
