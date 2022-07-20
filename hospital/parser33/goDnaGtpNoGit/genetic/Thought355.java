package genetic;
import java.util.ArrayList;
class Thought355 extends Thought{
private static ArrayList<Thought355> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 580.7049999222673;
private double fd1 = 111.75565365038591;
private Thought fo0 = null;
private Thought fo1 = null;
Thought355 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought355 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought355 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought355 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought355 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought355 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought355 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought355 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought355 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought355 instance = new Thought355 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought355 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought355 instance = new Thought355 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought355 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought355 instance = new Thought355 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought355 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought355 instance = new Thought355 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought355 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought355 instance = new Thought355 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought355 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought355 instance = new Thought355 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought355 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought355 instance = new Thought355 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought355 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought355 instance = new Thought355 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd1 < fd0;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Output.points[0][7] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 < fd0;
    Thought lo0 = Thought134.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fd1 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb1 = fd0 < fd1;
    boolean lb1 = false;
    boolean lb2 = false;
    Output.points[0][8] += fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(lb1, lb2, fb0, fb1);
}
    Thought lo3 = Thought268.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
    lb1 = !lb2;
    fb0 = fb1 || lb1;
    Thought lo4 = Thought393.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    boolean lb1 = false;
    Thought lo2 = Thought335.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    Thought lo3 = Thought187.getInstance();
    lb1 = fd0 < fd1;
    ab1 = !ab2;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, ab1);
}
    boolean lb4 = false;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    Thought lo5 = Thought48.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb1, lb4, ab1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo6 = Thought221.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb4);
    ab1 = ab2 || ab3;
    fd1 *= -1;
    fd0 *= -1;
    boolean lb7 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab3 = ab4 || fb0;

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
    Output.points[1][0] += ad2;
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    double ld0 = 350.78152197495007;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb1 = ld0 > ad1;
    boolean lb1 = true;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4();
}
        lb1 = ad1 > ad2;
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
    double ld2 = 760.3222874286265;

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
    ab1 = ad2 > ad3;
    Output.points[1][1] += ad4;
    Thought lo0 = Thought7.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
    for(int i0=0; i0<10; i0++){
        fb1 = ab1 && ab2;
if(fo1 != null){
          fo1.m3(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || ab1;
        ad2 = ad3 + ad4;
        ab2 = ab3 || ab4;
        Thought lo1 = Thought44.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, ad1, ad2);
}
        boolean lb2 = false;
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
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd1 = fd0 - fd1;
    Thought lo0 = Thought254.getInstance(fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
    boolean lb1 = false;
    lb1 = fd0 > fd1;
    fb0 = fb1 && lb1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    Output.points[1][2] += fd1;
    Thought lo2 = Thought62.getInstance(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
    lb1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(lb1, fb0, fb1, lb1);
}
    double ld3 = 270.4848473885461;
    Output.points[1][3] -= ld3;
    fb0 = fb1 && lb1;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 - fd1;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    ad1 *= -1;
    double ld0 = 476.67237777165366;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 || fb0;
    double ld1 = 322.32546644359917;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    if (fb1) {
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought194.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, ab1, ab2, ab3);
}
    double ld2 = 470.3245849993367;
    ld2 = fd0 + fd1;
    ld2 = fd0 - fd1;
    ab4 = ld2 < fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m3(fd1, ld2, fd0, fd1);
}
    fb0 = ld2 < fd0;
    fb1 = !lb1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld2, fd0, fd1);
}
    ab4 = ld2 > fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
    fb0 = ld2 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(ld2, fd0, fd1, ld2, lb1, ab1, ab2, ab3);
}
    Thought lo3 = Thought308.getInstance(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb1);
    for(int i0=0; i0<10; i0++){
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab2 = ao1.m2(fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ad1 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ad2 > ad3;
    boolean lb0 = false;
    Output.points[1][4] += ad4;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
    ad3 = ad4 + fd0;
    ab1 = fd1 > ad1;
    Thought lo2 = Thought396.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);

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
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought279.getInstance(fo1, fo0, fo1, fo0);
    Thought lo1 = Thought279.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    boolean lb2 = true;
    boolean lb3 = true;
    fd1 = fd0 + fd1;
    double ld4 = 270.5086607716594;
    ld4 *= -1;

Thought.STACK_COUNTER++;
return lb3;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    if (ab1) {
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        fd1 = fd0 - fd1;
        } else if (fb1) {
        Thought lo0 = Thought116.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
        fb0 = fb1 && ab1;
        Thought lo1 = Thought299.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
        fd0 = fd1 + fd0;
        ab4 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Output.points[1][5] -= fd1;
        fd0 = fd1 - fd0;
        ab1 = fd1 < fd0;
        double ld2 = 825.8129973674697;
if(fo1 != null){
          fo1.m2(fd0, fd1, ld2, fd0);
}
        double ld3 = 133.52442794134075;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld3);
}
if(fo1 != null){
          fd0 = fo1.m3();
}
        fd1 *= -1;
        ld2 = ld3 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        Thought lo4 = Thought349.getInstance(fo0, fo1, fo0, fo1, fd1, ld2, ld3, fd0, fb1, ab1, ab2, ab3);
        ab4 = fb0 && fb1;
        Output.points[1][6] += fd1;
        ld2 *= -1;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    lb0 = fb0 || fb1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
    Output.points[1][7] += ad1;
    ad2 = ad3 + ad4;
    Thought lo1 = Thought262.getInstance();
    for(int i0=0; i0<10; i0++){
        fb1 = fd0 < fd1;
if(fo1 != null){
          lb0 = fo1.m2(fb0, fb1, lb0, fb0);
}
        fb1 = ad1 > ad2;
        boolean lb2 = true;
        boolean lb3 = true;
        if (lb2) {
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb3, lb0, fb0, fb1);
}
if(fo1 != null){
              lb2 = fo1.m2(ad1, ad2, ad3, ad4, lb3, lb0, fb0, fb1);
}
            Thought lo4 = Thought131.getInstance(fo0, fo1, fo0, fo1, lb2, lb3, lb0, fb0);
            fd0 = fd1 - ad1;
}}
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
    ab1 = ad2 < ad3;
    ab2 = !ab3;
    boolean lb0 = true;
    Output.points[1][8] -= ad4;
    fd0 *= -1;
    Thought lo1 = Thought7.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ab3 = ad3 < ad4;
    fd0 *= -1;
    fd1 = ad1 - ad2;
    ab4 = ad3 < ad4;
    Output.points[2][0] += fd0;
    Thought lo2 = Thought70.getInstance();
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        double ld3 = 818.9845656933755;
        fb1 = ad4 < fd0;
