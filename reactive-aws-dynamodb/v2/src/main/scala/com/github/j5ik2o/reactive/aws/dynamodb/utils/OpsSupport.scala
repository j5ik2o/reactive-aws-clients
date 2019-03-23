package com.github.j5ik2o.reactive.aws.dynamodb.utils

import java.{ lang, util }

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  AttributeDefinition => ScalaAttributeDefinition,
  AttributeValue => ScalaAttributeValue,
  AttributeValueUpdate => ScalaAttributeValueUpdate,
  AutoScalingPolicyDescription => ScalaAutoScalingPolicyDescription,
  AutoScalingPolicyUpdate => ScalaAutoScalingPolicyUpdate,
  AutoScalingSettingsDescription => ScalaAutoScalingSettingsDescription,
  AutoScalingSettingsUpdate => ScalaAutoScalingSettingsUpdate,
  AutoScalingTargetTrackingScalingPolicyConfigurationDescription => ScalaAutoScalingTargetTrackingScalingPolicyConfigurationDescription,
  AutoScalingTargetTrackingScalingPolicyConfigurationUpdate => ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate,
  BackupDescription => ScalaBackupDescription,
  BackupDetails => ScalaBackupDetails,
  BackupSummary => ScalaBackupSummary,
  BackupTypeFilter => ScalaBackupTypeFilter,
  BillingMode => ScalaBillingMode,
  BillingModeSummary => ScalaBillingModeSummary,
  Capacity => ScalaCapacity,
  Condition => ScalaCondition,
  ConditionCheck => ScalaConditionCheck,
  ConditionalOperator => ScalaConditionalOperator,
  ConsumedCapacity => ScalaConsumedCapacity,
  ContinuousBackupsDescription => ScalaContinuousBackupsDescription,
  CreateGlobalSecondaryIndexAction => ScalaCreateGlobalSecondaryIndexAction,
  CreateReplicaAction => ScalaCreateReplicaAction,
  Delete => ScalaDelete,
  DeleteGlobalSecondaryIndexAction => ScalaDeleteGlobalSecondaryIndexAction,
  DeleteReplicaAction => ScalaDeleteReplicaAction,
  DeleteRequest => ScalaDeleteRequest,
  Endpoint => ScalaEndpoint,
  ExpectedAttributeValue => ScalaExpectedAttributeValue,
  Get => ScalaGet,
  GlobalSecondaryIndex => ScalaGlobalSecondaryIndex,
  GlobalSecondaryIndexUpdate => ScalaGlobalSecondaryIndexUpdate,
  GlobalTable => ScalaGlobalTable,
  GlobalTableDescription => ScalaGlobalTableDescription,
  GlobalTableGlobalSecondaryIndexSettingsUpdate => ScalaGlobalTableGlobalSecondaryIndexSettingsUpdate,
  Identity => ScalaIdentity,
  IndexStatus => ScalaIndexStatus,
  ItemCollectionMetrics => ScalaItemCollectionMetrics,
  KeySchemaElement => ScalaKeySchemaElement,
  KeysAndAttributes => ScalaKeysAndAttributes,
  LocalSecondaryIndex => ScalaLocalSecondaryIndex,
  LocalSecondaryIndexInfo => ScalaLocalSecondaryIndexInfo,
  PointInTimeRecoveryDescription => ScalaPointInTimeRecoveryDescription,
  PointInTimeRecoverySpecification => ScalaPointInTimeRecoverySpecification,
  Projection => ScalaProjection,
  ProvisionedThroughput => ScalaProvisionedThroughput,
  ProvisionedThroughputDescription => ScalaProvisionedThroughputDescription,
  Put => ScalaPut,
  PutRequest => ScalaPutRequest,
  Record => ScalaRecord,
  Replica => ScalaReplica,
  ReplicaDescription => ScalaReplicaDescription,
  ReplicaGlobalSecondaryIndexSettingsDescription => ScalaReplicaGlobalSecondaryIndexSettingsDescription,
  ReplicaGlobalSecondaryIndexSettingsUpdate => ScalaReplicaGlobalSecondaryIndexSettingsUpdate,
  ReplicaSettingsDescription => ScalaReplicaSettingsDescription,
  ReplicaSettingsUpdate => ScalaReplicaSettingsUpdate,
  ReplicaUpdate => ScalaReplicaUpdate,
  ReturnConsumedCapacity => ScalaReturnConsumedCapacity,
  ReturnItemCollectionMetrics => ScalaReturnItemCollectionMetrics,
  ReturnValue => ScalaReturnValue,
  ReturnValuesOnConditionCheckFailure => ScalaReturnValuesOnConditionCheckFailure,
  SSESpecification => ScalaSSESpecification,
  Select => ScalaSelect,
  SequenceNumberRange => ScalaSequenceNumberRange,
  Shard => ScalaShard,
  ShardIteratorType => ScalaShardIteratorType,
  SourceTableDetails => ScalaSourceTableDetails,
  SourceTableFeatureDetails => ScalaSourceTableFeatureDetails,
  Stream => ScalaStream,
  StreamDescription => ScalaStreamDescription,
  StreamRecord => ScalaStreamRecord,
  StreamSpecification => ScalaStreamSpecification,
  TableDescription => ScalaTableDescription,
  Tag => ScalaTag,
  TimeToLiveDescription => ScalaTimeToLiveDescription,
  TimeToLiveSpecification => ScalaTimeToLiveSpecification,
  TransactGetItem => ScalaTransactGetItem,
  TransactWriteItem => ScalaTransactWriteItem,
  Update => ScalaUpdate,
  UpdateGlobalSecondaryIndexAction => ScalaUpdateGlobalSecondaryIndexAction,
  WriteRequest => ScalaWriteRequest
}
import enumeratum.EnumEntry
import software.amazon.awssdk.core.SdkBytes
import software.amazon.awssdk.services.dynamodb.model.{
  DeleteRequest,
  AttributeDefinition => JavaAttributeDefinition,
  AttributeValue => JavaAttributeValue,
  AttributeValueUpdate => JavaAttributeValueUpdate,
  AutoScalingPolicyDescription => JavaAutoScalingPolicyDescription,
  AutoScalingPolicyUpdate => JavaAutoScalingPolicyUpdate,
  AutoScalingSettingsDescription => JavaAutoScalingSettingsDescription,
  AutoScalingSettingsUpdate => JavaAutoScalingSettingsUpdate,
  AutoScalingTargetTrackingScalingPolicyConfigurationDescription => JavaAutoScalingTargetTrackingScalingPolicyConfigurationDescription,
  AutoScalingTargetTrackingScalingPolicyConfigurationUpdate => JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate,
  BackupDescription => JavaBackupDescription,
  BackupDetails => JavaBackupDetails,
  BackupSummary => JavaBackupSummary,
  BackupTypeFilter => JavaBackupTypeFilter,
  BillingMode => JavaBillingMode,
  BillingModeSummary => JavaBillingModeSummary,
  Capacity => JavaCapacity,
  Condition => JavaCondition,
  ConditionCheck => JavaConditionCheck,
  ConditionalOperator => JavaConditionalOperator,
  ConsumedCapacity => JavaConsumedCapacity,
  ContinuousBackupsDescription => JavaContinuousBackupsDescription,
  CreateGlobalSecondaryIndexAction => JavaCreateGlobalSecondaryIndexAction,
  CreateReplicaAction => JavaCreateReplicaAction,
  Delete => JavaDelete,
  DeleteGlobalSecondaryIndexAction => JavaDeleteGlobalSecondaryIndexAction,
  DeleteReplicaAction => JavaDeleteReplicaAction,
  DeleteRequest => JavaScalaDeleteRequest,
  Endpoint => JavaEndpoint,
  ExpectedAttributeValue => JavaExpectedAttributeValue,
  Get => JavaGet,
  GlobalSecondaryIndex => JavaGlobalSecondaryIndex,
  GlobalSecondaryIndexUpdate => JavaGlobalSecondaryIndexUpdate,
  GlobalTable => JavaGlobalTable,
  GlobalTableDescription => JavaGlobalTableDescription,
  GlobalTableGlobalSecondaryIndexSettingsUpdate => JavaGlobalTableGlobalSecondaryIndexSettingsUpdate,
  Identity => JavaIdentity,
  IndexStatus => JavaIndexStatus,
  ItemCollectionMetrics => JavaItemCollectionMetrics,
  KeySchemaElement => JavaKeySchemaElement,
  KeysAndAttributes => JavaKeysAndAttributes,
  LocalSecondaryIndex => JavaLocalSecondaryIndex,
  LocalSecondaryIndexInfo => JavaLocalSecondaryIndexInfo,
  PointInTimeRecoveryDescription => JavaPointInTimeRecoveryDescription,
  PointInTimeRecoverySpecification => JavaPointInTimeRecoverySpecification,
  Projection => JavaProjection,
  ProvisionedThroughput => JavaProvisionedThroughput,
  ProvisionedThroughputDescription => JavaProvisionedThroughputDescription,
  Put => JavaPut,
  PutRequest => JavaPutRequest,
  Record => JavaRecord,
  Replica => JavaReplica,
  ReplicaDescription => JavaReplicaDescription,
  ReplicaGlobalSecondaryIndexSettingsDescription => JavaReplicaGlobalSecondaryIndexSettingsDescription,
  ReplicaGlobalSecondaryIndexSettingsUpdate => JavaReplicaGlobalSecondaryIndexSettingsUpdate,
  ReplicaSettingsDescription => JavaReplicaSettingsDescription,
  ReplicaSettingsUpdate => JavaReplicaSettingsUpdate,
  ReplicaUpdate => JavaReplicaUpdate,
  ReturnConsumedCapacity => JavaReturnConsumedCapacity,
  ReturnItemCollectionMetrics => JavaReturnItemCollectionMetrics,
  ReturnValue => JavaReturnValue,
  ReturnValuesOnConditionCheckFailure => JavaReturnValuesOnConditionCheckFailure,
  SSESpecification => JavaSSESpecification,
  Select => JavaSelect,
  SequenceNumberRange => JavaSequenceNumberRange,
  Shard => JavaShard,
  ShardIteratorType => JavaShardIteratorType,
  SourceTableDetails => JavaSourceTableDetails,
  SourceTableFeatureDetails => JavaSourceTableFeatureDetails,
  Stream => JavaStream,
  StreamDescription => JavaStreamDescription,
  StreamRecord => JavaStreamRecord,
  StreamSpecification => JavaStreamSpecification,
  TableDescription => JavaTableDescription,
  Tag => JavaTag,
  TimeToLiveDescription => JavaTimeToLiveDescription,
  TimeToLiveSpecification => JavaTimeToLiveSpecification,
  TransactGetItem => JavaTransactGetItem,
  TransactWriteItem => JavaTransactWriteItem,
  Update => JavaUpdate,
  UpdateGlobalSecondaryIndexAction => JavaUpdateGlobalSecondaryIndexAction,
  WriteRequest => JavaWriteRequest
}

