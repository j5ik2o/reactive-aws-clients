// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class KeyPairInfoBuilderOps(val self: KeyPairInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyPairIdAsScala(value: Option[String]): KeyPairInfo.Builder = {
    value.fold(self) { v =>
      self.keyPairId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyFingerprintAsScala(value: Option[String]): KeyPairInfo.Builder = {
    value.fold(self) { v =>
      self.keyFingerprint(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyNameAsScala(value: Option[String]): KeyPairInfo.Builder = {
    value.fold(self) { v =>
      self.keyName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): KeyPairInfo.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class KeyPairInfoOps(val self: KeyPairInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyPairIdAsScala: Option[String] = Option(self.keyPairId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyFingerprintAsScala: Option[String] = Option(self.keyFingerprint)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyNameAsScala: Option[String] = Option(self.keyName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToKeyPairInfoOps {

  implicit def toKeyPairInfoBuilderOps(v: KeyPairInfo.Builder): KeyPairInfoBuilderOps = new KeyPairInfoBuilderOps(v)

  implicit def toKeyPairInfoOps(v: KeyPairInfo): KeyPairInfoOps = new KeyPairInfoOps(v)

}
