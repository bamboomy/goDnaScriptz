package genetic;
import java.util.ArrayList;
class Thought297 extends Thought{
private static ArrayList<Thought297> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 698.1234431340617;
private double fd1 = 451.5681213540995;
private Thought fo0 = null;
private Thought fo1 = null;
Thought297 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought297 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought297 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought297 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought297 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought297 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought297 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought297 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought297 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought297 instance = new Thought297 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought297 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought297 instance = new Thought297 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought297 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought297 instance = new Thought297 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought297 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought297 instance = new Thought297 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought297 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought297 instance = new Thought297 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought297 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought297 instance = new Thought297 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought297 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought297 instance = new Thought297 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought297 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought297 instance = new Thought297 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    Thought lo0 = Thought206.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[0][0] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought95.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    Thought lo2 = Thought83.getInstance(fd1, fd0, fd1, fd0);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    Thought lo0 = Thought297.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    Output.points[0][1] -= fd0;
    ab1 = ab2 && ab3;
    Output.points[0][2] += fd1;
    Thought lo1 = Thought140.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
    boolean lb2 = true;
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    boolean lb3 = true;
    fd0 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
    Thought lo0 = Thought129.getInstance(fo1, fo0, fo1, fo0);
    Output.points[0][3] += fd1;
    boolean lb1 = false;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    boolean lb2 = true;
    boolean lb3 = true;
    lb2 = fd1 > ad1;
    if (lb3) {
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    ab2 = ab3 && ab4;
    boolean lb0 = true;
    ab4 = !fb0;
    fb1 = !lb0;
    for(int i0=0; i0<10; i0++){
        ad4 *= -1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Thought lo1 = Thought358.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
}
        boolean lb2 = true;
if(fo1 != null){
          ab1 = fo1.m2(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fb1 = lb2 && lb0;
        ad1 = ad2 - ad3;
        ab1 = ab2 || ab3;
        boolean lb3 = true;
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb2);
}
        Output.points[0][4] += ad4;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        lb3 = fd0 < fd1;
        Thought lo4 = Thought331.getInstance(ad1, ad2, ad3, ad4);
        boolean lb5 = false;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    double ld0 = 340.2846812783533;
if(ao1 != null){
      fb0 = ao1.m2();
}
    ld0 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    ld0 = fd0 + fd1;
    fb1 = fb0 || fb1;
    double ld1 = 220.34891046568686;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    ld0 *= -1;
    fb1 = !fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ad1;
    for(int i0=0; i0<10; i0++){
        double ld0 = 151.59442405669665;
        fb1 = !fb0;
        ad1 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
        Output.points[0][5] -= fd1;
        }
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 352.210453014386;
    boolean lb1 = false;
    lb1 = fd0 > fd1;
    boolean lb2 = true;
    double ld3 = 47.24915095252356;
    lb2 = ld0 < ld3;
if(ao1 != null){
      fd0 = ao1.m3();
}
    fd1 = ld0 + ld3;
    ab1 = fd0 < fd1;
    ab2 = !ab3;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
    ad1 = ad2 + ad3;
    ab1 = ad4 < fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    ad4 *= -1;
    Thought lo0 = Thought204.getInstance(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 || ab1;
    Output.points[0][6] += ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    ab2 = !ab3;
    Thought lo1 = Thought373.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb2 = true;
if(ao3 != null){
      ab3 = ao3.m2(ab4, fb0, fb1, lb2);
}
    ab1 = ab2 && ab3;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 233.7727148978598;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ld0 *= -1;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    Output.points[0][7] -= fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld1 = 722.5972397813882;
    boolean lb2 = false;
    fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(ld0, ld1, fd0, fd1);
}
    ld0 = ld1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0);
}
    boolean lb3 = false;
    Thought lo4 = Thought293.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, lb3);
}

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
        fd1 = fd0 - fd1;
    fd0 *= -1;
    fb1 = ab1 && ab2;
    boolean lb0 = true;
    Thought lo1 = Thought7.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = lb0 && ab1;
    Thought lo2 = Thought205.getInstance(fd0, fd1, fd0, fd1);
    Thought lo3 = Thought48.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(ab4, fb0, fb1, lb0);
}
    boolean lb4 = false;
    if (lb4) {
        Thought lo5 = Thought237.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
        fb0 = !fb1;
        lb0 = lb4 && ab1;
        fd0 *= -1;
        ab2 = fd1 < fd0;
}
Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 769.6211112307083;
    double ld1 = 101.66188303739153;
    ld1 *= -1;
    fb1 = ad1 > ad2;
    Output.points[0][8] += ad3;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    fb0 = fb1 || lb2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3);
}
    double ld3 = 127.17685207675774;
    ad3 = ad4 + fd0;
    fb0 = fb1 || lb2;
    double ld4 = 974.8394233592919;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab1 = fd0 > fd1;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    boolean lb0 = true;
    ad1 *= -1;
    Thought lo1 = Thought169.getInstance();
    ab1 = ab2 || ab3;
    ad2 = ad3 - ad4;