import scala.collection.JavaConverters._

trait OpsSupport {

  type ArrayByte               = Array[Byte]
  type ScalaAttributeValueMap  = Map[String, ScalaAttributeValue]
  type ScalaAttributeValueList = Seq[ScalaAttributeValue]

  implicit def fromEnumEntryToString(s: EnumEntry): String = s.entryName

  implicit def fromArrayByteToSdkBytes(s: ArrayByte): SdkBytes = SdkBytes.fromByteArray(s)

  implicit def fromSeqArrayByteToJULSdkBytes[A](s: Seq[ArrayByte]): util.List[SdkBytes] =
    s.map(SdkBytes.fromByteArray).asJava

  implicit def toJavaAttributeValueMap(s: ScalaAttributeValueMap): util.Map[String, JavaAttributeValue] = {
    s.mapValues(_.toJava).asJava
  }

  implicit def toScalaAttributeValueMap(
      j: Option[util.Map[String, JavaAttributeValue]]
  ): Option[Map[String, ScalaAttributeValue]] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.AttributeValueOps._
    j.map(_.asScala.toMap).map(_.mapValues(_.toScala))
  }

  implicit def toJavaAttributeValueList(s: ScalaAttributeValueList): util.List[JavaAttributeValue] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.AttributeValueOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaAttributeValue(s: ScalaAttributeValue): JavaAttributeValue = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.AttributeValueOps._
    s.toJava
  }

  implicit def toJavaAutoScalingTargetTrackingScalingPolicyConfigurationDescription(
      s: ScalaAutoScalingTargetTrackingScalingPolicyConfigurationDescription
  ): JavaAutoScalingTargetTrackingScalingPolicyConfigurationDescription = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.AutoScalingTargetTrackingScalingPolicyConfigurationDescriptionOps._
    s.toJava
  }

  implicit def toJavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate(
      s: ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
  ): JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.AutoScalingTargetTrackingScalingPolicyConfigurationUpdateOps._
    s.toJava
  }

  implicit def toJavaAutoScalingPolicyDescription(
      s: ScalaAutoScalingPolicyDescription
  ): JavaAutoScalingPolicyDescription = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.AutoScalingPolicyDescriptionOps._
    s.toJava
  }

  implicit def toJavaAutoScalingPolicyDescriptionList(
      s: Seq[ScalaAutoScalingPolicyDescription]
  ): util.Collection[JavaAutoScalingPolicyDescription] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.AutoScalingPolicyDescriptionOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaAutoScalingPolicyUpdate(s: ScalaAutoScalingPolicyUpdate): JavaAutoScalingPolicyUpdate = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.AutoScalingPolicyUpdateOps._
    s.toJava
  }

  implicit def toJavaBackupDetails(s: ScalaBackupDetails): JavaBackupDetails = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.BackupDetailsOps._
    s.toJava
  }

  implicit def toJavaSourceTableDetails(s: ScalaSourceTableDetails): JavaSourceTableDetails = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.SourceTableDetailsOps._
    s.toJava
  }

  implicit def toJavaSourceTableFeatureDetails(s: ScalaSourceTableFeatureDetails): JavaSourceTableFeatureDetails = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.SourceTableFeatureDetailsOps._
    s.toJava
  }

  implicit def toJavaAttributeValueMapListMap(
      s: Map[String, Seq[ScalaAttributeValueMap]]
  ): util.Map[String, util.List[util.Map[String, JavaAttributeValue]]] = {
    s.mapValues(_.map(_.mapValues(_.toJava).asJava).asJava).asJava
  }

  implicit def toJavaForKeysAndAttributesMap(
      s: Map[String, ScalaKeysAndAttributes]
  ): util.Map[String, JavaKeysAndAttributes] = {
    s.mapValues(_.toJava).asJava
  }

  implicit def toScalaForKeysAndAttributesMap(
      j: Option[util.Map[String, JavaKeysAndAttributes]]
  ): Option[Map[String, ScalaKeysAndAttributes]] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.KeysAndAttributesOps._
    j.map(_.asScala.toMap).map(_.mapValues(_.toScala))
  }

  implicit def toJavaConsumedCapacityList(s: Seq[ScalaConsumedCapacity]): util.List[JavaConsumedCapacity] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ConsumedCapacityOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaWriteRequestListMap(
      s: Map[String, Seq[ScalaWriteRequest]]
  ): util.Map[String, util.List[JavaWriteRequest]] = {
    s.mapValues(_.map(_.toJava).asJava).asJava
  }

  implicit def toJavaItemCollectionMetricsListMap(
      s: Map[String, Seq[ScalaItemCollectionMetrics]]
  ): util.Map[String, util.List[JavaItemCollectionMetrics]] = {
    s.mapValues(_.map(_.toJava).asJava).asJava
  }

  implicit def toJavaMap(s: Map[String, String]): util.Map[String, String] = {
    s.asJava
  }

  implicit def toJavaCapacity(s: ScalaCapacity): JavaCapacity = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.CapacityOps._
    s.toJava
  }

  implicit def toJava(s: Map[String, ScalaCapacity]): util.Map[String, JavaCapacity] = {
    s.mapValues(_.toJava).asJava
  }

  implicit def toJavaPointInTimeRecoveryDescription(
      s: ScalaPointInTimeRecoveryDescription
  ): JavaPointInTimeRecoveryDescription = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.PointInTimeRecoveryDescriptionOps._
    s.toJava
  }

  implicit def toJavaScalaKeySchemaElementList(s: Seq[ScalaKeySchemaElement]): util.List[JavaKeySchemaElement] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.KeySchemaElementOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaProjection(s: ScalaProjection): JavaProjection = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ProjectionOps._
    s.toJava
  }

  implicit def toJavaProvisionedThroughput(s: ScalaProvisionedThroughput): JavaProvisionedThroughput = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ProvisionedThroughputOps._
    s.toJava
  }

  implicit def toJavaReplicaList(s: Seq[ScalaReplica]): util.List[JavaReplica] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ReplicaOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaGlobalTableDescription(s: ScalaGlobalTableDescription): JavaGlobalTableDescription = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.GlobalTableDescriptionOps._
    s.toJava
  }

  implicit def toJavaAttributeDefinitionList(s: Seq[ScalaAttributeDefinition]): util.List[JavaAttributeDefinition] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.AttributeDefinitionOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaLocalSecondaryIndexList(s: Seq[ScalaLocalSecondaryIndex]): util.List[JavaLocalSecondaryIndex] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.LocalSecondaryIndexOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaGlobalSecondaryIndexList(
      s: Seq[ScalaGlobalSecondaryIndex]
  ): util.List[JavaGlobalSecondaryIndex] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.GlobalSecondaryIndexOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaStreamSpecification(s: ScalaStreamSpecification): JavaStreamSpecification = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.StreamSpecificationOps._
    s.toJava
  }

  implicit def toJavaSSESpecification(s: ScalaSSESpecification): JavaSSESpecification = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.SSESpecificationOps._
    s.toJava
  }

  implicit def toJavaTableDescription(s: ScalaTableDescription): JavaTableDescription = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.TableDescriptionOps._
    s.toJava
  }

  implicit def toJavaBackupDescription(s: ScalaBackupDescription): JavaBackupDescription = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.BackupDescriptionOps._
    s.toJava
  }

  implicit def toJavaScalaExpectedAttributeValueMap(
      s: Map[String, ScalaExpectedAttributeValue]
  ): util.Map[String, JavaExpectedAttributeValue] = {
    s.mapValues(_.toJava).asJava
  }

  implicit def toJavaConsumedCapacity(s: ScalaConsumedCapacity): JavaConsumedCapacity = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ConsumedCapacityOps._
    s.toJava
  }

  implicit def toScalaConsumedCapacity(j: Option[JavaConsumedCapacity]): Option[ScalaConsumedCapacity] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ConsumedCapacityOps._
    j.map(_.toScala)
  }

  implicit def toJavaItemCollectionMetrics(s: ScalaItemCollectionMetrics): JavaItemCollectionMetrics = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ItemCollectionMetricsOps._
    s.toJava
  }

  implicit def toJavaContinuousBackupsDescription(
      s: ScalaContinuousBackupsDescription
  ): JavaContinuousBackupsDescription = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ContinuousBackupsDescriptionOps._
    s.toJava
  }

  implicit def toJavaEndpointList(s: Seq[ScalaEndpoint]): util.List[JavaEndpoint] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.EndpointOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaReplicaSettingsDescriptionList(
      s: Seq[ScalaReplicaSettingsDescription]
  ): util.List[JavaReplicaSettingsDescription] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ReplicaSettingsDescriptionOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaStreamDescription(s: ScalaStreamDescription): JavaStreamDescription = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.StreamDescriptionOps._
    s.toJava
  }

  implicit def toJavaTimeToLiveDescription(s: ScalaTimeToLiveDescription): JavaTimeToLiveDescription = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.TimeToLiveDescriptionOps._
    s.toJava
  }

  implicit def toJavaRecordList(s: Seq[ScalaRecord]): util.List[JavaRecord] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.RecordOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaProvisionedThroughputDescription(
      s: ScalaProvisionedThroughputDescription
  ): JavaProvisionedThroughputDescription = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ProvisionedThroughputDescriptionOps._
    s.toJava
  }

  implicit def toJavaUpdateGlobalSecondaryIndexAction(
      s: ScalaUpdateGlobalSecondaryIndexAction
  ): JavaUpdateGlobalSecondaryIndexAction = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateGlobalSecondaryIndexActionOps._
    s.toJava
  }

  implicit def toJavaCreateGlobalSecondaryIndexAction(
      s: ScalaCreateGlobalSecondaryIndexAction
  ): JavaCreateGlobalSecondaryIndexAction = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.CreateGlobalSecondaryIndexActionOps._
    s.toJava
  }

  implicit def toJavaDeleteGlobalSecondaryIndexAction(
      s: ScalaDeleteGlobalSecondaryIndexAction
  ): JavaDeleteGlobalSecondaryIndexAction = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DeleteGlobalSecondaryIndexActionOps._
    s.toJava
  }

  implicit def toJavaReplicaDescriptionList(s: Seq[ScalaReplicaDescription]): util.List[JavaReplicaDescription] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ReplicaDescriptionOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaAutoScalingSettingsUpdate(s: ScalaAutoScalingSettingsUpdate): JavaAutoScalingSettingsUpdate = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.AutoScalingSettingsUpdateOps._
    s.toJava
  }

  implicit def toJavaDoubleList(s: Seq[Double]): util.List[lang.Double] = {
    s.map(_.asInstanceOf[java.lang.Double]).asJava
  }

  implicit def toJavaAttributeValueMapList(
      s: Seq[Map[String, ScalaAttributeValue]]
  ): util.List[util.Map[String, JavaAttributeValue]] = {
    s.map(_.mapValues(_.toJava).asJava).asJava
  }

  implicit def toJavaBackupSummaryList(s: Seq[ScalaBackupSummary]): util.List[JavaBackupSummary] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.BackupSummaryOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaGlobalTableList(s: Seq[ScalaGlobalTable]): util.List[JavaGlobalTable] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.GlobalTableOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaStreamList(s: Seq[ScalaStream]): util.List[JavaStream] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.StreamOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaTagList(s: Seq[ScalaTag]): util.List[JavaTag] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.TagOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaStreamRecord(s: ScalaStreamRecord): JavaStreamRecord = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.StreamRecordOps._
    s.toJava
  }

  implicit def toJavaIdentity(s: ScalaIdentity): JavaIdentity = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.IdentityOps._
    s.toJava
  }

  implicit def toJavaAutoScalingSettingsDescription(
      s: ScalaAutoScalingSettingsDescription
  ): JavaAutoScalingSettingsDescription = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.AutoScalingSettingsDescriptionOps._
    s.toJava
  }

  implicit def toJavaBillingModeSummary(s: ScalaBillingModeSummary): JavaBillingModeSummary = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.BillingModeSummaryOps._
    s.toJava
  }

  implicit def toJavaReplicaGlobalSecondaryIndexSettingsDescriptionList(
      s: Seq[ScalaReplicaGlobalSecondaryIndexSettingsDescription]
  ): util.List[JavaReplicaGlobalSecondaryIndexSettingsDescription] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ReplicaGlobalSecondaryIndexSettingsDescriptionOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaScalaReplicaGlobalSecondaryIndexSettingsUpdateList(
      s: Seq[ScalaReplicaGlobalSecondaryIndexSettingsUpdate]
  ): util.List[JavaReplicaGlobalSecondaryIndexSettingsUpdate] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ReplicaGlobalSecondaryIndexSettingsUpdateOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaCreateReplicaAction(s: ScalaCreateReplicaAction): JavaCreateReplicaAction = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.CreateReplicaActionOps._
    s.toJava
  }

  implicit def toJavaDeleteReplicaAction(s: ScalaDeleteReplicaAction): JavaDeleteReplicaAction = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DeleteReplicaActionOps._
    s.toJava
  }

  implicit def toJavaConditionMap(s: Map[String, ScalaCondition]): util.Map[String, JavaCondition] = {
    s.mapValues(_.toJava).asJava
  }

  implicit def toJavaSequenceNumberRange(s: ScalaSequenceNumberRange): JavaSequenceNumberRange = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.SequenceNumberRangeOps._
    s.toJava
  }

  implicit def toJavaLocalSecondaryIndexInfoList(
      s: Seq[ScalaLocalSecondaryIndexInfo]
  ): util.List[JavaLocalSecondaryIndexInfo] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.LocalSecondaryIndexInfoOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaShardList(s: Seq[ScalaShard]): util.List[JavaShard] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ShardOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaGet(s: ScalaGet): JavaGet = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.GetOps._
    s.toJava
  }

  implicit def toJavaTransactGetItem(s: Seq[ScalaTransactGetItem]): util.List[JavaTransactGetItem] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.TransactGetItemOps._
    s.map(_.toJava).asJava
  }