if(fo0 != null){
          lb0 = fo0.m2(fd1, ld3, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
        boolean lb4 = true;
        Output.points[2][1] += ad3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ad4 = fd0 - fd1;
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought16.getInstance(fd0, fd1, fd0, fd1);
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    double ld1 = 305.81133719911753;
    Thought lo2 = Thought331.getInstance();
    fb0 = fb1 && fb0;
    Thought lo3 = Thought340.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    Thought lo4 = Thought240.getInstance(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4);
}
    double ld0 = 387.2916619464448;
    double ld1 = 542.6882222039059;
    fb1 = !fb0;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, ld1, ad1, ad2);
}
    fb0 = ad3 < ad4;
    fb1 = !lb2;
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb3 = true;
if(ao2 != null){
      ao2.m1(lb3, fb0, fb1, lb2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1, lb3, fb0, fb1, lb2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, lb3, fb0, fb1, lb2);
}
if(fo0 != null){
      lb3 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb2, lb3);
}
        fb0 = fb1 || lb2;
    fd0 = fd1 - ld0;
    ld1 *= -1;

Thought.STACK_COUNTER++;
return lb3;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
    Thought lo0 = Thought366.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    double ld1 = 321.7329205630011;
if(ao2 != null){
      ld1 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[2][2] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, fb1, ab1, ab2, ab3);
}
    if (ab4) {
        fb0 = !fb1;
        Thought lo2 = Thought245.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
        fd0 = fd1 + ld1;
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3);
}
        fd0 = fd1 + ld1;
        fb0 = fd0 < fd1;
        ld1 = fd0 + fd1;
        ld1 = fd0 + fd1;
if(ao4 != null){
          fb1 = ao4.m2(ld1, fd0, fd1, ld1);
}
        ab1 = fd0 < fd1;
if(fo0 != null){
          ab2 = fo0.m2(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld1);
}
if(ao4 != null){
          ao4.m3();
}
        ab3 = fd0 > fd1;
        ld1 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