if(fo0 != null){
          ab4 = fo0.m2(fb0, fb1, lb0, ab1);
}
    ab2 = !ab3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}

Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 1.841871092111735;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought26.getInstance(ao2, ao3, ao4, fo0);
    double ld2 = 319.21809924979476;
    ld0 = ld2 + fd0;
    fd1 = ld0 - ld2;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, ld2);
}
    boolean lb3 = false;
    lb3 = !fb0;
    fb1 = fd0 > fd1;
    ld0 = ld2 + fd0;
    double ld4 = 547.5996963447279;
    lb3 = fb0 && fb1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, ld2, ld4);
}
    lb3 = fd0 < fd1;
if(ao1 != null){
      ao1.m3();
}
    ld0 = ld2 - ld4;
    fb0 = fb1 && lb3;
    fb0 = fd0 > fd1;
    Thought lo5 = Thought304.getInstance(fb1, lb3, fb0, fb1);
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld0, ld2, ld4, fd0, lb3, fb0, fb1, lb3);
}
        fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ld0, ld2, ld4, fd0, fb0, fb1, lb3, fb0);
}
    fd1 = ld0 - ld2;
    boolean lb6 = true;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb3, lb6);
}

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Thought lo0 = Thought349.getInstance(ao2, ao3, ao4, fo0);
    ad1 *= -1;
    fb1 = ad2 > ad3;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
    fb0 = ad2 > ad3;
    double ld1 = 848.222854584441;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4();
}
        fb1 = ld1 < ad1;
        for(int i1=0; i1<10; i1++){
            fb0 = !fb1;
if(fo0 != null){
              ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
              fo1.m1(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
              fo0.m1(fd1, ld1, ad1, ad2, fb0, fb1, fb0, fb1);
}
            boolean lb2 = false;
            ad3 = ad4 + fd0;
            boolean lb3 = true;
            fd1 *= -1;
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb2, lb3, fb0, fb1);
}
            boolean lb4 = true;
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
              lb2 = fo1.m2(ld1, ad1, ad2, ad3);
}
if(ao1 != null){
              lb3 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld1);
}
            ad1 *= -1;
