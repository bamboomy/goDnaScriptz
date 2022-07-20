package genetic;
import java.util.ArrayList;
class Thought256 extends Thought{
private static ArrayList<Thought256> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 610.3844353778209;
private double fd1 = 437.200130756737;
private Thought fo0 = null;
private Thought fo1 = null;
Thought256 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought256 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought256 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought256 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought256 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought256 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought256 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought256 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought256 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought256 instance = new Thought256 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought256 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought256 instance = new Thought256 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought256 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought256 instance = new Thought256 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought256 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought256 instance = new Thought256 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought256 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought256 instance = new Thought256 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought256 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought256 instance = new Thought256 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought256 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought256 instance = new Thought256 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought256 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought256 instance = new Thought256 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought229.getInstance();
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    boolean lb2 = true;
    lb1 = fd1 < fd0;
if(fo0 != null){
      fo0.m1(lb2, fb0, fb1, lb1);
}
        lb2 = fb0 && fb1;
    Thought lo3 = Thought390.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
    fd1 = fd0 - fd1;
    Thought lo4 = Thought6.getInstance(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
    double ld5 = 312.64201195330946;
    ld5 = fd0 - fd1;
    lb1 = ld5 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
        lb2 = fd1 < ld5;
        if (fb0) {
            boolean lb6 = false;
if(fo1 != null){
              fd0 = fo1.m3(fd1, ld5, fd0, fd1);
}
}}
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
    Output.points[6][4] -= fd0;
    if (ab2) {
        ab3 = ab4 || fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        double ld0 = 133.7410078700071;
if(fo0 != null){
          fd0 = fo0.m3(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
        boolean lb1 = true;
        boolean lb2 = false;
        for(int i0=0; i0<10; i0++){
            lb2 = fd0 < fd1;
if(fo0 != null){
              ld0 = fo0.m3(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
            boolean lb3 = false;
            Thought lo4 = Thought95.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb3);
            fd1 = ld0 + fd0;
            Output.points[6][5] -= fd1;
            boolean lb5 = true;
            lb5 = ld0 > fd0;
            lb1 = !lb2;
            Thought lo6 = Thought183.getInstance(fo1, fo0, fo1, fo0);
            for(int i1=0; i1<10; i1++){
                fd1 *= -1;
                ab1 = ab2 && ab3;
}}}
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
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        ad1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
        boolean lb1 = true;
        ad2 = ad3 + ad4;
        for(int i1=0; i1<10; i1++){
            Thought lo2 = Thought299.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb1, lb0);
            fb0 = !fb1;
            double ld3 = 657.6669084988335;
            lb1 = lb0 && fb0;
if(fo1 != null){
              ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb1, lb1, lb0, fb0);
}
            fb1 = ld3 < ad1;
            lb1 = ad2 < ad3;
            lb0 = fb0 || fb1;
            double ld4 = 835.6443111464438;
            Thought lo5 = Thought129.getInstance(fo0, fo1, fo0, fo1, lb1, lb0, fb0, fb1);
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            if (lb1) {
                lb0 = !fb0;
if(fo1 != null){
                  fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, ld4, ad1, ad2);
}
}}}
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
    Output.points[6][6] += ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad2 *= -1;
    ad3 *= -1;
    Thought lo0 = Thought259.getInstance(ab1, ab2, ab3, ab4);
    Thought lo1 = Thought353.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ad1 + ad2;
    ab1 = ab2 && ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ad3 = ad4 + fd0;
    Output.points[6][7] += fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 - ad3;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    fb0 = !fb1;
    Output.points[6][8] += fd1;
    double ld0 = 434.2311017251569;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    double ld1 = 706.3689033281549;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fb1 = ld0 < ld1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
    boolean lb3 = true;
    lb2 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ld0, ld1, fd0, fd1, lb3, fb0, fb1, lb2);
}
    lb3 = fb0 && fb1;
    Thought lo4 = Thought8.getInstance(ao2, ao3, ao4, fo0, lb2, lb3, fb0, fb1);
    lb2 = !lb3;