//  implicit def toJavaItemResponseList(s: Seq[ScalaItemResponse]): util.List[JavaItemResponse] = {
//    s.map(_.toJava).asJava
//  }

  implicit def toJavaConditionCheck(s: ScalaConditionCheck): JavaConditionCheck = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ConditionCheckOps._
    s.toJava
  }

  implicit def toJavaPut(s: ScalaPut): JavaPut = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.PutOps._
    s.toJava
  }

  implicit def toJavaDelete(s: ScalaDelete): JavaDelete = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DeleteOps._
    s.toJava
  }

  implicit def toJavaUpdate(s: ScalaUpdate): JavaUpdate = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateOps._
    s.toJava
  }

  implicit def toJavaTransactWriteItemList(s: Seq[ScalaTransactWriteItem]): util.List[JavaTransactWriteItem] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.TransactWriteItemOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaPointInTimeRecoverySpecification(
      s: ScalaPointInTimeRecoverySpecification
  ): JavaPointInTimeRecoverySpecification = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.PointInTimeRecoverySpecificationOps._
    s.toJava
  }

  implicit def toJavaReplicaUpdateList(s: Seq[ScalaReplicaUpdate]): util.List[JavaReplicaUpdate] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ReplicaUpdateOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaGlobalTableGlobalSecondaryIndexSettingsUpdateList(
      s: Seq[ScalaGlobalTableGlobalSecondaryIndexSettingsUpdate]
  ): util.List[JavaGlobalTableGlobalSecondaryIndexSettingsUpdate] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.GlobalTableGlobalSecondaryIndexSettingsUpdateOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaReplicaSettingsUpdateList(
      s: Seq[ScalaReplicaSettingsUpdate]
  ): util.List[JavaReplicaSettingsUpdate] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ReplicaSettingsUpdateOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaGlobalSecondaryIndexUpdateList(
      s: Seq[ScalaGlobalSecondaryIndexUpdate]
  ): util.List[JavaGlobalSecondaryIndexUpdate] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.GlobalSecondaryIndexUpdateOps._
    s.map(_.toJava).asJava
  }

  implicit def toJavaTimeToLiveSpecification(s: ScalaTimeToLiveSpecification): JavaTimeToLiveSpecification = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.TimeToLiveSpecificationOps._
    s.toJava
  }

  implicit def toJavaPutRequest(s: ScalaPutRequest): JavaPutRequest = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.PutRequestOps._
    s.toJava
  }

  implicit def toJavaDeleteRequest(s: ScalaDeleteRequest): JavaScalaDeleteRequest = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DeleteRequestOps._
    s.toJava
  }

  implicit def toScalaReturnConsumedCapacity(
      j: Option[JavaReturnConsumedCapacity]
  ): Option[ScalaReturnConsumedCapacity] = {
    j.map(_.toString).map(ScalaReturnConsumedCapacity.withName)
  }

  implicit def toScalaWriteRequestListMap(
      j: Option[util.Map[String, util.List[JavaWriteRequest]]]
  ): Option[Map[String, Seq[ScalaWriteRequest]]] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.WriteRequestOps._
    j.map(_.asScala.toMap.mapValues(_.asScala.toSeq.map(_.toScala)))
  }

  implicit def toScalaReturnItemCollectionMetrics(
      j: Option[JavaReturnItemCollectionMetrics]
  ): Option[ScalaReturnItemCollectionMetrics] = {
    j.map(_.toString).map(ScalaReturnItemCollectionMetrics.withName)
  }

  implicit def toScalaReplica(j: util.List[JavaReplica]): Seq[ScalaReplica] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ReplicaOps._
    j.asScala.map(_.toScala)
  }

  implicit def toScalaAttributeDefinitionList(
      j: util.List[JavaAttributeDefinition]
  ): Seq[ScalaAttributeDefinition] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.AttributeDefinitionOps._
    j.asScala.map(_.toScala)
  }

  implicit def toScalaKeySchemaElementList(
      j: util.List[JavaKeySchemaElement]
  ): Seq[ScalaKeySchemaElement] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.KeySchemaElementOps._
    j.asScala.map(_.toScala)
  }

  implicit def toScalaLocalSecondaryIndexList(
      j: util.List[JavaLocalSecondaryIndex]
  ): Seq[ScalaLocalSecondaryIndex] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.LocalSecondaryIndexOps._
    j.asScala.map(_.toScala)
  }

  implicit def toScalaGlobalSecondaryIndex(
      j: util.List[JavaGlobalSecondaryIndex]
  ): Seq[ScalaGlobalSecondaryIndex] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.GlobalSecondaryIndexOps._
    j.asScala.map(_.toScala)
  }

  implicit def toScalaBillingMode(j: Option[JavaBillingMode]): Option[ScalaBillingMode] = {
    j.map(_.toString).map(ScalaBillingMode.withName)
  }

  implicit def toScalaProvisionedThroughput(
      j: Option[JavaProvisionedThroughput]
  ): Option[ScalaProvisionedThroughput] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ProvisionedThroughputOps._
    j.map(_.toScala)
  }

  implicit def toScalaStreamSpecification(
      j: Option[JavaStreamSpecification]
  ): Option[ScalaStreamSpecification] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.StreamSpecificationOps._
    j.map(_.toScala)
  }

  implicit def toScalaExpectedAttributeValueMap(
      j: Option[util.Map[String, JavaExpectedAttributeValue]]
  ): Option[Map[String, ScalaExpectedAttributeValue]] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ExpectedAttributeValueOps._
    j.map(_.asScala.toMap.mapValues(_.toScala))
  }

  implicit def toScalaConditionalOperator(j: Option[JavaConditionalOperator]): Option[ScalaConditionalOperator] = {
    j.map(_.toString).map(ScalaConditionalOperator.withName)
  }

  implicit def toScalaReturnValue(j: Option[JavaReturnValue]): Option[ScalaReturnValue] = {
    j.map(_.toString).map(ScalaReturnValue.withName)
  }

  implicit def toScalaStringMap(j: Option[util.Map[String, String]]): Option[Map[String, String]] = {
    j.map(_.asScala.toMap)
  }

  implicit def toScalaReturnValuesOnConditionCheckFailure(
      j: Option[JavaReturnValuesOnConditionCheckFailure]
  ): Option[ScalaReturnValuesOnConditionCheckFailure] = {
    j.map(_.toString).map(ScalaReturnValuesOnConditionCheckFailure.withName)
  }

  implicit def toScalaShardIteratorType(j: Option[JavaShardIteratorType]): Option[ScalaShardIteratorType] = {
    j.map(_.toString).map(ScalaShardIteratorType.withName)
  }

  implicit def toScalaBackupTypeFilter(j: Option[JavaBackupTypeFilter]): Option[ScalaBackupTypeFilter] = {
    j.map(_.toString).map(ScalaBackupTypeFilter.withName)
  }

  implicit def toScalaSelect(j: Option[JavaSelect]): Option[ScalaSelect] = {
    j.map(_.toString).map(ScalaSelect.withName)
  }

  implicit def toScalaStringList(j: Option[util.List[String]]): Option[Seq[String]] = {
    j.map(_.asScala)
  }

  implicit def toScalaConditionMap(j: Option[util.Map[String, JavaCondition]]): Option[Map[String, ScalaCondition]] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ConditionOps._
    j.map(_.asScala.toMap.mapValues(_.toScala))
  }

  implicit def toScalaTransactGetItemList(
      j: Option[util.List[JavaTransactGetItem]]
  ): Option[Seq[ScalaTransactGetItem]] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.TransactGetItemOps._
    j.map(_.asScala.map(_.toScala))
  }

  implicit def toScalaTransactWriteItemList(
      j: Option[util.List[JavaTransactWriteItem]]
  ): Option[Seq[ScalaTransactWriteItem]] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.TransactWriteItemOps._
    j.map(_.asScala.map(_.toScala))
  }

  implicit def toScalaPointInTimeRecoverySpecification(
      j: Option[JavaPointInTimeRecoverySpecification]
  ): Option[ScalaPointInTimeRecoverySpecification] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.PointInTimeRecoverySpecificationOps._
    j.map(_.toScala)
  }

  implicit def toScalaAutoScalingSettingsUpdate(
      j: Option[JavaAutoScalingSettingsUpdate]
  ): Option[ScalaAutoScalingSettingsUpdate] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.AutoScalingSettingsUpdateOps._
    j.map(_.toScala)
  }

  implicit def toScalaGlobalTableGlobalSecondaryIndexSettingsUpdateList(
      j: Option[util.List[JavaGlobalTableGlobalSecondaryIndexSettingsUpdate]]
  ): Option[Seq[ScalaGlobalTableGlobalSecondaryIndexSettingsUpdate]] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.GlobalTableGlobalSecondaryIndexSettingsUpdateOps._
    j.map(_.asScala.map(_.toScala))
  }

  implicit def toScalaReplicaSettingsUpdate(
      j: Option[util.List[JavaReplicaSettingsUpdate]]
  ): Option[Seq[ScalaReplicaSettingsUpdate]] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ReplicaSettingsUpdateOps._
    j.map(_.asScala.map(_.toScala))
  }

  implicit def toScalaAttributeValueUpdateMap(
      j: Option[util.Map[String, JavaAttributeValueUpdate]]
  ): Option[Map[String, ScalaAttributeValueUpdate]] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.AttributeValueUpdateOps._
    j.map(_.asScala.toMap.mapValues(_.toScala))
  }

  implicit def toScalaGlobalSecondaryIndexUpdateList(
      j: Option[util.List[JavaGlobalSecondaryIndexUpdate]]
  ): Option[Seq[ScalaGlobalSecondaryIndexUpdate]] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.GlobalSecondaryIndexUpdateOps._
    j.map(_.asScala.map(_.toScala))
  }

  implicit def toScalaPutRequest(j: Option[JavaPutRequest]): Option[ScalaPutRequest] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.PutRequestOps._
    j.map(_.toScala)
  }

  implicit def toScalaDeleteRequest(j: Option[DeleteRequest]): Option[ScalaDeleteRequest] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DeleteRequestOps._
    j.map(_.toScala)
  }

  implicit def toScalaIndexStatus(j: Option[JavaIndexStatus]): Option[ScalaIndexStatus] = {
    j.map(_.toString).map(ScalaIndexStatus.withName)
  }

  implicit def toScalaAutoScalingSettingsDescription(
      j: Option[JavaAutoScalingSettingsDescription]
  ): Option[ScalaAutoScalingSettingsDescription] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.AutoScalingSettingsDescriptionOps._
    j.map(_.toScala)
  }

  implicit def toScalaSSESpecification(j: Option[JavaSSESpecification]): Option[ScalaSSESpecification] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.SSESpecificationOps._
    j.map(_.toScala)
  }

  implicit def to(
      j: Option[util.Map[String, util.List[util.Map[String, JavaAttributeValue]]]]
  ): Option[Map[String, Seq[Map[String, ScalaAttributeValue]]]] = {
    import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.AttributeValueOps._
    j.map(_.asScala.toMap.mapValues(_.asScala.map(_.asScala.toMap.mapValues(_.toScala))))
  }

  implicit def fromSeqToJUL[A](s: Seq[A]): util.Collection[A] = s.asJava

}