if(ao1 != null){
              fo1 = ao1.m4();
}
if(ao2 != null){
              ao2.m3(lb4, fb0, fb1, lb2);
}
}}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = fd0 < fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought312.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
    fb1 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        Thought lo2 = Thought88.getInstance(fd0, fd1, fd0, fd1);
    boolean lb3 = false;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    lb0 = lb3 || ab1;

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(ao1 != null){
          ao1.m1();
}
if(ao2 != null){
      ad2 = ao2.m3(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ab3 = ao2.m2(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    boolean lb1 = true;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    ab4 = fd0 > fd1;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    ab4 = fd1 > ad1;
    boolean lb3 = true;
    if (ab4) {
        ad2 = ad3 + ad4;
        fb0 = fd0 < fd1;
        fb1 = lb0 && lb1;
        boolean lb4 = false;
if(fo1 != null){
          ad1 = fo1.m3(lb1, lb2, lb3, ab1);
}
        ab2 = ad2 < ad3;
if(ao1 != null){
          ab3 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb4);
}
}
Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    Thought lo1 = Thought303.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[1][0] -= fd1;
    lb0 = !fb0;
    fb1 = lb0 && fb0;
    fb1 = !lb0;
    fb0 = fd0 > fd1;
    Thought lo2 = Thought216.getInstance(fb1, lb0, fb0, fb1);
    boolean lb3 = false;
    lb0 = fd0 > fd1;
    boolean lb4 = true;
    fd0 = fd1 - fd0;
    Thought lo5 = Thought307.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb3, lb4, fb0, fb1);
    Output.points[1][1] += fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, lb0, lb3, lb4, fb0);
}
        fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought394.getInstance(fo0, fo1, fo0, fo1);
    boolean lb1 = false;
    double ld2 = 841.0918848489579;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld2, fd0, fd1);
}
        lb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
}
    boolean lb3 = true;
if(fo1 != null){
          ab1 = fo1.m2();
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, lb3);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb4 = true;
    ab4 = ld2 > fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
        double ld0 = 185.5320052055466;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
        Output.points[1][2] -= ad4;
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3();
}
    Thought lo0 = Thought288.getInstance(ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
    ad2 = ad3 - ad4;
    Thought lo1 = Thought89.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
    boolean lb2 = false;
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb2);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ab4 = fb0 && fb1;
    lb2 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    boolean lb3 = false;
    ab1 = ab2 && ab3;
    ad2 = ad3 - ad4;
    ab4 = !fb0;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought185.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad2 = ad3 + ad4;
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, ad1, ad2);
}
    Thought lo1 = Thought33.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
    ad1 *= -1;
    fb1 = ad2 > ad3;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Output.points[1][3] -= ad4;
if(ao3 != null){
      ao2 = ao3.m4(lb0, fb0, fb1, lb0);
}
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
        Output.points[1][4] -= fd0;
        Thought lo3 = Thought329.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, lb2, fb0, fb1, lb0);
if(ao2 != null){
          lb2 = ao2.m2(ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb2);
}
if(ao3 != null){
          ad2 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb2);
}
        boolean lb4 = false;
        Thought lo5 = Thought249.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
          fo1.m3(ad3, ad4, fd0, fd1);
}
        Thought lo6 = Thought201.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
        Output.points[1][5] += fd0;
        Thought lo7 = Thought89.getInstance();
        fd1 = ad1 + ad2;
}
Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought359.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
    ab2 = fd1 < fd0;
    fd1 *= -1;
    ab3 = !ab4;
    Thought lo1 = Thought74.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    ab3 = fd0 < fd1;
    if (ab4) {
        fb0 = fb1 && ab1;
        boolean lb2 = false;
        fd0 *= -1;
        fd1 = fd0 + fd1;
        double ld3 = 263.3238603220038;
if(fo0 != null){
          ab1 = fo0.m2(ld3, fd0, fd1, ld3, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 + ld3;
        fb1 = fd0 > fd1;
        Thought lo4 = Thought268.getInstance(fo1, ao1, ao2, ao3, lb2, ab1, ab2, ab3);
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ad2 *= -1;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1);
}
    Thought lo0 = Thought185.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    fd1 = ad1 - ad2;
    Thought lo1 = Thought4.getInstance();
    double ld2 = 254.84116126287853;
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(ab4, fb0, fb1, lb3);
}
    boolean lb4 = true;
    lb4 = ab1 && ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ld2 - ad1;
    ad2 *= -1;
    Thought lo5 = Thought73.getInstance(ad3, ad4, fd0, fd1, lb3, lb4, ab1, ab2);
    ld2 *= -1;
        ab3 = ab4 || fb0;
    ad1 = ad2 + ad3;

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    fb0 = fd1 < fd0;
    Output.points[1][6] += fd1;
    fb1 = lb0 && lb1;
    fb0 = fb1 && lb0;
    lb1 = fd0 < fd1;
    Thought lo2 = Thought234.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought226.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = fb1 && lb0;
    boolean lb4 = true;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    double ld5 = 471.5944712304477;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = lb4 && fb0;
    ld5 = fd0 - fd1;
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb4, fb0, fb1);
}
    lb0 = lb1 && lb4;
    ld5 *= -1;
    fb0 = fb1 || lb0;
    fd0 = fd1 - ld5;
    Thought lo6 = Thought86.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld5, fd0, lb1, lb4, fb0, fb1);

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    boolean lb0 = true;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, lb2, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    if (ab2) {
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        ab3 = ab4 && fb0;
if(fo1 != null){
          fd1 = fo1.m3();
}
        fb1 = fd0 < fd1;
        boolean lb3 = true;
        boolean lb4 = true;
        fd0 = fd1 + fd0;
        Thought lo5 = Thought378.getInstance(lb3, lb4, lb0, lb1);
        if (lb2) {
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
}}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    fb0 = ad1 > ad2;
    Output.points[1][7] -= ad3;
    fb1 = fb0 || fb1;
    ad4 = fd0 - fd1;
    fb0 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[1][8] += ad1;
    fb1 = fb0 || fb1;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    Output.points[2][0] += ad2;
    double ld0 = 684.3177512141652;
    fb0 = !fb1;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ld0;
    double ld1 = 530.9740531338148;
        boolean lb2 = true;