if(fo1 != null){
      ld0 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fb0 = ld1 < fd0;

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
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    Thought lo1 = Thought185.getInstance();
    Thought lo2 = Thought242.getInstance(lb0, fb0, fb1, lb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    boolean lb3 = false;
    fb0 = fb1 && lb0;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, lb3, fb0, fb1, lb0);
}
    fd1 *= -1;
    lb3 = ad1 > ad2;
    fb0 = ad3 < ad4;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1);
}
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab4 = fb0 || fb1;
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
    ab2 = ab3 || ab4;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb0, ab1);
}
    fd0 = fd1 - fd0;

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
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    fb1 = ab1 && ab2;
    boolean lb0 = true;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    Output.points[7][0] -= fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 + ad1;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    boolean lb2 = true;
    lb0 = lb1 || lb2;
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 683.8848287520316;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    Thought lo2 = Thought310.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
    fd1 = ld0 + fd0;
    fd1 *= -1;
    double ld3 = 3.949786181614039;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(ld0, ld3, fd0, fd1);
}
    Output.points[7][1] += ld0;
    boolean lb4 = true;
    ld3 = fd0 + fd1;
    double ld5 = 236.93624245296007;
    lb4 = ld0 > ld3;
    boolean lb6 = true;
    ld5 = fd0 + fd1;

Thought.STACK_COUNTER++;
return lb6;
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
    boolean lb0 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
          fd1 = fo1.m3(ab4, fb0, fb1, lb0);
}
    if (ab1) {
        ab2 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        fd0 = fd1 - fd0;
}
Thought.STACK_COUNTER++;
return lb0;
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
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
    Thought lo0 = Thought200.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought386.getInstance(fo0, fo1, fo0, fo1);
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + ad1;
        fb0 = !fb1;
        ad2 *= -1;
        fb0 = fb1 || fb0;
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
    boolean lb0 = true;
