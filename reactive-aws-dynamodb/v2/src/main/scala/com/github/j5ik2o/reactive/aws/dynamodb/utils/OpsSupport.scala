package com.github.j5ik2o.reactive.aws.dynamodb.utils

import java.{ lang, util }

import com.github.j5ik2o.reactive.aws.dynamodb.model.{
  DeleteRequest => ScalaDeleteRequest,
  AttributeDefinition => ScalaAttributeDefinition,
  AttributeValue => ScalaAttributeValue,
  AutoScalingPolicyDescription => ScalaAutoScalingPolicyDescription,
  AutoScalingPolicyUpdate => ScalaAutoScalingPolicyUpdate,
  AutoScalingSettingsDescription => ScalaAutoScalingSettingsDescription,
  AutoScalingSettingsUpdate => ScalaAutoScalingSettingsUpdate,
  AutoScalingTargetTrackingScalingPolicyConfigurationDescription => ScalaAutoScalingTargetTrackingScalingPolicyConfigurationDescription,
  AutoScalingTargetTrackingScalingPolicyConfigurationUpdate => ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate,
  BackupDescription => ScalaBackupDescription,
  BackupDetails => ScalaBackupDetails,
  BackupSummary => ScalaBackupSummary,
  BillingModeSummary => ScalaBillingModeSummary,
  Capacity => ScalaCapacity,
  Condition => ScalaCondition,
  ConditionCheck => ScalaConditionCheck,
  ConsumedCapacity => ScalaConsumedCapacity,
  ContinuousBackupsDescription => ScalaContinuousBackupsDescription,
  CreateGlobalSecondaryIndexAction => ScalaCreateGlobalSecondaryIndexAction,
  CreateReplicaAction => ScalaCreateReplicaAction,
  Delete => ScalaDelete,
  DeleteGlobalSecondaryIndexAction => ScalaDeleteGlobalSecondaryIndexAction,
  DeleteReplicaAction => ScalaDeleteReplicaAction,
  Endpoint => ScalaEndpoint,
  ExpectedAttributeValue => ScalaExpectedAttributeValue,
  Get => ScalaGet,
  GlobalSecondaryIndex => ScalaGlobalSecondaryIndex,
  GlobalSecondaryIndexUpdate => ScalaGlobalSecondaryIndexUpdate,
  GlobalTable => ScalaGlobalTable,
  GlobalTableDescription => ScalaGlobalTableDescription,
  GlobalTableGlobalSecondaryIndexSettingsUpdate => ScalaGlobalTableGlobalSecondaryIndexSettingsUpdate,
  Identity => ScalaIdentity,
  ItemCollectionMetrics => ScalaItemCollectionMetrics,
  ItemResponse => ScalaItemResponse,
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
  SSESpecification => ScalaSSESpecification,
  SequenceNumberRange => ScalaSequenceNumberRange,
  Shard => ScalaShard,
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
  DeleteRequest => JavaScalaDeleteRequest,
  AttributeDefinition => JavaAttributeDefinition,
  AttributeValue => JavaAttributeValue,
  AutoScalingPolicyDescription => JavaAutoScalingPolicyDescription,
  AutoScalingPolicyUpdate => JavaAutoScalingPolicyUpdate,
  AutoScalingSettingsDescription => JavaAutoScalingSettingsDescription,
  AutoScalingSettingsUpdate => JavaAutoScalingSettingsUpdate,
  AutoScalingTargetTrackingScalingPolicyConfigurationDescription => JavaAutoScalingTargetTrackingScalingPolicyConfigurationDescription,
  AutoScalingTargetTrackingScalingPolicyConfigurationUpdate => JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate,
  BackupDescription => JavaBackupDescription,
  BackupDetails => JavaBackupDetails,
  BackupSummary => JavaBackupSummary,
  BillingModeSummary => JavaBillingModeSummary,
  Capacity => JavaCapacity,
  Condition => JavaCondition,
  ConditionCheck => JavaConditionCheck,
  ConsumedCapacity => JavaConsumedCapacity,
  ContinuousBackupsDescription => JavaContinuousBackupsDescription,
  CreateGlobalSecondaryIndexAction => JavaCreateGlobalSecondaryIndexAction,
  CreateReplicaAction => JavaCreateReplicaAction,
  Delete => JavaDelete,
  DeleteGlobalSecondaryIndexAction => JavaDeleteGlobalSecondaryIndexAction,
  DeleteReplicaAction => JavaDeleteReplicaAction,
  Endpoint => JavaEndpoint,
  ExpectedAttributeValue => JavaExpectedAttributeValue,
  Get => JavaGet,
  GlobalSecondaryIndex => JavaGlobalSecondaryIndex,
  GlobalSecondaryIndexUpdate => JavaGlobalSecondaryIndexUpdate,
  GlobalTable => JavaGlobalTable,
  GlobalTableDescription => JavaGlobalTableDescription,
  GlobalTableGlobalSecondaryIndexSettingsUpdate => JavaGlobalTableGlobalSecondaryIndexSettingsUpdate,
  Identity => JavaIdentity,
  ItemCollectionMetrics => JavaItemCollectionMetrics,
  ItemResponse => JavaItemResponse,
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
  SSESpecification => JavaSSESpecification,
  SequenceNumberRange => JavaSequenceNumberRange,
  Shard => JavaShard,
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

  implicit def toJavaAttributeValueList(s: ScalaAttributeValueList): util.List[JavaAttributeValue] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaAttributeValue(s: ScalaAttributeValue): JavaAttributeValue = {
    s.toJava
  }

  implicit def toJavaAutoScalingTargetTrackingScalingPolicyConfigurationDescription(
      s: ScalaAutoScalingTargetTrackingScalingPolicyConfigurationDescription
  ): JavaAutoScalingTargetTrackingScalingPolicyConfigurationDescription = {
    s.toJava
  }

  implicit def toJavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate(
      s: ScalaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate
  ): JavaAutoScalingTargetTrackingScalingPolicyConfigurationUpdate = {
    s.toJava
  }

  implicit def toJavaAutoScalingPolicyDescription(
      s: ScalaAutoScalingPolicyDescription
  ): JavaAutoScalingPolicyDescription = {
    s.toJava
  }

  implicit def toJavaAutoScalingPolicyDescriptionList(
      s: Seq[ScalaAutoScalingPolicyDescription]
  ): util.Collection[JavaAutoScalingPolicyDescription] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaAutoScalingPolicyUpdate(s: ScalaAutoScalingPolicyUpdate): JavaAutoScalingPolicyUpdate = {
    s.toJava
  }

  implicit def toJavaBackupDetails(s: ScalaBackupDetails): JavaBackupDetails = {
    s.toJava
  }

  implicit def toJavaSourceTableDetails(s: ScalaSourceTableDetails): JavaSourceTableDetails = {
    s.toJava
  }

  implicit def toJavaSourceTableFeatureDetails(s: ScalaSourceTableFeatureDetails): JavaSourceTableFeatureDetails = {
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

  implicit def toJavaConsumedCapacityList(s: Seq[ScalaConsumedCapacity]): util.List[JavaConsumedCapacity] = {
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
    s.toJava
  }

  implicit def toJava(s: Map[String, ScalaCapacity]): util.Map[String, JavaCapacity] = {
    s.mapValues(_.toJava).asJava
  }

  implicit def toJavaPointInTimeRecoveryDescription(
      s: ScalaPointInTimeRecoveryDescription
  ): JavaPointInTimeRecoveryDescription = {
    s.toJava
  }

  implicit def toJavaScalaKeySchemaElementList(s: Seq[ScalaKeySchemaElement]): util.List[JavaKeySchemaElement] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaProjection(s: ScalaProjection): JavaProjection = {
    s.toJava
  }

  implicit def toJavaProvisionedThroughput(s: ScalaProvisionedThroughput): JavaProvisionedThroughput = {
    s.toJava
  }

  implicit def toJavaReplicaList(s: Seq[ScalaReplica]): util.List[JavaReplica] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaGlobalTableDescription(s: ScalaGlobalTableDescription): JavaGlobalTableDescription = {
    s.toJava
  }

  implicit def toJavaAttributeDefinitionList(s: Seq[ScalaAttributeDefinition]): util.List[JavaAttributeDefinition] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaLocalSecondaryIndexList(s: Seq[ScalaLocalSecondaryIndex]): util.List[JavaLocalSecondaryIndex] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaGlobalSecondaryIndexList(
      s: Seq[ScalaGlobalSecondaryIndex]
  ): util.List[JavaGlobalSecondaryIndex] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaStreamSpecification(s: ScalaStreamSpecification): JavaStreamSpecification = {
    s.toJava
  }

  implicit def toJavaSSESpecification(s: ScalaSSESpecification): JavaSSESpecification = {
    s.toJava
  }

  implicit def toJavaTableDescription(s: ScalaTableDescription): JavaTableDescription = {
    s.toJava
  }

  implicit def toJavaBackupDescription(s: ScalaBackupDescription): JavaBackupDescription = {
    s.toJava
  }

  implicit def toJavaScalaExpectedAttributeValueMap(
      s: Map[String, ScalaExpectedAttributeValue]
  ): util.Map[String, JavaExpectedAttributeValue] = {
    s.mapValues(_.toJava).asJava
  }

  implicit def toJavaConsumedCapacity(s: ScalaConsumedCapacity): JavaConsumedCapacity = {
    s.toJava
  }

  implicit def toJavaItemCollectionMetrics(s: ScalaItemCollectionMetrics): JavaItemCollectionMetrics = {
    s.toJava
  }

  implicit def toJavaContinuousBackupsDescription(
      s: ScalaContinuousBackupsDescription
  ): JavaContinuousBackupsDescription = {
    s.toJava
  }

  implicit def toJavaEndpointList(s: Seq[ScalaEndpoint]): util.List[JavaEndpoint] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaReplicaSettingsDescriptionList(
      s: Seq[ScalaReplicaSettingsDescription]
  ): util.List[JavaReplicaSettingsDescription] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaStreamDescription(s: ScalaStreamDescription): JavaStreamDescription = {
    s.toJava
  }

  implicit def toJavaTimeToLiveDescription(s: ScalaTimeToLiveDescription): JavaTimeToLiveDescription = {
    s.toJava
  }

  implicit def toJavaRecordList(s: Seq[ScalaRecord]): util.List[JavaRecord] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaProvisionedThroughputDescription(
      s: ScalaProvisionedThroughputDescription
  ): JavaProvisionedThroughputDescription = {
    s.toJava
  }

  implicit def toJavaUpdateGlobalSecondaryIndexAction(
      s: ScalaUpdateGlobalSecondaryIndexAction
  ): JavaUpdateGlobalSecondaryIndexAction = {
    s.toJava
  }

  implicit def toJavaCreateGlobalSecondaryIndexAction(
      s: ScalaCreateGlobalSecondaryIndexAction
  ): JavaCreateGlobalSecondaryIndexAction = {
    s.toJava
  }

  implicit def toJavaDeleteGlobalSecondaryIndexAction(
      s: ScalaDeleteGlobalSecondaryIndexAction
  ): JavaDeleteGlobalSecondaryIndexAction = {
    s.toJava
  }

  implicit def toJavaReplicaDescriptionList(s: Seq[ScalaReplicaDescription]): util.List[JavaReplicaDescription] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaAutoScalingSettingsUpdate(s: ScalaAutoScalingSettingsUpdate): JavaAutoScalingSettingsUpdate = {
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
    s.map(_.toJava).asJava
  }

  implicit def toJavaGlobalTableList(s: Seq[ScalaGlobalTable]): util.List[JavaGlobalTable] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaStreamList(s: Seq[ScalaStream]): util.List[JavaStream] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaTagList(s: Seq[ScalaTag]): util.List[JavaTag] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaStreamRecord(s: ScalaStreamRecord): JavaStreamRecord = {
    s.toJava
  }

  implicit def toJavaIdentity(s: ScalaIdentity): JavaIdentity = {
    s.toJava
  }

  implicit def toJavaAutoScalingSettingsDescription(
      s: ScalaAutoScalingSettingsDescription
  ): JavaAutoScalingSettingsDescription = {
    s.toJava
  }

  implicit def toJavaBillingModeSummary(s: ScalaBillingModeSummary): JavaBillingModeSummary = {
    s.toJava
  }

  implicit def toJavaReplicaGlobalSecondaryIndexSettingsDescriptionList(
      s: Seq[ScalaReplicaGlobalSecondaryIndexSettingsDescription]
  ): util.List[JavaReplicaGlobalSecondaryIndexSettingsDescription] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaScalaReplicaGlobalSecondaryIndexSettingsUpdateList(
      s: Seq[ScalaReplicaGlobalSecondaryIndexSettingsUpdate]
  ): util.List[JavaReplicaGlobalSecondaryIndexSettingsUpdate] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaCreateReplicaAction(s: ScalaCreateReplicaAction): JavaCreateReplicaAction = {
    s.toJava
  }

  implicit def toJavaDeleteReplicaAction(s: ScalaDeleteReplicaAction): JavaDeleteReplicaAction = {
    s.toJava
  }

  implicit def toJavaConditionMap(s: Map[String, ScalaCondition]): util.Map[String, JavaCondition] = {
    s.mapValues(_.toJava).asJava
  }

  implicit def toJavaSequenceNumberRange(s: ScalaSequenceNumberRange): JavaSequenceNumberRange = {
    s.toJava
  }

  implicit def toJavaLocalSecondaryIndexInfoList(
      s: Seq[ScalaLocalSecondaryIndexInfo]
  ): util.List[JavaLocalSecondaryIndexInfo] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaShardList(s: Seq[ScalaShard]): util.List[JavaShard] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaGet(s: ScalaGet): JavaGet = {
    s.toJava
  }

  implicit def toJavaTransactGetItem(s: Seq[ScalaTransactGetItem]): util.List[JavaTransactGetItem] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaItemResponseList(s: Seq[ScalaItemResponse]): util.List[JavaItemResponse] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaConditionCheck(s: ScalaConditionCheck): JavaConditionCheck = {
    s.toJava
  }

  implicit def toJavaPut(s: ScalaPut): JavaPut = {
    s.toJava
  }

  implicit def toJavaDelete(s: ScalaDelete): JavaDelete = {
    s.toJava
  }

  implicit def toJavaUpdate(s: ScalaUpdate): JavaUpdate = {
    s.toJava
  }

  implicit def toJavaTransactWriteItemList(s: Seq[ScalaTransactWriteItem]): util.List[JavaTransactWriteItem] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaPointInTimeRecoverySpecification(
      s: ScalaPointInTimeRecoverySpecification
  ): JavaPointInTimeRecoverySpecification = {
    s.toJava
  }

  implicit def toJavaReplicaUpdateList(s: Seq[ScalaReplicaUpdate]): util.List[JavaReplicaUpdate] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaGlobalTableGlobalSecondaryIndexSettingsUpdateList(
      s: Seq[ScalaGlobalTableGlobalSecondaryIndexSettingsUpdate]
  ): util.List[JavaGlobalTableGlobalSecondaryIndexSettingsUpdate] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaReplicaSettingsUpdateList(
      s: Seq[ScalaReplicaSettingsUpdate]
  ): util.List[JavaReplicaSettingsUpdate] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaGlobalSecondaryIndexUpdateList(
      s: Seq[ScalaGlobalSecondaryIndexUpdate]
  ): util.List[JavaGlobalSecondaryIndexUpdate] = {
    s.map(_.toJava).asJava
  }

  implicit def toJavaTimeToLiveSpecification(s: ScalaTimeToLiveSpecification): JavaTimeToLiveSpecification = {
    s.toJava
  }

  implicit def toJavaPutRequest(s: ScalaPutRequest): JavaPutRequest = {
    s.toJava
  }

  implicit def toJavaDeleteRequest(s: ScalaDeleteRequest): JavaScalaDeleteRequest = {
    s.toJava
  }

  implicit def fromSeqToJUL[A](s: Seq[A]): util.Collection[A] = s.asJava

}