if(ao1 != null){
          ab2 = ao1.m2(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
        for(int i0=0; i0<10; i0++){
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    Output.points[2][3] -= fd1;
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab1 = ab2 || ab3;
    boolean lb0 = true;
    ad1 = ad2 + ad3;
    Thought lo1 = Thought8.getInstance(ad4, fd0, fd1, ad1);
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab4 = !fb0;
    double ld2 = 458.9751695362131;
if(ao1 != null){
      fd0 = ao1.m3();
}
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, ab1, ab2);
}
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, ld2, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    lb0 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fd1 = fd0 - fd1;
    double ld2 = 339.62918767494097;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ld2 = fd0 - fd1;
    double ld3 = 92.15209237626249;
    fb0 = fb1 || lb0;
    lb1 = ld2 > ld3;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld2, ld3);
}
    Thought lo4 = Thought67.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld3);
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, lb1, fb0);
}
    Thought lo5 = Thought1.getInstance(fo1, fo0, fo1, fo0, fd1, ld2, ld3, fd0, fb1, lb0, lb1, fb0);
    fd1 = ld2 - ld3;
    boolean lb6 = true;
    fb0 = fb1 && lb0;

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
    ab2 = ab3 && ab4;
    double ld0 = 999.2804404457964;
    boolean lb1 = false;
    Output.points[2][4] += fd0;
    boolean lb2 = true;
    fd1 = ld0 + fd0;
    boolean lb3 = true;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld0, fd0, fd1, fb1, lb1, lb2, lb3);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    Output.points[2][5] -= fd0;
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb2, lb3, ab1);
}
    ab2 = ab3 || ab4;
    Thought lo4 = Thought237.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, lb1, lb2);
    Output.points[2][6] += fd1;
    lb3 = !ab1;

Thought.STACK_COUNTER++;
return ld0;
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
    Thought lo0 = Thought186.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    for(int i0=0; i0<10; i0++){
        fd1 = ad1 + ad2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        if (fb1) {
            double ld1 = 426.23690241525964;
            fb0 = fd0 < fd1;
            ld1 = ad1 - ad2;
            Output.points[2][7] -= ad3;
}}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ab2 = ab3 && ab4;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = ad4 > fd0;
    boolean lb0 = false;
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, ab1);
}
    Output.points[2][8] -= ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
    ab2 = !ab3;
    double ld1 = 779.2967228335779;
    ad3 = ad4 - fd0;
    fd1 = ld1 + ad1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
    ab3 = ad3 > ad4;
    double ld2 = 753.959480909461;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab4 = fd0 < fd1;
    double ld3 = 229.05107454401133;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
}
Thought.STACK_COUNTER++;
return ld1;
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
    Output.points[3][0] += fd1;
    fb0 = fb1 || fb0;
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought346.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao4.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    fd1 *= -1;
    Output.points[3][1] += fd0;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    lb1 = !fb0;

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
    Thought lo0 = Thought339.getInstance(fb0, fb1, fb0, fb1);
    ad2 *= -1;
    ad3 = ad4 - fd0;
    fb0 = !fb1;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ad1;
    double ld1 = 553.3914101248718;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}

Thought.STACK_COUNTER++;
return ad1;
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
    ab2 = ab3 || ab4;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    double ld1 = 674.0598574641467;
    lb0 = ab1 && ab2;
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0);
}
    ab4 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fo0.m2(lb0, ab1, ab2, ab3);
}
    fd1 = ld1 - fd0;
        Thought lo2 = Thought337.getInstance(fo1, ao1, ao2, ao3, fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb0);
    Output.points[3][2] += ld1;
    ab1 = ab2 && ab3;

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
    ab1 = ad1 > ad2;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    ad1 = ad2 + ad3;
    boolean lb1 = true;
    lb1 = ad4 > fd0;
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fb1 = ad1 > ad2;
    double ld2 = 106.83855353246422;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    Thought lo3 = Thought238.getInstance(ao4, fo0, fo1, ao1, fd1, ld2, ad1, ad2);
    boolean lb4 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb5 = false;
if(ao4 != null){
      ao4.m2(lb0, lb1, lb4, lb5);
}
    Thought lo6 = Thought181.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
        fb0 = ld2 < ad1;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb1, lb0, lb1, lb4);
}
    boolean lb7 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, lb5, lb7, ab1, ab2);
}
        ab3 = ab4 && fb0;
    ld2 = ad1 - ad2;
    Output.points[3][3] += ad3;
    boolean lb8 = true;
    fb0 = ad4 > fd0;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    Thought lo0 = Thought26.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    double ld2 = 155.3769780565654;
    ld2 = fd0 + fd1;
    ld2 *= -1;
    Output.points[3][4] -= fd0;
    fd1 *= -1;
    lb1 = fb0 && fb1;