if(fo0 != null){
      ab1 = fo0.m2(ad3, ad4, fd0, fd1);
}
    ab2 = ab3 && ab4;
    boolean lb1 = false;
    Thought lo2 = Thought193.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    Thought lo3 = Thought63.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
        lb1 = !ab1;
    ab2 = ab3 && ab4;
    Thought lo4 = Thought300.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, lb1, ab1, ab2);
}
    if (ab3) {
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        boolean lb5 = false;
if(fo1 != null){
          ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        ab3 = ab4 && fb0;
if(fo1 != null){
          fo1.m3();
}
        fb1 = !lb5;
        double ld6 = 561.1226681502641;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    Thought lo0 = Thought152.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
if(ao1 != null){
          ao1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        boolean lb1 = false;
        fd1 *= -1;
        Output.points[7][2] -= fd0;
        double ld2 = 133.32506915697752;
        Thought lo3 = Thought42.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4);
}
        fd0 = fd1 + ld2;
        fb1 = lb1 && fb0;
if(fo0 != null){
          fo0.m2(fd0, fd1, ld2, fd0);
}
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, fd1, ld2, fd0, fd1);
}
        fb1 = !lb1;
        if (fb0) {
if(fo0 != null){
              fo0.m3();
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
        double ld0 = 651.153130036512;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    double ld1 = 30.91145660221318;
    boolean lb2 = true;
if(ao3 != null){
      ao3.m1(ad3, ad4, fd0, fd1, fb0, fb1, lb2, fb0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb1, lb2, fb0, fb1);
}
    ld0 = ld1 + ad1;
    boolean lb3 = false;
    lb2 = ad2 > ad3;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    Output.points[7][3] += ad4;
    Thought lo4 = Thought127.getInstance(fd0, fd1, ld0, ld1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    lb3 = fb0 || fb1;
    fd0 *= -1;
    fd1 = ld0 - ld1;
    lb2 = ad1 < ad2;
    double ld5 = 665.8167327279052;
    ad2 *= -1;
if(ao2 != null){
      ao2.m2();
}
    double ld6 = 748.018433454429;
    double ld7 = 973.547745266987;
    lb3 = ad1 > ad2;
    ad3 *= -1;
    boolean lb8 = true;
    lb8 = fb0 && fb1;

Thought.STACK_COUNTER++;
return lb2;
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
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
    ab1 = fd1 > fd0;
    fd1 *= -1;
    Thought lo0 = Thought121.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    ab4 = fd0 < fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab1 = !ab2;
    double ld0 = 581.9276794676922;
if(ao1 != null){
      ld0 = ao1.m3(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2);
}
    Thought lo1 = Thought331.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
    lb2 = ad3 > ad4;
    boolean lb3 = true;
    boolean lb4 = true;
    Thought lo5 = Thought340.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1, lb3, lb4, ab1, ab2);
    boolean lb6 = false;
    ab2 = ad2 > ad3;
if(ao1 != null){
      ab3 = ao1.m2(ad4, fd0, fd1, ld0, ab4, fb0, fb1, lb2);
}
        boolean lb7 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb3, lb4, lb6, lb7);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Thought lo0 = Thought120.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    boolean lb1 = true;
    if (fb0) {
        fb1 = !lb1;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
        double ld2 = 979.6428870455467;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, fb1, lb1, fb0, fb1);
}
        boolean lb3 = false;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
    double ld0 = 316.01850111403985;
    ab2 = fd0 < fd1;
        boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ld0;
    Thought lo2 = Thought320.getInstance(fd0, fd1, ld0, fd0);
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
    ab4 = fb0 && fb1;
    ld0 = fd0 - fd1;
    double ld3 = 569.2916691717551;

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
    fb0 = ad2 > ad3;
    fb1 = fb0 && fb1;
    ad4 = fd0 + fd1;
    fb0 = fb1 && fb0;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    Output.points[7][4] += ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought66.getInstance(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    Thought lo2 = Thought322.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo0.m2();
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    double ld3 = 992.6922542652864;
    Output.points[7][5] += ad1;

Thought.STACK_COUNTER++;
return ad2;
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
    boolean lb0 = false;
    lb0 = ab1 || ab2;
        Output.points[7][6] -= ad2;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought236.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
    Thought lo2 = Thought233.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    boolean lb3 = true;
    Thought lo4 = Thought153.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
if(fo1 != null){
      fo1.m3();
}
    boolean lb5 = true;
if(fo0 != null){
      fo0.m2(lb3, lb5, ab1, ab2);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      lb0 = fo0.m2(fd1, ad1, ad2, ad3, lb3, lb5, ab1, ab2);
}
    ad4 *= -1;
    if (ab3) {
        fd0 = fd1 + ad1;
        ab4 = fb0 && fb1;
}
Thought.STACK_COUNTER++;
return ad2;
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
    Output.points[7][7] += fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd0 > fd1;
    Thought lo0 = Thought240.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    if (fb0) {
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
        boolean lb1 = true;
        fb0 = fd0 < fd1;
if(fo0 != null){
          fd0 = fo0.m3();
}
        fb1 = lb1 || fb0;
        fd1 = fd0 + fd1;
        fb1 = lb1 || fb0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3(fb0, fb1, fb0, fb1);
}
    fb0 = ad3 > ad4;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    ad4 *= -1;
    Thought lo1 = Thought115.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
    if (fb1) {
if(ao2 != null){
          lb0 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
        ad3 = ad4 - fd0;
        boolean lb2 = false;
        Output.points[7][8] -= fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ad1;
        ad2 = ad3 - ad4;
        fb0 = fd0 > fd1;
        Thought lo3 = Thought87.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
        fb1 = lb2 || lb0;
        double ld4 = 933.5039756053941;
if(ao2 != null){
          ao1 = ao2.m4();
}
        ad4 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb2, lb0);
}
        fb0 = fb1 || lb2;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    double ld0 = 714.6514822635539;
    ab4 = ld0 < fd0;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = ab1 || ab2;
    ld0 *= -1;
    fd0 = fd1 + ld0;
    ab3 = fd0 < fd1;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ad4 = fd0 + fd1;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
    ab2 = fd1 < ad1;
    ab3 = ab4 || fb0;
    ad2 = ad3 - ad4;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
    ad3 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab1 = ad4 < fd0;
    fd1 = ad1 - ad2;
    ab2 = !ab3;
    ad3 *= -1;
if(ao3 != null){
      ab4 = ao3.m2(fb0, fb1, ab1, ab2);
}
    ab3 = ad4 < fd0;
    boolean lb0 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
    boolean lb1 = true;
    ad2 *= -1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought2.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
    fb0 = fd1 > fd0;
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            fb0 = fd1 < fd0;
            fd1 *= -1;
            Output.points[8][0] += fd0;
            fb1 = fd1 > fd0;
}}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought390.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[8][1] -= fd1;
    Output.points[8][2] += fd0;