if(fo1 != null){
      lb2 = fo1.m2();
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought267.getInstance(fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    double ld1 = 541.1544422447487;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 < ad3;
    fb0 = ad4 > fd0;
    fb1 = fd1 > ad1;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought5.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld1 = 505.35682333325065;
    fb1 = ad1 > ad2;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    fb0 = ad3 < ad4;
if(ao4 != null){
      fb1 = ao4.m2(fd0, fd1, ld1, ad1);
}
    ad2 *= -1;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld1, ad1, ad2);
}
    fb0 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = false;

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    Output.points[2][1] += fd1;
    fb1 = ab1 || ab2;
    ab3 = fd0 > fd1;
    Thought lo0 = Thought230.getInstance(ao4, fo0, fo1, ao1);
    ab4 = fb0 && fb1;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    ab1 = ab2 && ab3;
    Thought lo1 = Thought351.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    ab4 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    Thought lo2 = Thought159.getInstance();
    ab1 = fd1 < fd0;
    boolean lb3 = false;
    double ld4 = 599.3668336000466;
    fd0 *= -1;
    ab1 = ab2 && ab3;

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    double ld0 = 588.696789083337;
if(ao1 != null){
      ao1.m2(ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m1(fd0, fd1, ld0, ad1, fb1, ab1, ab2, ab3);
}
    double ld1 = 95.37584542089857;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    ab3 = fd0 < fd1;
    boolean lb2 = false;
    double ld3 = 17.755834104504682;
    ld0 = ld1 - ld3;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    lb2 = fd1 < ld0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, ld3, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb2;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb2);
}

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[2][2] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
    Output.points[2][3] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    Output.points[2][4] += fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
        boolean lb0 = true;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought183.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    fd1 *= -1;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fb1 = !fb0;
    Output.points[2][5] += fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought258.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    Thought lo2 = Thought362.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    fb0 = fd0 > fd1;
    double ld3 = 873.833478739623;
    Thought lo4 = Thought45.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ld3, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3);
}
    lb0 = fd0 > fd1;
        fb0 = fb1 || lb0;
    ld3 = fd0 + fd1;
if(fo1 != null){
      ld3 = fo1.m3();
}
    fb0 = fb1 && lb0;
        fb0 = !fb1;
    lb0 = fd0 > fd1;
    boolean lb5 = false;
if(fo0 != null){
      ld3 = fo0.m3(lb5, fb0, fb1, lb0);
}
    fd0 = fd1 - ld3;
    Output.points[2][6] += fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