if(fo0 != null){
      lb1 = fo0.m2();
}
    ld2 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
    ld2 = fd0 - fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;
    fd0 = fd1 + ld2;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld2, fd0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;

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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
    Thought lo0 = Thought158.getInstance(ab3, ab4, fb0, fb1);
    Thought lo1 = Thought150.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
    boolean lb3 = true;
    double ld4 = 794.1673693234371;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    lb2 = lb3 && ab1;
if(fo1 != null){
      fd1 = fo1.m3(ld4, fd0, fd1, ld4);
}
    ab2 = !ab3;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld4, fd0, fd1);
}
if(fo1 != null){
      fo1.m2();
}
    boolean lb5 = false;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld4, lb3, lb5, ab1, ab2);
}

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
    Thought lo0 = Thought108.getInstance(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        fb1 = fb0 && fb1;
        ad3 = ad4 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
        boolean lb1 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
        Thought lo2 = Thought289.getInstance();
if(fo1 != null){
          lb1 = fo1.m2(fb0, fb1, lb1, fb0);
}
        ad2 = ad3 + ad4;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, lb1, fb0, fb1);
}
        ad3 = ad4 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
        ad4 = fd0 + fd1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
        ad1 = ad2 - ad3;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab1 = ad2 < ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    boolean lb0 = false;
    double ld1 = 535.8296025453398;
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    double ld0 = 173.52480349621374;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fd1 < ld0;
    fd0 *= -1;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 + fd0;
    fb1 = fd1 > ld0;
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
    fb0 = fd0 < fd1;
    ld0 *= -1;
    Output.points[3][5] += fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fb0 = !fb1;
    fd1 = ld0 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
    Output.points[3][6] -= ld0;
if(ao1 != null){
      ao1.m3();
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought296.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 < ad1;
    if (fb0) {
        } else if (fb1) {
        fb0 = ad2 > ad3;
        fb1 = ad4 < fd0;
        boolean lb1 = false;
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fd1 = fo1.m3(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
if(ao1 != null){
              ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
}
            Output.points[3][7] += fd0;
if(fo1 != null){
              fo1.m3(ao1, ao2, ao3, ao4);
}
            fb1 = lb1 && fb0;
            double ld2 = 124.38736527518519;
            fb1 = lb1 && fb0;
            Thought lo3 = Thought294.getInstance(fd0, fd1, ld2, ad1);
            ad2 = ad3 - ad4;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld2, ad1);
}
            double ld4 = 29.64538836188867;
            double ld5 = 755.6273862441674;
if(fo1 != null){
              fo0 = fo1.m4();
}
            fb1 = !lb1;
            fb0 = fb1 && lb1;
            ld5 = ad1 - ad2;
            ad3 = ad4 + fd0;
}}
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
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
if(ao2 != null){
      ao2.m3(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    double ld0 = 942.8267082176847;
    ab2 = !ab3;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
    ld0 *= -1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(ao2 != null){
          ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
    boolean lb0 = false;
    double ld1 = 288.19050424444146;
    ld1 = ad1 + ad2;
    ab4 = ad3 < ad4;
    fb0 = fd0 > fd1;
        for(int i0=0; i0<10; i0++){
        fb1 = !lb0;
if(ao1 != null){
          ao1.m1(ld1, ad1, ad2, ad3);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld1);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
          ao4.m3(ab1, ab2, ab3, ab4);
}
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
    fb1 = !fb0;
    double ld0 = 692.3364068179367;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
    double ld1 = 792.556164261965;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld0;
    double ld2 = 604.8864894867637;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb3 = true;
    boolean lb4 = false;
if(fo1 != null){
      fo1.m1(ld1, ld2, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, ld2, fd0);
}
    lb3 = lb4 && fb0;
    Thought lo5 = Thought111.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb3, lb4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ld2, fb1, lb3, lb4, fb0);
}
    fb1 = !lb3;
    double ld6 = 337.3208310688504;
    boolean lb7 = false;
    boolean lb8 = true;
    Thought lo9 = Thought17.getInstance(ld6, fd0, fd1, ld0, lb4, lb7, lb8, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb3, lb4, lb7);
}
    double ld10 = 46.630290418614386;
    double ld11 = 319.71677141317116;

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
    fd1 = fd0 + fd1;
    Output.points[3][8] -= fd0;
    fd1 *= -1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld1 = 151.3589709186028;
if(fo0 != null){
      fb0 = fo0.m2(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    double ld2 = 630.4285870981047;
    Thought lo3 = Thought181.getInstance();

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
    fd0 *= -1;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
    fb0 = !fb1;
    lb0 = fd0 < fd1;
    fb0 = fb1 && lb0;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
    fd0 = fd1 + fd0;
    boolean lb2 = true;

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