if(fo0 != null){
      fo0.m3(fb0, fb1, ab1, ab2);
}
    double ld1 = 308.826391069301;
    Thought lo2 = Thought150.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fd1 = fo1.m3(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    boolean lb3 = true;

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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought161.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[8][3] += ad2;
    Thought lo1 = Thought165.getInstance(ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    Output.points[8][4] += ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    Output.points[8][5] -= ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought94.getInstance(ad4, fd0, fd1, ad1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 || fb0;
    boolean lb3 = false;
    fb0 = fb1 || lb3;
    fd1 = ad1 + ad2;
    fb0 = fb1 && lb3;

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
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    double ld0 = 914.7486970412447;
    double ld1 = 641.9771896814711;
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    boolean lb2 = false;
    Thought lo3 = Thought373.getInstance(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    ld0 = ld1 + ad1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
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
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    double ld0 = 105.23990504377376;
    boolean lb1 = false;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    Output.points[8][6] -= fd1;
    Thought lo2 = Thought307.getInstance(fb1, lb1, fb0, fb1);
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
if(ao4 != null){
      fb0 = ao4.m2(fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb1, fb0, fb1, lb1);
}
    double ld3 = 867.4269323230313;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 > ad1;
    fb0 = !fb1;
    ad2 = ad3 - ad4;
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    Output.points[8][7] += ad3;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought17.getInstance();
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    Thought lo0 = Thought40.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    Output.points[8][8] -= fd1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(lb1, ab1, ab2, ab3);
}
    boolean lb2 = true;
    ab3 = fd1 < fd0;
    Output.points[0][0] -= fd1;
    ab4 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
}
    ab1 = !ab2;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 134.9775038849165;
        ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    ld0 *= -1;
    Thought lo1 = Thought313.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
    fb0 = ad1 > ad2;
    fb1 = ab1 && ab2;
    ab3 = ad3 < ad4;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, ad1, ad2);
}
    double ld2 = 676.8398289081646;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    Thought lo3 = Thought381.getInstance();
    boolean lb4 = false;
    fd1 = ld0 - ld2;
    ab3 = ab4 || fb0;
    boolean lb5 = false;
    Thought lo6 = Thought34.getInstance(fb0, fb1, lb4, lb5);
    ab1 = ab2 && ab3;
    ad1 *= -1;
    ad2 *= -1;
    Output.points[0][1] -= ad3;
    boolean lb7 = true;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0, fb1, lb4, lb5, lb7);
}
    ab1 = ld2 > ad1;

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
    fd1 = fd0 + fd1;
    fb0 = fb1 && fb0;
    Output.points[0][2] -= fd0;
        fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;

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
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
    boolean lb1 = false;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || lb0;
    lb1 = fb0 || fb1;
    lb0 = !lb1;

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
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought273.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    double ld1 = 639.8138224961697;
    boolean lb2 = true;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
        fd1 = ld1 - fd0;
    fb0 = fd1 < ld1;
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb2, fb0, fb1, lb2);
}
    fd1 *= -1;
    fb0 = fb1 && lb2;
if(fo1 != null){
      fo1.m2(ld1, fd0, fd1, ld1, fb0, fb1, lb2, fb0);
}
    Thought lo3 = Thought156.getInstance(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
    boolean lb4 = false;
        Thought lo5 = Thought41.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
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
}
